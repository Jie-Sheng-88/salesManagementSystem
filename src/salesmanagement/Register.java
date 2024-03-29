package salesmanagement;

import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        javaRides = new javax.swing.JLabel();
        since2005 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        javaRides1 = new javax.swing.JLabel();
        since2006 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enterName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        enterSecretKey = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        enterPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 0, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" LeCars");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome Back!");

        javaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        javaRides.setForeground(new java.awt.Color(255, 255, 255));
        javaRides.setText("JavaRides");

        since2005.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2005.setForeground(new java.awt.Color(255, 255, 255));
        since2005.setText("-- SINCE 2004 --");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("NAME");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Freestyle Script", 0, 100)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" LeCars");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Welcome Back!");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        javaRides1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        javaRides1.setForeground(new java.awt.Color(255, 255, 255));
        javaRides1.setText("JavaRides");
        getContentPane().add(javaRides1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2006.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2006.setForeground(new java.awt.Color(255, 255, 255));
        since2006.setText("-- SINCE 2004 --");
        getContentPane().add(since2006, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Register");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("NAME");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        enterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterNameActionPerformed(evt);
            }
        });
        getContentPane().add(enterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 230, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("SECRET KEY");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        enterSecretKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterSecretKeyActionPerformed(evt);
            }
        });
        getContentPane().add(enterSecretKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 230, 30));

        registerButton.setBackground(new java.awt.Color(204, 0, 0));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, 30));

        enterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(enterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 230, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("PASSWORD");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Freestyle Script", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" LeCars");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 455, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back to login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/registerpage.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        setSize(new java.awt.Dimension(914, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void enterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterNameActionPerformed

    private void enterSecretKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterSecretKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterSecretKeyActionPerformed

    private void enterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterPasswordActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ALoginMain.main(new String[]{});
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        // Get input values from the text fields
    String name = enterName.getText();
    String password = enterPassword.getText();
    String secretKey = enterSecretKey.getText();

    // Check if the secret key is correct
    if (!secretKey.equals(registeration.secretKey)) {
        // Display an error message or handle the incorrect key situation
        JOptionPane.showMessageDialog(this, "Secret key is incorrect. Registration process aborted and program will be terminated !", "Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        return;
    }

    // Create an instance of the registeration class
    registeration registrationInstance = new registeration(name, password);

    // Call the addToCsv method to add the user to the CSV file and get the new ID
    String newId = registrationInstance.addToCsv();

    if (newId != null) {
        // Display a success message
        JOptionPane.showMessageDialog(this, "Registration successful!\nYour ID is: " + newId, "Success", JOptionPane.INFORMATION_MESSAGE);

        // Navigate to the login page
        ALoginMain.main(new String[]{});

        // Close the current registration frame
        dispose();
    } else {
        // Handle the case where the new ID is null (registration failed)
        JOptionPane.showMessageDialog(this, "Registration failed. Unable to generate a new ID.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_registerButtonActionPerformed

    public static void Register() {
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField enterName;
    private javax.swing.JTextField enterPassword;
    private javax.swing.JTextField enterSecretKey;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel javaRides;
    private javax.swing.JLabel javaRides1;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel since2005;
    private javax.swing.JLabel since2006;
    // End of variables declaration//GEN-END:variables
}
