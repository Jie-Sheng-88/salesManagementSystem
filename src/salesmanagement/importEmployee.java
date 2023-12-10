package salesmanagement;

import java.io.File;
import javax.swing.JTable;

public class importEmployee {
    public void importEmp() {
        ReadFile c = new ReadFile();
        JTable myTable = new JTable();
        
        c.ReadCSV(new File("src\\employee.csv"));
    }
    
}
