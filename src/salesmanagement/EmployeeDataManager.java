package salesmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeDataManager {

    private EmployeeSalaryManager employeeSalaryManager;

    public EmployeeDataManager(EmployeeSalaryManager employeeSalaryManager) {
        this.employeeSalaryManager = employeeSalaryManager;
    }
    public String getAllEmployeeData() {
        StringBuilder allEmployeeData = new StringBuilder();
        String filePath = "src/employee.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    String employeeID = data[0];
                    String employeeName = data[1];
                    String employeeStatus = data[2];

                    double salary = employeeSalaryManager.calculateSalary(employeeID);

                    allEmployeeData.append(employeeID)
                            .append(", ")
                            .append(employeeName)
                            .append(", ")
                            .append(employeeStatus)
                            .append(", ")
                            .append(salary)
                            .append("\n");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return allEmployeeData.toString();
    }
}