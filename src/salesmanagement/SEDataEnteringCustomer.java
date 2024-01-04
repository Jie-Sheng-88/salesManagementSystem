package salesmanagement;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SEDataEnteringCustomer extends javax.swing.JFrame {

    private String employeeID;
    private int counter;

    public SEDataEnteringCustomer(String employeeID) {
        initComponents();
        this.employeeID = employeeID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        postcode = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtPhoneNum = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        btnAddData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CustomerInformation = new javax.swing.JLabel();
        LeCars = new javax.swing.JLabel();
        JavaRides = new javax.swing.JLabel();
        since2004 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 159, 31, -1));

        customerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerName.setText("Customer Name:");
        getContentPane().add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 160, 40));

        postcode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        postcode.setText("Postcode:");
        getContentPane().add(postcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 90, 40));

        phoneNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneNumber.setText("Phone Number:");
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 150, 40));

        txtCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 155, 170, 30));

        txtPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 205, 170, 30));

        txtPostcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPostcodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtPostcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 255, 170, 30));

        btnAddData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddData.setText("Add Data");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 490, 390));

        CustomerInformation.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        CustomerInformation.setText("Customer Information");
        getContentPane().add(CustomerInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        LeCars.setFont(new java.awt.Font("Freestyle Script", 0, 50)); // NOI18N
        LeCars.setText(" LeCars");
        getContentPane().add(LeCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 110, -1));

        JavaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        JavaRides.setText("JavaRides");
        getContentPane().add(JavaRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2004.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2004.setText("-- SINCE 2004 --");
        getContentPane().add(since2004, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/1.png"))); // NOI18N
        background.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                backgroundComponentRemoved(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        setSize(new java.awt.Dimension(913, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustNameActionPerformed

    private void txtPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumActionPerformed

    private void txtPostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPostcodeActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed

        String filePath = "src//cust.csv";
        if (txtCustName.getText().equals("") || txtPhoneNum.getText().equals("") || txtPostcode.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter All Data!");
        } else if (!custNameCheckValidate(txtCustName.getText()) || !phoneNumberCheckValidate(txtPhoneNum.getText()) || !postcodeCheckValidate(txtPostcode.getText())) {
            JOptionPane.showMessageDialog(null, "*Please follow the correct format:\n"
                    + "Customer Name: You must at least 1 capital letter and small letter.\n"
                    + "Phone Number: You must enter 10/11 digit numbers.\n"
                    + "Postcode: You must enter 5 digits.");
        } else {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                String input;
                int count = 0;
                while ((input = bufferedReader.readLine()) != null) {
                    this.counter = ++count;
                }
            } catch (IOException ex) {
                Logger.getLogger(DataEnteringSales.class.getName()).log(Level.SEVERE, null, ex);
            }
            String id = "C" + String.format("%04d", counter);

            String data[] = {id, txtCustName.getText(), txtPhoneNum.getText(), txtPostcode.getText()};
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);

            try {
                FileWriter e = new FileWriter(filePath, true);
                CSVWriter csv = new CSVWriter(e, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                csv.writeNext(data);
                csv.close();
                e.close();

            } catch (IOException ex) {
                Logger.getLogger(DataEnteringSales.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Customer Name: " + txtCustName.getText() + "\n" + "Phone number: " + txtPhoneNum.getText() + "\n" + "Postcode: " + txtPostcode.getText() + "\n" + "Add Data Successfully!");

            txtCustName.setText("");
            txtPhoneNum.setText("");
            txtPostcode.setText("");

        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void backgroundComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_backgroundComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundComponentRemoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InfoViewSales infoViewSales = new InfoViewSales(this.employeeID);
        infoViewSales.InfoViewSales();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean custNameCheckValidate(String txtInput) {
        return txtInput.matches("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$");
    }

    private boolean phoneNumberCheckValidate(String txtInput) {
        return txtInput.matches("[0-9]{10,11}");
    }

    private boolean postcodeCheckValidate(String txtInput) {
        return txtInput.matches("[0-9]{5}");
    }

    public void SEDataEnteringCustomer() {

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
            java.util.logging.Logger.getLogger(SEDataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEDataEnteringCustomer(employeeID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerInformation;
    private javax.swing.JLabel JavaRides;
    private javax.swing.JLabel LeCars;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAddData;
    private javax.swing.JLabel customerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel postcode;
    private javax.swing.JLabel since2004;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtPostcode;
    // End of variables declaration//GEN-END:variables
}
