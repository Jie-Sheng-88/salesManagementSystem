package salesmanagement;

import java.awt.Dimension;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class searchEmployee {

    private static Scanner x;

    public static void main(String[] args) {
        String filepath = "src\\employee.csv";//change your file path
        String searchTerm = JOptionPane.showInputDialog("Enter the search term:"
                + "\n-Employee Id"
                + "\n-Employee Name"
                + "\n-Status (1 for under management)"
                + "\n-Password"
                + "\n(Any one above)");

        readRecords(searchTerm, filepath);
    }

    public static void readRecords(String searchTerm, String filepath) {
        boolean found = false;

        try {
            x = new Scanner(new File(filepath));

            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Employee ID");
            tableModel.addColumn("Employee Name");
            tableModel.addColumn("Status");
            tableModel.addColumn("Password");

            while (x.hasNextLine()) {
                String line = x.nextLine();
                String[] data = line.split(",");

                if (data.length >= 4) {
                    String employeeId = data[0].trim();
                    String employeeName = data[1].trim();
                    String employeeStatus = data[2].trim();
                    String password = data[3].trim();

                    if (employeeId.equalsIgnoreCase(searchTerm)
                            || employeeName.equalsIgnoreCase(searchTerm)
                            || employeeStatus.equalsIgnoreCase(searchTerm)
                            || password.equalsIgnoreCase(searchTerm)) {

                        tableModel.addRow(new Object[]{employeeId, employeeName, employeeStatus, password});
                        found = true;
                    }
                }
            }
            if (found) {
                JTable resultTable = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(resultTable);
                scrollPane.setPreferredSize(new Dimension(500, 400));

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
