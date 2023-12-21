package salesmanagement;

import java.io.File;
import javax.swing.JTable;

public class importVehicle {
    public void importVehicle() {
        ReadFile c = new ReadFile();
         JTable myTable = new JTable();
        c.ReadCSV(new File("src\\vehicle.csv"));
    }
}
