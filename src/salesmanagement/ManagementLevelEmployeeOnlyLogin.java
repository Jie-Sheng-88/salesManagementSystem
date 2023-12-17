package salesmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManagementLevelEmployeeOnlyLogin {
    public static void main(String[] args) {
        String ID = JOptionPane.showInputDialog("Enter your ID:");
        String password = JOptionPane.showInputDialog("Enter your password:");

        EmployeeLoginManager employeeLoginManager = new EmployeeLoginManager();
        EmployeeInfoManager employeeInfoManager = new EmployeeInfoManager();
        EmployeeSalaryManager employeeSalaryManager = new EmployeeSalaryManager(employeeInfoManager);
        EmployeeDataManager employeeDataManager = new EmployeeDataManager(employeeSalaryManager);

        if (employeeLoginManager.isValidLogin(ID, password)) {
            String employeeInfo = employeeInfoManager.getEmployeeInfo(ID);
            JOptionPane.showMessageDialog(null, "Login successful!\n" + employeeInfo);

            int status = employeeInfoManager.getEmployeeStatus(ID);
            if (status == 1) {
                showEmployeeTable(employeeDataManager);
            } else {
                double salary = employeeSalaryManager.calculateSalary(ID);
                JOptionPane.showMessageDialog(null, "Your salary is: RM " + salary);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Incorrect username or password.");
        }
    }

    private static void showEmployeeTable(EmployeeDataManager employeeDataManager) {
        JFrame frame = new JFrame("Employee Information");

        String[] columnNames = {"Employee ID", "Name", "Status", "Salary", "Bonus"};
        DefaultTableModel tableModel = new DefaultTableModel(null, columnNames);

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        String allEmployeeData = employeeDataManager.getAllEmployeeData();
        String[] rows = allEmployeeData.split("\n");
        for (int i = 1; i < rows.length; i++) {
            String row = rows[i];
            String[] data = row.split(", ");
            if (data.length == 4) {
                String employeeID = data[0];
                String employeeName = data[1];
                String employeeStatus = data[2];
                String salary = data[3];

                double bonus = getEmployeeBonus(employeeID);
                tableModel.addRow(new Object[]{employeeID, employeeName, employeeStatus, salary, bonus});
            }
        }
        frame.add(scrollPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static double getEmployeeBonus(String employeeID) {
        EmployeeBonus bonus = new EmployeeBonus();
        try (BufferedReader salesReader = new BufferedReader(new FileReader("src/sales.csv"))) {
            int totalSalesRecords = 0;
            double totalSalesAmount = 0;

            String line;
            while ((line = salesReader.readLine()) != null) {
                String[] salesData = line.split(",");
                if (salesData.length >= 5 && employeeID.equals(salesData[3])) {
                    totalSalesRecords++;
                    try {
                        double salesAmount = Double.parseDouble(salesData[3].trim());
                        totalSalesAmount += salesAmount;
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing salesAmount: " + salesData[3]);
                    }
                }
            }

            if (qualifiesForFlatBonus(totalSalesRecords, totalSalesAmount)) {
                return 500.0;
            } else if (isManagementEmployee(employeeID)) {
                return bonus.calculateBonus(employeeID, totalSalesAmount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    private static boolean isManagementEmployee(String employeeID) {
        EmployeeInfoManager employeeInfoManager = new EmployeeInfoManager();
        int status = employeeInfoManager.getEmployeeStatus(employeeID);
        return status == 1;
    }

    private static boolean qualifiesForFlatBonus(int totalSalesRecords, double totalSalesAmount) {
        return totalSalesRecords > 15 || totalSalesAmount > 1000000;
    }
}