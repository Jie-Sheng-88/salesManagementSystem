package salesmanagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadFile {

    static ArrayList<String[]> data = new ArrayList<>();

    /*
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
    }*/
    public void ReadCSV(File file) {
        if (file.getName().endsWith(".csv")) {
            try {
                importCSVData(file);
            } catch (IOException e) {
                System.out.println("Unknown CSV data type");
            }
        } else {
            System.out.println("Unsupported file format");
        }

    }

    /*
    private void detectCSVDataType(File file) throws IOException {
        try ( BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String headerLine = reader.readLine();
            if (headerLine.contains("cust")) {
                System.out.println("Importing Customer data...");
                importCSVData(reader);
            } else if (headerLine.contains("sales")) {
                System.out.println("Importing Sales data...");
                importCSVData(reader);
            } else if (headerLine.contains("employee")) {
                System.out.println("Importing Employee data...");
                importCSVData(reader);
            } else if (headerLine.contains("vehicle")) {
                System.out.println("Importing Vehicle data...");
                importCSVData(reader);
            } else {
                System.out.println("Unknown CSV data type");
            }
        }
    }*/
    public static ArrayList<String[]> getData(File file) throws IOException {
        String line;
        try ( BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                if (line.endsWith(",")) {
                    line += "null";
                }
                data.add(line.split(","));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Unknown CSV data type");
        }

        return data;
    }

    private void importCSVData(File file) throws IOException {
        String line;
        try ( BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                if (line.endsWith(",")) {
                    line += "null";
                }
                data.add(line.split(","));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Unknown CSV data type");
        }
        for (String[] row : data) {
            System.out.println(Arrays.toString(row).replaceAll("[\\[\\],]", ""));
        }
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
