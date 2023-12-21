/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class FilterandSum {
     public List<Integer> filterSalesPrice(String filePath, LocalDateTime startDate, LocalDateTime endDate, String dateTimePattern) throws Exception {
        List<Integer> salesPrices = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip the header line
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                String dateTimeString = row[1].trim();

                LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern(dateTimePattern));

                // Check if the date-time is within the specified range
                if (dateTime.isAfter(startDate) && dateTime.isBefore(endDate)) {
                    String salesPriceStr = row[9].trim();
                    int salesPrice = Integer.parseInt(salesPriceStr);
                    salesPrices.add(salesPrice);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return salesPrices;

    }
     
     public int calculateSum(List<Integer> prices) {
        int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return sum;
    }
     
     public List<Integer> filterAccquirePrice(String filePath, LocalDateTime startDate, LocalDateTime endDate, String dateTimePattern) throws Exception {
        List<Integer> accquirePrices = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip the header line
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                String dateTimeString = row[1].trim();

                LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ofPattern(dateTimePattern));

                // Check if the date-time is within the specified range
                if (dateTime.isAfter(startDate) && dateTime.isBefore(endDate)) {
                    String accquirePriceStr = row[7].trim(); // Assuming accquirePrice is in the 7th column
                    int accquirePrice = Integer.parseInt(accquirePriceStr);
                    accquirePrices.add(accquirePrice);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accquirePrices;
    }
     
     public int calculateSum1(List<Integer> prices) {
        int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return sum;
    }
     
     
}
