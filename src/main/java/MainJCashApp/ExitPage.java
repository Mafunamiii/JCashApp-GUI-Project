package MainJCashApp;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author "Jahnreil J. Amarillento"
 */
public class ExitPage extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public ExitPage() {
        initComponents();
        setIconLogo();
        
        
    }

    BankAccounts accs = new BankAccounts();
    private int enteredAmount;
    
    public void setIconLogo() {
            setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/java/Resources/JCash1.png"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuPanel = new javax.swing.JPanel();
        mainMenuTitlePanel = new javax.swing.JPanel();
        jCashLogoMM = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        southSpacerPanel = new javax.swing.JPanel();
        westSpacerPanel = new javax.swing.JPanel();
        eastSpacerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 832));

        mainMenuPanel.setBackground(new java.awt.Color(45, 36, 36));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(650, 250));

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(mainMenuPanel, java.awt.BorderLayout.CENTER);

        mainMenuTitlePanel.setBackground(new java.awt.Color(45, 36, 36));
        mainMenuTitlePanel.setMinimumSize(new java.awt.Dimension(300, 300));
        mainMenuTitlePanel.setLayout(new java.awt.BorderLayout());

        jCashLogoMM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCashLogoMM.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/730396842197778485/1022840337212911666/JCashLogoFull.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        mainMenuTitlePanel.add(jCashLogoMM, java.awt.BorderLayout.NORTH);

        titleLabel1.setBackground(new java.awt.Color(45, 36, 36));
        titleLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(224, 192, 151));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.setText("Transaction Completed");
        titleLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        mainMenuTitlePanel.add(titleLabel1, java.awt.BorderLayout.CENTER);

        titleLabel.setBackground(new java.awt.Color(45, 36, 36));
        titleLabel.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(224, 192, 151));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Thank you for using JCash!");
        titleLabel.setPreferredSize(new java.awt.Dimension(100, 100));
        mainMenuTitlePanel.add(titleLabel, java.awt.BorderLayout.SOUTH);

        getContentPane().add(mainMenuTitlePanel, java.awt.BorderLayout.NORTH);

        southSpacerPanel.setBackground(new java.awt.Color(184, 92, 56));

        javax.swing.GroupLayout southSpacerPanelLayout = new javax.swing.GroupLayout(southSpacerPanel);
        southSpacerPanel.setLayout(southSpacerPanelLayout);
        southSpacerPanelLayout.setHorizontalGroup(
            southSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        southSpacerPanelLayout.setVerticalGroup(
            southSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        getContentPane().add(southSpacerPanel, java.awt.BorderLayout.PAGE_END);

        westSpacerPanel.setBackground(new java.awt.Color(45, 36, 36));

        javax.swing.GroupLayout westSpacerPanelLayout = new javax.swing.GroupLayout(westSpacerPanel);
        westSpacerPanel.setLayout(westSpacerPanelLayout);
        westSpacerPanelLayout.setHorizontalGroup(
            westSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        westSpacerPanelLayout.setVerticalGroup(
            westSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(westSpacerPanel, java.awt.BorderLayout.LINE_END);

        eastSpacerPanel.setBackground(new java.awt.Color(45, 36, 36));

        javax.swing.GroupLayout eastSpacerPanelLayout = new javax.swing.GroupLayout(eastSpacerPanel);
        eastSpacerPanel.setLayout(eastSpacerPanelLayout);
        eastSpacerPanelLayout.setHorizontalGroup(
            eastSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        eastSpacerPanelLayout.setVerticalGroup(
            eastSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(eastSpacerPanel, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExitPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExitPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eastSpacerPanel;
    private javax.swing.JLabel jCashLogoMM;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JPanel mainMenuTitlePanel;
    private javax.swing.JPanel southSpacerPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JPanel westSpacerPanel;
    // End of variables declaration//GEN-END:variables
}