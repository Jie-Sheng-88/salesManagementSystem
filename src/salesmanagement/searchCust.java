package salesmanagement;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class searchCust {

    private static Scanner x;

    public static void main(String[] args) {
        // TODO code application logic here

        String filepath = "src\\cust.csv";//change your file path

        String searchTerm = JOptionPane.showInputDialog("Enter the search term:"
                + "\n-Customer Id"
                + "\n-Customer Name"
                + "\n-Phone Number"
                + "\n-Postcode"
                + "\n(Any one above)");

        readRecord(searchTerm, filepath);

    }

    public static void readRecord(String searchTerm, String filepath) {
        boolean found = false;

        try {
            x = new Scanner(new File(filepath));

            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Customer ID");
            tableModel.addColumn("Customer Name");
            tableModel.addColumn("Phone No.");
            tableModel.addColumn("Postcode");
            
            while (x.hasNextLine()) {
                String line = x.nextLine();
                String[] data = line.split(",");
                
            if (data.length >= 4) {
                String custId = data[0].trim();
                String custName = data[1].trim();
                String phoneNum = data[2].trim();
                String postcode = data[3].trim();

                if (custId.equalsIgnoreCase(searchTerm)
                        || custName.equalsIgnoreCase(searchTerm)
                        || phoneNum.equalsIgnoreCase(searchTerm)
                        || postcode.equalsIgnoreCase(searchTerm)) {

                    tableModel.addRow(new Object[]{custId, custName, phoneNum, postcode});
                    found = true;

                }
            }
            }
            if (found) {
                JTable resultTable = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(resultTable);
                JOptionPane.showMessageDialog(null, scrollPane, "Search Results", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Record not found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
    }

}
