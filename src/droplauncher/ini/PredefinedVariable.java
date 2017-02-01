package droplauncher.ini;

/**
 * Enum for INI keys related to this program.
 */
public enum PredefinedVariable {

  JAVA_EXE("java_exe")
  ;

  private String str;

  private PredefinedVariable(String str) {
    this.str = str;
  }

  @Override
  public String toString() {
    return this.str;
  }

}