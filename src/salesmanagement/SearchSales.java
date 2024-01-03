package salesmanagement;

import java.awt.Dimension;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchSales {

    public static Scanner x;

    public static void SearchSales() {

        String filepath = "src\\sales.csv";

        String searchTerm = JOptionPane.showInputDialog("Enter the search term:"
                + "\n-Sales Id"
                + "\n-Date & Time"
                + "\n-Car Plate"
                + "\n-Customer Id"
                + "\n-Employee Id"
                + "\n(Any one above)");

        readRecords(searchTerm, filepath);
    }

    public static void readRecords(String searchTerm, String filepath) {
        boolean found = false;

        try {
            x = new Scanner(new File(filepath));

            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Sales ID");
            tableModel.addColumn("Date & Time");
            tableModel.addColumn("Car Plate");
            tableModel.addColumn("Customer ID");
            tableModel.addColumn("Employee ID");

            while (x.hasNextLine()) {
                String line = x.nextLine();
                String[] data = line.split(",");

                if (data.length >= 5) {
                    String salesId = data[0].trim();
                    String dateTime = data[1].trim();
                    String carPlate = data[2].trim();
                    String custId = data[3].trim();
                    String employeeId = data[4].trim();

                    if (salesId.equalsIgnoreCase(searchTerm)
                            || dateTime.equalsIgnoreCase(searchTerm)
                            || carPlate.equalsIgnoreCase(searchTerm)
                            || custId.equalsIgnoreCase(searchTerm)
                            || employeeId.equalsIgnoreCase(searchTerm)) {

                        tableModel.addRow(new Object[]{salesId, dateTime, carPlate, custId, employeeId});
                        found = true;
                    }
                }
            }
            if (found) {
                JTable resultTable = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(resultTable);
                scrollPane.setPreferredSize(new Dimension(700, 400));
                JOptionPane.showMessageDialog(null, scrollPane, "Search Results", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Record not found");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        } finally {
            if (x != null) {
                x.close();
            }
        }
    }
}
