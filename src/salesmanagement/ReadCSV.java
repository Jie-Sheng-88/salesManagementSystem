package salesmanagement;

//package salesManagement;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class ReadCSV {
//
//    public static void readFile(String FileName) throws IOException {
//        try ( BufferedReader bRead = new BufferedReader(new FileReader(FileName))) {
//            String line;
//            while ((line = bRead.readLine()) != null) {
//                String[] fields = line.split(",");
//
//                for (String field : fields) {
//                    if (field.trim().isEmpty()) {
//                        System.out.println("NULL" + " ");
//                    } else {
//                        System.out.print(field + " ");
//                    }
//                }
//
//                System.out.println(); // Move to the next line for the next record
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(ReadCSV.class.getName()).log(Level.SEVERE, null, ex);
//            throw ex; // Re-throw the exception after logging
//        }
//    }
//}
