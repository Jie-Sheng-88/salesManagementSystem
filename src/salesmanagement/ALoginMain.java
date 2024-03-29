package salesmanagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ALoginMain extends javax.swing.JFrame {

    private String userID;

    public ALoginMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        since2004 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterId = new javax.swing.JTextField();
        enterPassword = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        javaRides = new javax.swing.JLabel();
        since2005 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        since2004.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2004.setText("-- SINCE 2004 --");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        enterId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterIdActionPerformed(evt);
            }
        });
        getContentPane().add(enterId, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 230, 30));

        enterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(enterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 230, 30));

        LoginBtn.setBackground(new java.awt.Color(204, 0, 0));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 0, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" LeCars");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, 30));

        jLabel6.setFont(new java.awt.Font("Freestyle Script", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" LeCars");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 507, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome Back!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        javaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        javaRides.setForeground(new java.awt.Color(255, 255, 255));
        javaRides.setText("JavaRides");
        getContentPane().add(javaRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2005.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2005.setForeground(new java.awt.Color(255, 255, 255));
        since2005.setText("-- SINCE 2004 --");
        getContentPane().add(since2005, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/loginpage.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        setSize(new java.awt.Dimension(914, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPasswordActionPerformed

    private void enterIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Register register = new Register();
        register.Register();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        String username = enterId.getText();
        String password = enterPassword.getText();
        setuserID(username);

        if (login_1.check(username, password)) {
            try {
                writeUsernameToFile(username);
                viewinfo userInfo = new viewinfo(username);
                if (userInfo.getStatus().equals("1")) {
                    InfoViewManagement managementEmployeeWindow = new InfoViewManagement(this.userID);
                    managementEmployeeWindow.setVisible(true);
                    dispose();
                } else if (userInfo.getStatus().equals("0")) {
                    InfoViewSales salesEmployeeWindow = new InfoViewSales(this.userID);
                    salesEmployeeWindow.setVisible(true);
                    dispose();
                } else {

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_LoginBtnActionPerformed
    private void writeUsernameToFile(String username) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\username.txt"))) {
            writer.write(username);
        }
    }

    public String getuserID() {
        return userID;
    }

    public void setuserID(String userID) {
        this.userID = userID;
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ALoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField enterId;
    private javax.swing.JTextField enterPassword;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel javaRides;
    private javax.swing.JLabel since2004;
    private javax.swing.JLabel since2005;
    // End of variables declaration//GEN-END:variables
}
