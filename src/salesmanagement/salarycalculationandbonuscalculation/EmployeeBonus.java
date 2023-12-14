package salesmanagement.salarycalculationandbonuscalculation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeBonus {
    public double calculateBonus(String ID, double totalSalesAmount) {
        int carSalesCount;
        try (BufferedReader salesReader = new BufferedReader(new FileReader("src/sales.csv"))) {
            carSalesCount = getCarSalesCount(ID, salesReader);

            if (carSalesCount > 15 || totalSalesAmount > 1000000) {
                System.out.println("Flat Bonus Applied");
                return 500.0;
            }

            double commissionRate = getCommissionRate(totalSalesAmount);
            double bonus = totalSalesAmount * commissionRate;

            System.out.println("Commission Bonus: " + bonus);

            return bonus;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0.0;
    }

    private int getCarSalesCount(String ID, BufferedReader salesReader) throws IOException {
        int carSalesCount = 0;
        String line;
        while ((line = salesReader.readLine()) != null) {
            String[] salesData = line.split(",");
            if (salesData.length >= 5 && ID.equals(salesData[4])) {
                carSalesCount++;
            }
        }
        return carSalesCount;
    }

    private double getCommissionRate(double totalSalesAmount) {
        if (totalSalesAmount <= 800000.00) {
            return 0.01;
        } else if (totalSalesAmount <= 1600000.00) {
            return 0.015;
        } else if (totalSalesAmount <= 2500000.00) {
            return 0.0125;
        } else {
            return 0.0135;
        }
    }
}