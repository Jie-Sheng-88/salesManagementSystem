package salesmanagement;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;

public class SalesManagement {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Press 1-4 for import data");
        int Input = Integer.parseInt(input);
       JTable myTable = new JTable();
        switch (Input) {
            case 1:
                importEmployee employeeImporter = new importEmployee();
                employeeImporter.importEmp();
                break;
            case 2:
                importSales salesImporter = new importSales();
                salesImporter.importSales();
                break;
            case 3:
               importCustomer customerImporter = new importCustomer();
               customerImporter.importCust();
                break;
            case 4:
               importVehicle vehicleImporter = new importVehicle();
               vehicleImporter.importVehicle();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Press a number between 1-4");
        }
       ReadFile reader = new ReadFile ();
         String outputFileName = "customer.csv"; // Choose the appropriate CSV file
       
    }
    
}

