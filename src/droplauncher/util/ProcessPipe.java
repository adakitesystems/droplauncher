package droplauncher.util;

import adakite.util.AdakiteUtils;
import droplauncher.mvc.view.ConsoleOutput;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Generic class for handling communication between the main program and
 * a process.
 */
public class ProcessPipe {

  private static final Logger LOGGER = LogManager.getLogger();

  public static final double DEFAULT_READ_TIMEOUT = (double)0.25; /* seconds */

  private Path path;
  private String[] args;
  private Process process;
  private InputStream is;
  private BufferedReader br; /* read from process */
  private OutputStream os;
  private BufferedWriter bw; /* write to process */
  private StreamGobbler gobblerStdout;
  private StreamGobbler gobblerStderr;
  private boolean isOpen;

  private ConsoleOutput consoleOutput;

  public ProcessPipe() {
    this.path = null;
    this.args = null;
    this.process = null;
    this.is = null;
    this.br = null;
    this.os = null;
    this.bw = null;
    this.gobblerStdout = null;
    this.gobblerStderr = null;
    this.isOpen = false;

    this.consoleOutput = null;
  }

  public void setConsoleOutput(ConsoleOutput co) {
    this.consoleOutput = co;
  }

  public boolean isOpen() {
    return this.isOpen;
  }

  //TODO: Change return type to void and throw exceptions where required.
  /**
   * Open a pipe to the specified program.
   *
   * @param path specified program
   * @param args arguments to include during invocation
   * @param cwd current working directory
   * @return
   *     true if pipe was opened successfully,
   *     otherwise false
   */
  public boolean open(Path path, String[] args, String cwd, String streamName) {
    if (path == null) {
      LOGGER.warn("path is null");
      return false;
    }

    try {
      String[] command;
      if (args == null) {
        command = new String[1];
      } else {
        this.args = Arrays.copyOf(args, args.length);
        command = new String[this.args.length + 1];
        System.arraycopy(this.args, 0, command, 1, this.args.length);
      }

      this.path = path;
      command[0] = this.path.toString();
      if (!AdakiteUtils.isNullOrEmpty(cwd)) {
        /* Set current working directory for the new process. */
        ProcessBuilder pb = new ProcessBuilder(command);
        pb.directory(Paths.get(cwd).toFile());
        this.process = pb.start();
      } else {
        this.process = new ProcessBuilder(command).start();
      }

      this.is = this.process.getInputStream();
      this.br = new BufferedReader(new InputStreamReader(this.is));
      this.gobblerStdout = new StreamGobbler(streamName, this.process.getInputStream(), this.consoleOutput);
      this.gobblerStderr = new StreamGobbler(streamName, this.process.getErrorStream(), this.consoleOutput);
      this.gobblerStdout.start();
      this.gobblerStderr.start();

      this.os = this.process.getOutputStream();
      this.bw = new BufferedWriter(new OutputStreamWriter(this.os));

      this.isOpen = true;

      return true;
    } catch (Exception ex) {
      LOGGER.error(ex);
    }

    this.isOpen = false;

    return false;
  }

  //TODO: Change return type to void and throw exceptions where required.
  /**
   * Closes the pipe and destroys the process.
   *
   * @return
   *     true if all pipe-related objects were closed and no errors
   *         were encountered,
   *     otherwise false
   */
  public boolean close() {
    this.isOpen = false;
    try {
      if (this.br != null && this.is != null
          && this.bw != null && this.os != null
          && this.process != null && this.process.isAlive()) {
        this.gobblerStderr.interrupt();
        this.gobblerStdout.interrupt();
        this.br.close();
        this.is.close();
        this.bw.close();
        this.os.close();
      }
      this.process.destroy();
      return true;
    } catch (Exception ex) {
      LOGGER.error(ex);
    }
    return false;
  }

}
