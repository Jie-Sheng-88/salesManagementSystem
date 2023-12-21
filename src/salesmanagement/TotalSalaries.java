/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LIM XIN MEI
 */
public class TotalSalaries {
private EmployeeInfoManager employeeInfoManager;
    private EmployeeSalaryManager employeeSalaryManager;

    public TotalSalaries(EmployeeInfoManager employeeInfoManager) {
        this.employeeInfoManager = employeeInfoManager;
        this.employeeSalaryManager = new EmployeeSalaryManager(employeeInfoManager);
    }
    public double calculateTotal() {
        List<String> ids = getTotal();

        double totalSalaries = 0.0;

        for (String id : ids) {
            double salary = employeeSalaryManager.calculateSalary(id);
            totalSalaries += salary;
        }

        return totalSalaries;
    }

    public List<String> getTotal() {
        List<String> ids = new ArrayList<>();
        String file = "src//employee.csv";
        boolean firstRow = true;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (firstRow) {
                    // Skip the first row
                    firstRow = false;
                    continue;
                }

                String[] row = line.split(",");
                String id = row[0].trim();
                ids.add(id);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ids;
    }
}
