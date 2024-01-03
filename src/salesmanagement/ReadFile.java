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

    public static ArrayList<String[]> getData(File file) throws IOException {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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

}
