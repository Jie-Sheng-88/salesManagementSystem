//import javax.swing.*;
//import java.awt.*;
//import java.io.File;
//import salesmanagement.ReadFile;
//
//public class MainFrame extends JFrame {
//
//    private JTable dataTable;
//
//    public MainFrame() {
//        setTitle("CSV Data Viewer");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        // Create an empty JTable
//        dataTable = new JTable();
//
//        // Add the JTable to a JScrollPane to make it scrollable
//        JScrollPane scrollPane = new JScrollPane(dataTable);
//        add(scrollPane, BorderLayout.CENTER);
//
//        // Add a button to trigger CSV data import
//        JButton importButton = new JButton("Import Data");
//        importButton.addActionListener(e -> importData());
//        add(importButton, BorderLayout.SOUTH);
//
//        pack();
//        setLocationRelativeTo(null); // Center the frame on the screen
//    }
//
//    private void importData() {
//        JFileChooser fileChooser = new JFileChooser();
//        int result = fileChooser.showOpenDialog(this);
//
//        if (result == JFileChooser.APPROVE_OPTION) {
//            File selectedFile = fileChooser.getSelectedFile();
//            ReadFile reader = new ReadFile();
//            reader.ReadCSV(selectedFile, dataTable);
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            MainFrame frame = new MainFrame();
//            frame.setVisible(true);
//        });
//    }
//}
