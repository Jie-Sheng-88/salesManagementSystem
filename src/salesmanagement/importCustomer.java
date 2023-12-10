package salesmanagement;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable; 
import java.io.FileReader;
import java.io.File;

public class importCustomer {
    public void importCust() {
        ReadFile c = new ReadFile();
        c.ReadCSV(new File("src\\cust.csv"));
    }
    public void enteringNewCustomer (){
       
    }
}

