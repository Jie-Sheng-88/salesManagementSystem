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

public class DataEnteringCustomer extends javax.swing.JFrame {

    private String employeeID;
    private int counter;

    public DataEnteringCustomer(String employeeID) {
        this.employeeID = employeeID;
        initComponents();
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
        btnInportDataFromCSV = new javax.swing.JButton();
        search = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CustomerInformation = new javax.swing.JLabel();
        LeCars = new javax.swing.JLabel();
        JavaRides = new javax.swing.JLabel();
        since2004 = new javax.swing.JLabel();
        btnSearchData = new javax.swing.JButton();
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

        btnInportDataFromCSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInportDataFromCSV.setText("Import Data from CSV");
        btnInportDataFromCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInportDataFromCSVActionPerformed(evt);
            }
        });
        getContentPane().add(btnInportDataFromCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("Search:");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 70, 27));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 180, 30));

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

        btnSearchData.setText("Search Data");
        btnSearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

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
                    this.counter = count++;
                }
            } catch (IOException ex) {
                Logger.getLogger(DataEnteringSales.class.getName()).log(Level.SEVERE, null, ex);
            }
            String id = "C" + String.format("%04d", counter++);

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
            JOptionPane.showMessageDialog(this, "Add Data Successfully!");

            txtCustName.setText("");
            txtPhoneNum.setText("");
            txtPostcode.setText("");

        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnInportDataFromCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInportDataFromCSVActionPerformed
        String filePath = "src//cust.csv";
        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();

            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
            dm.getDataVector().removeAllElements();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        } catch (IOException ex) {
            Logger.getLogger(DataEnteringCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInportDataFromCSVActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void backgroundComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_backgroundComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundComponentRemoved

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchTerm = txtSearch.getText();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<>(table);
        jTable1.setRowSorter(sort);

        if (searchTerm.length() == 0) {
            sort.setRowFilter(null);
        } else {
            sort.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(searchTerm)));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDataActionPerformed
        // TODO add your handling code here:
        SearchCustomer searchCustomer = new SearchCustomer();
        searchCustomer.SearchCustomer();
    }//GEN-LAST:event_btnSearchDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InfoViewManagement infoViewManagement = new InfoViewManagement(this.employeeID);
        infoViewManagement.InfoViewManagement();
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

    public void CustomerDataEntering() {
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
            java.util.logging.Logger.getLogger(DataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEnteringCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEnteringCustomer(employeeID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerInformation;
    private javax.swing.JLabel JavaRides;
    private javax.swing.JLabel LeCars;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnInportDataFromCSV;
    private javax.swing.JButton btnSearchData;
    private javax.swing.JLabel customerName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel postcode;
    private javax.swing.JLabel search;
    private javax.swing.JLabel since2004;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
