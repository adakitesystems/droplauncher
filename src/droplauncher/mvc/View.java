package droplauncher.mvc;

import droplauncher.util.Constants;
import filedrop.FileDrop;
import java.io.File;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class View extends JFrame {

  private static final Logger LOGGER = Logger.getLogger(View.class.getName());
  private static final boolean CLASS_DEBUG = (Constants.DEBUG && true);

  private Controller controller;

  public View() {
    /* Set the Nimbus look and feel for the form. */
    try {
      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (Exception ex) {
      if (CLASS_DEBUG) {
        LOGGER.log(Constants.DEFAULT_LOG_LEVEL, null, ex);
      }
    }

    initComponents();

    /* Form settings */
    setTitle(Constants.PROGRAM_NAME);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);

    FileDrop.Listener fileDropListener = new FileDropListener(this);
    new FileDrop(this.boxDropFiles, fileDropListener);
  }

  /* ************************************************************ */
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor in NetBeans.
   */
  /* ************************************************************ */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btngrpRace = new javax.swing.ButtonGroup();
    boxDropFiles = new javax.swing.JLabel();
    btnLaunch = new javax.swing.JButton();
    rbRaceTerran = new javax.swing.JRadioButton();
    rbRaceZerg = new javax.swing.JRadioButton();
    rbRaceProtoss = new javax.swing.JRadioButton();
    rbRaceRandom = new javax.swing.JRadioButton();
    txtBotName = new javax.swing.JTextField();
    lblBotName = new javax.swing.JLabel();
    lblBwapiDll = new javax.swing.JLabel();
    lblBwapiDllVersion = new javax.swing.JLabel();
    lblBotFile = new javax.swing.JLabel();
    lblBwapiDllText = new javax.swing.JLabel();
    lblBwapiDllVersionText = new javax.swing.JLabel();
    lblBotFileText = new javax.swing.JLabel();
    lblStarCraftExe = new javax.swing.JLabel();
    txtStarcraftExe = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    boxDropFiles.setBackground(new java.awt.Color(0, 53, 137));
    boxDropFiles.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
    boxDropFiles.setForeground(new java.awt.Color(204, 204, 204));
    boxDropFiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    boxDropFiles.setText("Drop bot files here");
    boxDropFiles.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    boxDropFiles.setOpaque(true);

    btnLaunch.setText("Launch");
    btnLaunch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLaunchActionPerformed(evt);
      }
    });

    btngrpRace.add(rbRaceTerran);
    rbRaceTerran.setText("Terran");
    rbRaceTerran.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rbRaceTerranActionPerformed(evt);
      }
    });

    btngrpRace.add(rbRaceZerg);
    rbRaceZerg.setText("Zerg");
    rbRaceZerg.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rbRaceZergActionPerformed(evt);
      }
    });

    btngrpRace.add(rbRaceProtoss);
    rbRaceProtoss.setText("Protoss");
    rbRaceProtoss.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rbRaceProtossActionPerformed(evt);
      }
    });

    btngrpRace.add(rbRaceRandom);
    rbRaceRandom.setText("Random");
    rbRaceRandom.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rbRaceRandomActionPerformed(evt);
      }
    });

    txtBotName.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtBotNameKeyPressed(evt);
      }
      public void keyReleased(java.awt.event.KeyEvent evt) {
        txtBotNameKeyReleased(evt);
      }
    });

    lblBotName.setText(" Bot name (max 24 characters):");

    lblBwapiDll.setText("BWAPI.dll:");

    lblBwapiDllVersion.setText("BWAPI Version:");

    lblBotFile.setText("Bot file:");

    lblBwapiDllText.setText(" ");

    lblBwapiDllVersionText.setText(" ");

    lblBotFileText.setText(" ");

    lblStarCraftExe.setText("StarCraft.exe:");

    txtStarcraftExe.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        txtStarcraftExeMousePressed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(261, 261, 261)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(rbRaceTerran)
              .addComponent(rbRaceZerg))
            .addGap(44, 44, 44)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(rbRaceRandom)
              .addComponent(rbRaceProtoss))
            .addContainerGap(28, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(boxDropFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(btnLaunch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtBotName)
                  .addComponent(lblBotName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBwapiDll, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(lblBotFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(lblBwapiDllVersion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                  .addComponent(lblStarCraftExe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(lblBwapiDllText, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                  .addComponent(lblBotFileText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(lblBwapiDllVersionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(txtStarcraftExe, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblStarCraftExe)
          .addComponent(txtStarcraftExe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblBwapiDll)
          .addComponent(lblBwapiDllText))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblBwapiDllVersion)
          .addComponent(lblBwapiDllVersionText))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblBotFile)
          .addComponent(lblBotFileText))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lblBotName)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtBotName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(rbRaceProtoss)
              .addComponent(rbRaceTerran))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(rbRaceZerg)
              .addComponent(rbRaceRandom))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLaunch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(boxDropFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(7, 7, 7))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  /* ************************************************************ */

  public void setController(Controller controller) {
    this.controller = controller;
  }

  /* ************************************************************ */
  /* Events from Controller */
  /* ************************************************************ */

  public int showFileChooser(JFileChooser fc) {
    return fc.showOpenDialog(this);
  }

  /* ************************************************************ */

  /* ************************************************************ */
  /* Events to Controller */
  /* ************************************************************ */

  private void btnLaunchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaunchActionPerformed
    this.controller.btnLaunchActionPerformed(evt);
  }//GEN-LAST:event_btnLaunchActionPerformed

  private void rbRaceTerranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRaceTerranActionPerformed
    this.controller.rbRaceTerranActionPerformed(evt);
  }//GEN-LAST:event_rbRaceTerranActionPerformed

  private void rbRaceProtossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRaceProtossActionPerformed
    this.controller.rbRaceProtossActionPerformed(evt);
  }//GEN-LAST:event_rbRaceProtossActionPerformed

  private void rbRaceRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRaceRandomActionPerformed
    this.controller.rbRaceRandomActionPerformed(evt);
  }//GEN-LAST:event_rbRaceRandomActionPerformed

  private void rbRaceZergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRaceZergActionPerformed
    this.controller.rbRaceZergActionPerformed(evt);
  }//GEN-LAST:event_rbRaceZergActionPerformed

  private void txtBotNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBotNameKeyReleased
    this.controller.txtBotNameKeyReleased(evt);
  }//GEN-LAST:event_txtBotNameKeyReleased

  private void txtStarcraftExeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStarcraftExeMousePressed
    this.controller.txtStarcraftExeMousePressed(evt);
  }//GEN-LAST:event_txtStarcraftExeMousePressed

  private void txtBotNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBotNameKeyPressed
    this.controller.txtBotNameKeyPressed(evt);
  }//GEN-LAST:event_txtBotNameKeyPressed

  public void filesDropped(File[] files) {
    this.controller.filesDropped(files);
  }

  /* ************************************************************ */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel boxDropFiles;
  private javax.swing.JButton btnLaunch;
  private javax.swing.ButtonGroup btngrpRace;
  private javax.swing.JLabel lblBotFile;
  private javax.swing.JLabel lblBotFileText;
  private javax.swing.JLabel lblBotName;
  private javax.swing.JLabel lblBwapiDll;
  private javax.swing.JLabel lblBwapiDllText;
  private javax.swing.JLabel lblBwapiDllVersion;
  private javax.swing.JLabel lblBwapiDllVersionText;
  private javax.swing.JLabel lblStarCraftExe;
  private javax.swing.JRadioButton rbRaceProtoss;
  private javax.swing.JRadioButton rbRaceRandom;
  private javax.swing.JRadioButton rbRaceTerran;
  private javax.swing.JRadioButton rbRaceZerg;
  private javax.swing.JTextField txtBotName;
  private javax.swing.JTextField txtStarcraftExe;
  // End of variables declaration//GEN-END:variables

}
