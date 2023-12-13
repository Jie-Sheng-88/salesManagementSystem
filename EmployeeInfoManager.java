package SalaryCalculationAndBonusCalculation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeInfoManager {
    public String getEmployeeInfo(String ID) {
        String filePath = "src/LeCars/employee.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String storedID = data[0];
                String employeeName = data[1];
                String employeeStatus = data[2];
                if (ID.equals(storedID)) {
                    return "Employee Name: " + employeeName + "\nStatus: " + employeeStatus;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Employee information not found.";
    }
    public int getEmployeeStatus(String id) {
        String filePath = "src/LeCars/employee.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String storedID = data[0];
                String storedStatus = data[2];
                if (id.equals(storedID)) {
                    return Integer.parseInt(storedStatus);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return -1;
    }
}