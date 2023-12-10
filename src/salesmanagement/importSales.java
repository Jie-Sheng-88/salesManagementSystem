package salesmanagement;

import java.io.File;
import javax.swing.JTable;

public class importSales {
    public void importSales() {
        ReadFile c = new ReadFile();
        JTable myTable = new JTable();
        c.ReadCSV(new File("src\\sales.csv"));
    }
}
