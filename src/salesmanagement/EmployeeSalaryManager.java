package salesmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class EmployeeSalaryManager {
    private EmployeeInfoManager employeeInfoManager;
    public EmployeeSalaryManager(EmployeeInfoManager employeeInfoManager) {
        this.employeeInfoManager = employeeInfoManager;
    }
    public double calculateSalary(String ID) {
        String salesFilePath = "src/sales.csv";
        String vehiclesFilePath = "src/vehicle.csv";

        try (BufferedReader salesReader = new BufferedReader(new FileReader(salesFilePath));
             BufferedReader vehiclesReader = new BufferedReader(new FileReader(vehiclesFilePath))) {

            String employeeStatus = "";
            String line;
            while ((line = salesReader.readLine()) != null) {
                String[] salesData = line.split(",");

                if (ID.equals(salesData[4])) {
                    System.out.println("Employee Data: \n" + employeeInfoManager.getEmployeeInfo(ID));
                    employeeStatus = employeeInfoManager.getEmployeeStatus(ID) + "";
                    System.out.println("The real employee status: " + employeeStatus);
                    break;
                }
            }
            double basicSalary;
            double allowance;
            if (employeeStatus.equals("0")) {
                basicSalary = 1200;
                allowance = 250;
            } else if (employeeStatus.equals("1")) {
                System.out.println(" X ");
                basicSalary = 2200;
                allowance = 350;
            } else {
                return 0.0;
            }

            double commission = calculateCommission(ID, vehiclesReader);
            return basicSalary + allowance + commission;

        } catch (IOException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
    private double calculateCommission(String ID, BufferedReader vehiclesReader) throws IOException {
        double totalCommission = 0;
        String line;
        while ((line = vehiclesReader.readLine()) != null) {
            String[] vehicleData = line.split(",");
            if (vehicleData.length >= 5) {
                String salesPriceStr = vehicleData[4].trim();
                try {
                    double salesPrice = Double.parseDouble(salesPriceStr);
                    String carPlate = vehicleData[0];

                    if (isVehicleSoldByEmployee(ID, carPlate)) {
                        totalCommission += 0.01 * salesPrice;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing salesPrice: " + salesPriceStr);
                }
            }
        }
        return totalCommission;
    }
    private boolean isVehicleSoldByEmployee(String ID, String carPlate) throws IOException {
        String salesFilePath = "src/sales.csv";
        try (BufferedReader salesReader = new BufferedReader(new FileReader(salesFilePath))) {
            String line;
            while ((line = salesReader.readLine()) != null) {
                String[] salesData = line.split(",");
                String employeeID = salesData[4];
                String soldCarPlate = salesData[2];
                if (ID.equals(employeeID) && carPlate.equals(soldCarPlate)) {
                    return true;
                }
            }
        }
        return false;
    }
}
