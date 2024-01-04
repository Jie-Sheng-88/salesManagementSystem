package salesmanagement;

import javax.swing.JOptionPane;
import com.opencsv.CSVWriter;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static salesmanagement.ReadFile.data;

public class DataEnteringEmployee extends javax.swing.JFrame {

    private String employeeID;
    private String empStatus;

    public DataEnteringEmployee(String employeeID) {
        initComponents();
        this.employeeID = employeeID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmpID = new javax.swing.JTextField();
        txtEmpName = new javax.swing.JTextField();
        employeeId = new javax.swing.JLabel();
        employeeName = new javax.swing.JLabel();
        employeeStatus = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAddData = new javax.swing.JButton();
        btnImportDataFromCSV = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        employeeInformation = new javax.swing.JLabel();
        leCars = new javax.swing.JLabel();
        javaRides = new javax.swing.JLabel();
        since2004 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSearchData = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 170, 30));

        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 170, 30));

        employeeId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeId.setText("Employee ID:");
        getContentPane().add(employeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        employeeName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeName.setText("Employee Name:");
        getContentPane().add(employeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        employeeStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employeeStatus.setText("Employee Status:");
        getContentPane().add(employeeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setText("Password:");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 170, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 490, 390));

        btnAddData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddData.setText("Add Data");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        btnImportDataFromCSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImportDataFromCSV.setText("Import Data from CSV");
        btnImportDataFromCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportDataFromCSVActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportDataFromCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

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

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("Search:");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 70, 27));

        employeeInformation.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        employeeInformation.setText("Employee Information");
        getContentPane().add(employeeInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        leCars.setFont(new java.awt.Font("Freestyle Script", 0, 50)); // NOI18N
        leCars.setText(" LeCars");
        getContentPane().add(leCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 110, -1));

        javaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        javaRides.setText("JavaRides");
        getContentPane().add(javaRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2004.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2004.setText("--SINCE 2004--");
        getContentPane().add(since2004, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales Employee", "Management Level Employee" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 170, 30));

        btnSearchData.setText("Search Data");
        btnSearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        setSize(new java.awt.Dimension(914, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        // TODO add your handling code here:
        String filePath = "src//employee.csv";
        if (txtEmpID.getText().equals("") || txtEmpName.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter All Data!");
        } else if (!EmpIDCheckValidate(txtEmpID.getText()) || !EmpNameCheckValidate(txtEmpName.getText()) || EmpStatusCheckValidate(empStatus) || !EmpPasswordCheckValidate(txtPassword.getText())) {
            JOptionPane.showMessageDialog(null, "*Please follow the correct format:\n"
                    + "Employee ID: You must have enter \"E\" and 4 digit numbers.\n"
                    + "Employee Name: You must enter at least 1 capital letter and 1 small letter.\n"
                    + "Employee Status: You must choose at least 1 from the dropdown menu.\n"
                    + "Employee Password: You must enter at least 1 letter and 1 small letter (must 6 characters).\n");
        } else {

            String data[] = {txtEmpID.getText(), txtEmpName.getText(), empStatus, txtPassword.getText()};
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            try {
                FileWriter v = new FileWriter(filePath, true);
                CSVWriter csv = new CSVWriter(v, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                csv.writeNext(data);
                csv.close();
                v.close();
            } catch (IOException ex) {
                Logger.getLogger(DataEnteringVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Add Data Successfully!");

            txtEmpID.setText("");
            txtEmpName.setText("");
            txtEmpName.setText("");
            txtPassword.setText("");

        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnImportDataFromCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportDataFromCSVActionPerformed
        // TODO add your handling code here:
        String filePath = "src//employee.csv";
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
    }//GEN-LAST:event_btnImportDataFromCSVActionPerformed
    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIDActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String searchTerm = txtSearch.getText();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sort = new TableRowSorter<>(table);
        jTable1.setRowSorter(sort);

        if (searchTerm.length() == 0) {
            sort.setRowFilter(null); // If the text is empty, show all rows
        } else {
            sort.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(searchTerm)));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDataActionPerformed
        // TODO add your handling code here:
        SearchEmployee searchEmployee = new SearchEmployee();
        searchEmployee.SearchEmployee();
    }//GEN-LAST:event_btnSearchDataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        InfoViewManagement infoViewManagement = new InfoViewManagement(this.employeeID);
        infoViewManagement.InfoViewManagement();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedValue = jComboBox1.getSelectedItem().toString();
        if (selectedValue.equals("Sales Employee")) {
            this.empStatus = "0";
        } else if (selectedValue.equals("Management Level Employee")) {
            this.empStatus = "1";
        } else {
            this.empStatus = "null";
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private String generateNewSalesID(Object[] tableLines) {
        if (tableLines.length > 0) {
            // Get the last entry from tableLines
            String lastEntry = tableLines[tableLines.length - 1].toString();

            // Split the last entry to get the salesID
            String[] parts = lastEntry.split(",");
            String lastSalesID = parts[0];

            // Extract the numeric part of the salesID and increment it
            int numericPart = Integer.parseInt(lastSalesID.substring(1));
            numericPart++;

            // Format the new salesID
            return "E" + String.format("%04d", numericPart);
        }
        return null;
    }

    private boolean EmpIDCheckValidate(String txtInput) {
        return txtInput.matches("E\\d{4}");
    }

    private boolean EmpNameCheckValidate(String txtInput) {
        return txtInput.matches("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$");
    }

    private boolean EmpStatusCheckValidate(String txtInput) {
        return txtInput.matches("null");
    }

    private boolean EmpPasswordCheckValidate(String txtInput) {
        return txtInput.matches("^(?=.*[A-Za-z])(?=.*\\d).{8}");
    }

    public void DataEnteringEmployee() {
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
            java.util.logging.Logger.getLogger(DataEnteringEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEnteringEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEnteringEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEnteringEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEnteringEmployee(employeeID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnImportDataFromCSV;
    private javax.swing.JButton btnSearchData;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel employeeInformation;
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel employeeStatus;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel javaRides;
    private javax.swing.JLabel leCars;
    private javax.swing.JLabel password;
    private javax.swing.JLabel search;
    private javax.swing.JLabel since2004;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
