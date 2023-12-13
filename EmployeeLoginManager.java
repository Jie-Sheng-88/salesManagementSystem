package SalaryCalculationAndBonusCalculation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeLoginManager {
    public boolean isValidLogin(String ID, String password) {
        String filePath = "src/LeCars/employee.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String storedID = data[0];
                String storedPassword = data[3];
                if (ID.equals(storedID) && password.equals(storedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}