package salesmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {
    public void ReadCSV(File file) {
        try {
            if (file.getName().endsWith(".csv")) {
                detectCSVDataType(file);
            } else {
                System.out.println("Unsupported file format");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void detectCSVDataType(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String headerLine = reader.readLine();
            if (headerLine.contains("cust")) {
                System.out.println("Importing Customer data...");
                importCSVData(reader, "customer.csv");
            } else if (headerLine.contains("sales")) {
                System.out.println("Importing Sales data...");
                importCSVData(reader, "sales.csv");
            } else if (headerLine.contains("employee")) {
                System.out.println("Importing Employee data...");
                importCSVData(reader, "employee.csv");
            } else if (headerLine.contains("vehicle")) {
                System.out.println("Importing Vehicle data...");
                importCSVData(reader, "vehicle.csv");
            } else {
                System.out.println("Unknown CSV data type");
            }
        }
    }

    private void importCSVData(BufferedReader reader, String outputFileName) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            for (String field : fields) {
                String trimmedField = field.trim();
                
                if (trimmedField.isEmpty() || trimmedField.isBlank()) {
                    System.out.print("Null ");
                } else {
                    System.out.print(trimmedField + " ");
                }
            }
            System.out.println();
        }
        reader.close();
    }

//    public void logToCSV(String filePath, String[] data) {
//        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath, true))) {
//            // Append data to the CSV file
//            for (int i = 0; i < data.length; i++) {
//                writer.write(data[i]);
//                if (i < data.length - 1) {
//                    writer.write(",");
//                }
//            }
//            writer.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
