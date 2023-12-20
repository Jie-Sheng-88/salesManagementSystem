package salesmanagement;

import java.awt.Dimension;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class searchSalesLogin {

    private static Scanner x;

    public static void main(String[] args) {
        String salesFilePath = "src\\sales.csv";
        String custFilePath = "src\\cust.csv";
        String salesAndCustFilePath = "src\\searchAndCust.csv";
        String employeeFilePath = "src\\employee.csv";

        try {
            Map<String, String[]> customerData = readCustomerData(custFilePath);
            mergeAndWriteData(salesFilePath, customerData, salesAndCustFilePath);
            System.out.println("Merge completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String employeeId = JOptionPane.showInputDialog("Enter Employee ID:");
        String password = JOptionPane.showInputDialog("Enter Password:");

        if (isValidLogin(employeeId, password, employeeFilePath)) {
            readRecords(employeeId, salesAndCustFilePath);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid ID or password");
        }
    }

    public static boolean isValidLogin(String enteredEmployeeId, String enteredPassword, String filePath) {
        try {
            x = new Scanner(new File(filePath));

            while (x.hasNextLine()) {
                String line = x.nextLine();
                String[] data = line.split(",");

                if (data.length >= 4) {
                    String employeeId = data[0].trim();
                    String password = data[3].trim();

                    if (employeeId.equals(enteredEmployeeId) && password.equals(enteredPassword)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error reading file");
        } finally {
            if (x != null) {
                x.close();
            }
        }
        return false;
    }

    public static void readRecords(String employeeId, String filepath) {
        boolean found = false;

        try {
            x = new Scanner(new File(filepath));

            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Sales ID");
            tableModel.addColumn("Date & Time");
            tableModel.addColumn("Car Plate");
            tableModel.addColumn("Customer ID");
            tableModel.addColumn("Employee ID");
            tableModel.addColumn("Customer Name");
            tableModel.addColumn("Phone No.");
            tableModel.addColumn("Postcode");

            while (x.hasNextLine()) {
                String line = x.nextLine();
                String[] data = line.split(",");

                if (data.length >= 8) {
                    String salesId = data[0].trim();
                    String dateTime = data[1].trim();
                    String carPlate = data[2].trim();
                    String custId = data[3].trim();
                    String searchEmployeeId = data[4].trim();
                    String custName = data[5].trim();
                    String phoneNum = data[6].trim();
                    String postcode = data[7].trim();

                    if (employeeId.equals(searchEmployeeId)) {
                        tableModel.addRow(new Object[]{salesId, dateTime, carPlate, custId, searchEmployeeId, custName, phoneNum, postcode});
                        found = true;
                    }
                }
            }

            if (found) {
                JTable resultTable = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(resultTable);
                scrollPane.setPreferredSize(new Dimension(1100, 400));

                JOptionPane.showMessageDialog(null, scrollPane, "Sales Information for Employee ID " + employeeId, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No sales information found for Employee ID " + employeeId);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        } finally {
            if (x != null) {
                x.close();
            }
        }
    }

    private static Map<String, String[]> readCustomerData(String filePath) throws IOException {
        Map<String, String[]> customerData = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 4) {
                    String custId = data[0].trim();
                    customerData.put(custId, data);
                }
            }
        }

        return customerData;
    }

    private static void mergeAndWriteData(String salesFilePath, Map<String, String[]> customerData, String outputFilePath)
            throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(salesFilePath)); BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            // Read header from sales file
            String header = reader.readLine();
            writer.write(header + ",custName,phoneNum,postcode\n");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 5) {
                    String custId = data[3].trim();

                    // Get customer data based on custId
                    String[] customerInfo = customerData.get(custId);

                    if (customerInfo != null) {
                        // Merge sales and customer data
                        String mergedLine = line + "," + customerInfo[1] + "," + customerInfo[2] + "," + customerInfo[3];
                        writer.write(mergedLine + "\n");
                    }
                }
            }
        }
    }
}
