package salesmanagement;

import com.opencsv.CSVWriter;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SEDataEnteringSales extends javax.swing.JFrame {

    private String newSalesID;
    private String employeeID;

    public SEDataEnteringSales(String employeeID) {
        this.employeeID = employeeID;
        System.out.println("SE Data Entring Sales Page, id = " + employeeID);
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carPlate = new javax.swing.JLabel();
        txtCarPlate = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        btnAddData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        javaRides = new javax.swing.JLabel();
        since2004 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carPlate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carPlate.setForeground(new java.awt.Color(255, 255, 255));
        carPlate.setText("Car Plate:");
        getContentPane().add(carPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 180, 160, 40));

        txtCarPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarPlateActionPerformed(evt);
            }
        });
        getContentPane().add(txtCarPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 170, 30));

        CustomerID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CustomerID.setForeground(new java.awt.Color(255, 255, 255));
        CustomerID.setText("Customer ID:");
        getContentPane().add(CustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 230, 150, 40));

        txtCustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustID, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 170, 30));

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

        jLabel1.setFont(new java.awt.Font("Freestyle Script", 0, 50)); // NOI18N
        jLabel1.setText(" LeCars");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 110, -1));

        javaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        javaRides.setText("JavaRides");
        getContentPane().add(javaRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2004.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2004.setText("-- SINCE 2004 --");
        getContentPane().add(since2004, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 900, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 320, 120));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        jLabel2.setText("Sales Information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,80));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 280, 40));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/9.jpg"))); // NOI18N
        getContentPane().add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarPlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarPlateActionPerformed

    private void txtCustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIDActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        // TODO add your handling code here:
        String filePath = "src//sales.csv";
        if (txtCarPlate.getText().equals("") || txtCustID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter All Data!");
        } else if (!custIDCheckValidate(txtCustID.getText()) || !carPlateCheckValidate(txtCarPlate.getText())) {
            JOptionPane.showMessageDialog(null, "*Please follow the correct format:\n"
                    + "Car Plate: You must have 3 capital letters and in between 1 to 4 digit numbers.\n"
                    + "Customer ID: You must enter capital letter \"C\" and 4 digit numbers. Example: C0000, C0001, etc.\n");
        } else {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                Object[] tableLines = br.lines().toArray();
                String newSalesID = generateNewSalesID(tableLines);
                this.newSalesID = newSalesID;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SEDataEnteringSales.class.getName()).log(Level.SEVERE, null, ex);
            }

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.now();
            ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
            String together = dtf.format(localDateTime) + "T" + dt.format(localDateTime) + "Z";

            String data[] = {this.newSalesID, together, txtCarPlate.getText(), txtCustID.getText(), employeeID};

            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            try {
                FileWriter w = new FileWriter(filePath, true);
                CSVWriter csv = new CSVWriter(w, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                csv.writeNext(data);
                csv.close();
                w.close();

            } catch (IOException ex) {
                Logger.getLogger(SEDataEnteringSales.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Car Plate: " + txtCarPlate.getText() + "\n" + "Customer ID: " + txtCustID.getText() + "\n" + "Add Data Successfully!");

            txtCarPlate.setText("");
            txtCustID.setText("");

        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        InfoViewSales infoViewSales = new InfoViewSales(employeeID);
        infoViewSales.InfoViewSales();
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            return "A" + String.format("%04d", numericPart);
        }
        return null;
    }

    private boolean carPlateCheckValidate(String txtInput) {
        return txtInput.matches("[A-Z]{3}\\d{1,4}");
    }

    private boolean custIDCheckValidate(String txtInput) {
        return txtInput.matches("C\\d{4}");
    }

    public void SEDataEnteringSales() {
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
            java.util.logging.Logger.getLogger(SEDataEnteringSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEDataEnteringSales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEDataEnteringSales(employeeID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerID;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JButton btnAddData;
    private javax.swing.JLabel carPlate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel javaRides;
    private javax.swing.JLabel since2004;
    private javax.swing.JTextField txtCarPlate;
    private javax.swing.JTextField txtCustID;
    // End of variables declaration//GEN-END:variables

}
