/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author veron
 */
public class SalaryAndBonus {
    
public static void SalaryAndBonus() {

        EmployeeInfoManager employeeInfoManager = new EmployeeInfoManager();
        EmployeeSalaryManager employeeSalaryManager = new EmployeeSalaryManager(employeeInfoManager);
        EmployeeDataManager employeeDataManager = new EmployeeDataManager(employeeSalaryManager);

        showEmployeeTable(employeeDataManager);
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
        frame.setVisible(true);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
