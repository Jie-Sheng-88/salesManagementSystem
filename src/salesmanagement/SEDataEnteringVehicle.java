package salesmanagement;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SEDataEnteringVehicle extends javax.swing.JFrame {

    private String employeeID;
    private String vehicleStatus;

    /**
     * Creates new form vehicleDataEntering
     */
    public SEDataEnteringVehicle(String employeeID) {
        this.employeeID = employeeID;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        javaRides = new javax.swing.JLabel();
        since2004 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        acquiredPrice = new javax.swing.JLabel();
        carPlate = new javax.swing.JLabel();
        carModel = new javax.swing.JLabel();
        carStatus = new javax.swing.JLabel();
        soldPrice = new javax.swing.JLabel();
        txtSoldPrice = new javax.swing.JTextField();
        txtAcqPrice = new javax.swing.JTextField();
        txtCarModel = new javax.swing.JTextField();
        txtCarPlate = new javax.swing.JTextField();
        carPlate1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        vehicleInformation = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnImportDataFromCSV = new javax.swing.JButton();
        btnAddData = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSearchData = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 490, 390));

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
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 180, 30));

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search:");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 70, 27));

        javaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        javaRides.setText("JavaRides");
        getContentPane().add(javaRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2004.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2004.setText("-- SINCE 2004 --");
        getContentPane().add(since2004, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));

        jLabel4.setFont(new java.awt.Font("Freestyle Script", 0, 50)); // NOI18N
        jLabel4.setText(" LeCars");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 110, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acquiredPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        acquiredPrice.setForeground(new java.awt.Color(255, 255, 255));
        acquiredPrice.setText("Acquire Price:");
        jPanel1.add(acquiredPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 27));

        carPlate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carPlate.setForeground(new java.awt.Color(255, 255, 255));
        carPlate.setText("Car Plate:");
        jPanel1.add(carPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 20, -1, 27));

        carModel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carModel.setForeground(new java.awt.Color(255, 255, 255));
        carModel.setText("Car Model:");
        jPanel1.add(carModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 70, -1, 27));

        carStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carStatus.setForeground(new java.awt.Color(255, 255, 255));
        carStatus.setText(" Car Status:");
        jPanel1.add(carStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 170, -1, 27));

        soldPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        soldPrice.setForeground(new java.awt.Color(255, 255, 255));
        soldPrice.setText("SalesPrice:");
        jPanel1.add(soldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 27));

        txtSoldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoldPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtSoldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 220, 170, 30));

        txtAcqPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcqPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtAcqPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 170, 30));

        txtCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarModelActionPerformed(evt);
            }
        });
        jPanel1.add(txtCarModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 70, 170, 30));

        txtCarPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarPlateActionPerformed(evt);
            }
        });
        jPanel1.add(txtCarPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 20, 170, 30));

        carPlate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carPlate1.setForeground(new java.awt.Color(255, 255, 255));
        carPlate1.setText("Car Plate:");
        jPanel1.add(carPlate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 20, -1, 27));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Null", "Sold", "In Stock" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 350, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));

        vehicleInformation.setBackground(new java.awt.Color(255, 255, 255));
        vehicleInformation.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        vehicleInformation.setText("Vehicle Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehicleInformation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(vehicleInformation)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 310, 40));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0,80));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 80, 30));

        btnImportDataFromCSV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImportDataFromCSV.setText("Import Data from CSV");
        btnImportDataFromCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportDataFromCSVActionPerformed(evt);
            }
        });
        getContentPane().add(btnImportDataFromCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        btnAddData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddData.setText("Add Data");
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        btnSearchData.setText("Search Data");
        btnSearchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDataActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/5.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        setSize(new java.awt.Dimension(914, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarPlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarPlateActionPerformed

    private void txtCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarModelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCarModelActionPerformed

    private void txtAcqPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcqPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcqPriceActionPerformed

    private void txtSoldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoldPriceActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        // TODO add your handling code here:
        String filePath = "src//vehicle.csv";
        if (txtCarPlate.getText().equals("") || txtCarModel.getText().equals("") || txtAcqPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter All Data!");
        } else if (!carPlateCheckValidate(txtCarPlate.getText()) || !carModelCheckValidate(txtCarModel.getText()) || !carAcqPriceCheckValidate(txtAcqPrice.getText()) || carStatusCheckValidate(vehicleStatus)) {
            JOptionPane.showMessageDialog(null, "*Please follow the correct format:\n"
                    + "Car Plate: You must have 3 capital letters and in between 1 to 4 digit numbers.\n"
                    + "Car Model: You must have at least 1 capital letters and 1 small letter.\n"
                    + "Car Acquired Price: You must enter at least 1 digit numbers.\n"
                    + "Car Status: You must choose 1 from the dropdown menu.\n");
        } else {
            if (txtSoldPrice.getText().equals("") || vehicleStatus.equals("1")) {
                txtSoldPrice.setText("empty");
            }
            String data[] = {txtCarPlate.getText(), txtCarModel.getText(), txtAcqPrice.getText(), vehicleStatus, txtSoldPrice.getText()};
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            try {
                FileWriter v = new FileWriter(filePath, true);
                CSVWriter csv = new CSVWriter(v, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                csv.writeNext(data);
                csv.close();
                v.close();
            } catch (IOException ex) {
                Logger.getLogger(SEDataEnteringVehicle.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Add Data Successfully!");

            txtCarPlate.setText("");
            txtCarModel.setText("");
            txtAcqPrice.setText("");
            txtSoldPrice.setText("");

        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void btnImportDataFromCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportDataFromCSVActionPerformed
        String filePath = "src//vehicle.csv";
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

                String[] dataRow = new String[5];

                String[] splitLine = line.split(",");
                for (int j = 0; j < Math.min(splitLine.length, 5); j++) {
                    dataRow[j] = splitLine[j];
                }
                System.out.println(dataRow.length);
                for (int j = 0; j < dataRow.length; j++) {

                    if (dataRow[j] == null || dataRow[j].isBlank() || dataRow[j].isEmpty()) {
                        // Add "empty" to empty cells
                        dataRow[j] = "empty";

                    }
                }

                model.addRow(dataRow);
            }

            // Assuming you have a CSVWriter instance, you can use it like this:
            FileWriter v = new FileWriter(file);
            CSVWriter csv = new CSVWriter(v, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
            v.write("");
            csv.writeNext(new String[]{"carPlate", "carModel", "acquirePrice", "carStatus", "salesPrice"}); // error here
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    v.write(model.getValueAt(i, j).toString() + ",");
                }
                v.write("\n");
            }
            v.close();
        } catch (IOException ex) {
            Logger.getLogger(DataEnteringCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnImportDataFromCSVActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InfoViewSales infoViewSales = new InfoViewSales(this.employeeID);
        infoViewSales.InfoViewSales();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDataActionPerformed
        // TODO add your handling code here:
        SearchVehicle searchVehicle = new SearchVehicle();
        searchVehicle.SearchVehicle();
    }//GEN-LAST:event_btnSearchDataActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedValue = jComboBox1.getSelectedItem().toString();
        if (selectedValue.equals("Sold")) {
            this.vehicleStatus = "0";
        } else if (selectedValue.equals("In Stock")) {
            this.vehicleStatus = "1";
        } else {
            this.vehicleStatus = "null";
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private boolean carPlateCheckValidate(String txtInput) {
        return txtInput.matches("[A-Z]{3}\\d{1,4}");
    }

    private boolean carAcqPriceCheckValidate(String txtInput) {
        return txtInput.matches("\\d+");
    }

    private boolean carStatusCheckValidate(String txtInput) {
        return txtInput.equals("null");
    }

    private boolean carModelCheckValidate(String txtInput) {
        return txtInput.matches("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$");
    }

    public void SEDataEnteringVehicle() {
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
            java.util.logging.Logger.getLogger(SEDataEnteringVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEDataEnteringVehicle(employeeID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acquiredPrice;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnImportDataFromCSV;
    private javax.swing.JButton btnSearchData;
    private javax.swing.JLabel carModel;
    private javax.swing.JLabel carPlate;
    private javax.swing.JLabel carPlate1;
    private javax.swing.JLabel carStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel javaRides;
    private javax.swing.JLabel search;
    private javax.swing.JLabel since2004;
    private javax.swing.JLabel soldPrice;
    private javax.swing.JTextField txtAcqPrice;
    private javax.swing.JTextField txtCarModel;
    private javax.swing.JTextField txtCarPlate;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoldPrice;
    private javax.swing.JLabel vehicleInformation;
    // End of variables declaration//GEN-END:variables
}
