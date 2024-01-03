package salesmanagement;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class registeration {

    private static String filepath = "src\\employee.csv";
    private String password;
    private String username;

    final static String secretKey = "JONASCHUAN";

    public registeration(String Username, String password) {
        this.password = password;
        this.username = Username;
    }

    public static String MaxId() {
        String maxId = "E0000";
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 4 && !values[0].equals("employeeId")) {
                    String id = values[0];
                    if (id.compareTo(maxId) > 0) {
                        maxId = id;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxId;
    }

    public static String NextId(String currentMaxId) {
        Pattern pattern = Pattern.compile("E(\\d+)");
        Matcher matcher = pattern.matcher(currentMaxId);
        if (matcher.find()) {
            int idNumber = Integer.parseInt(matcher.group(1));
            idNumber++;
            return String.format("E%04d", idNumber);
        }
        return null;
    }

    public String addToCsv() {
        String currentMaxId = MaxId();
        String newId = NextId(currentMaxId);
        if (newId != null) {
            String newUserRecord = newId + "," + this.username + "," + 0 + "," + this.password;
            try (FileWriter fw = new FileWriter(filepath, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
                pw.println(newUserRecord);
                return newId;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void checkkey() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter secret key");
        String userInputKey = s.nextLine();
        if (!userInputKey.equals(secretKey)) {
            System.out.println("Invalid secret key. Please try again.");
            System.exit(0);
        }
        System.out.println("Valid secret key.Please continue your registeration");
    }
}
