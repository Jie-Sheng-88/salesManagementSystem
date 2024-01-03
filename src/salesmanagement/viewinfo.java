package salesmanagement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class viewinfo {

    private static String vehiclepath = "src\\vehicle.csv";
    private static String salespath = "src\\sales.csv";
    private static String employeepath = "src\\employee.csv";
    private static String custpath = "src\\cust.csv";
    
    private String status;
    private String employeeId;

    
    public viewinfo(String employeeId) throws IOException {
        this.employeeId = employeeId;
        this.status = getStatus(employeeId);
    }

    public static void viewvehicle() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(vehiclepath));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static String getStatus(String employeeId) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(employeepath));
        String line;
        while ((line = br.readLine()) != null) {
            String info[] = line.split(",");
            if (info[0].equals(employeeId)) {
                return info[2];
            }
        }
        return null;
    }

    public void viewsales() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(salespath));
        String line;
        if (this.status != null && this.status.equals("0")) {
            System.out.println("salesId,dateTime,carPlate,custId,employeeId");
            while ((line = br.readLine()) != null) {
                String[] info = line.split(",");
                if (info[4].equals(employeeId)) {
                    System.out.println(line);
                }
            }
            br.close();
        } else if (this.status != null && this.status.equals("1")) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } else if (this.status != null) {
            System.out.println("cannot access");
        }
    }

    public void viewcust() throws IOException {
        if (this.status != null && this.status.equals("0")) {
            ArrayList<String> custid = new ArrayList<String>();

            try (BufferedReader br = new BufferedReader(new FileReader(salespath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] info = line.split(",");
                    if (info[4].equals(employeeId)) {
                        custid.add(info[3]);
                    }
                }
                br.close();
            }

            try (BufferedReader br = new BufferedReader(new FileReader(custpath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] info = line.split(",");
                    if (custid.contains(info[0])) {
                        System.out.println(line);
                    }
                }
                br.close();
            }
        } else if (this.status != null && this.status.equals("1")) {
            BufferedReader br = new BufferedReader(new FileReader(custpath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } else if (this.status != null) {
            System.out.println("cannot access");
        }

    }

    public void viewemployee() throws IOException {
        if (this.status != null && this.status.equals("1")) {
            BufferedReader br = new BufferedReader(new FileReader(employeepath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } else {
            System.out.println("cannot access");
        }
    }

    public String getStatus() {
        return status;
    }
}
