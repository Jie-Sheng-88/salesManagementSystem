/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package salesmanagement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author LIM XIN MEI
 */
public class ProfitMargin extends javax.swing.JPanel {

    EmployeeInfoManager employeeInfoManager = new EmployeeInfoManager();
    FilterandSum p = new FilterandSum();
    TotalSalaries totalSalaries = new TotalSalaries(employeeInfoManager);
    private double salaries = totalSalaries.calculateTotal();
    private int sumDecember;
    private int costDecember;
    private double marginDecember;
    private int sumJanuary;
    private int costJanuary;
    private double marginJanuary;
    private int sumFebruary;
    private int costFebruary;
    private double marginFebruary;
    double expense = expenses();

    public ProfitMargin() {
        initComponents();
        profitmargin();
        showlinechart();
    }

    public static void ProfitMargin() {

        // Create a JFrame to host the Practice5 panel
        JFrame frame = new JFrame("Chart Application");

        // Instantiate your Practice5 class
        ProfitMargin practice5 = new ProfitMargin();

        // Add the Practice5 panel to the JFrame
        frame.getContentPane().add(practice5);

        // Set JFrame properties
        frame.setSize(1233, 661);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Make the JFrame visible
        frame.setVisible(true);

    }

    public void showlinechart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(-1.27, "Months", "June 2023");
        dataset.addValue(0.16, "Months", "July 2023");
        dataset.addValue(0.86, "Months", "August 2023");
        dataset.addValue(0.31, "Months", "September 2023");
        dataset.addValue(-8.43, "Months", "October 2023");
        dataset.addValue(0, "Months", "November 2023");
        dataset.addValue(marginDecember, "Months", "December 2023");
        dataset.addValue(marginJanuary, "Months", "January 2024");
        dataset.addValue(marginFebruary, "Months", "February 2024");

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Net profit margin by months (%)",
                "Months",
                "Net profit",
                dataset
        );
        ChartAppearance(lineChart);
        ChartPanel linechartpanel = new ChartPanel(lineChart);
        linechartpanel.setPreferredSize(new Dimension(1100, 300));
        panellinechart.removeAll();
        panellinechart.add(linechartpanel, BorderLayout.CENTER);
        panellinechart.validate();
    }

    private void ChartAppearance(JFreeChart chart) {
        // Get the plot (the part of the chart where the data is displayed)
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        // Customize the background color
        plot.setBackgroundPaint(Color.BLACK);

        // Customize the line color
        plot.getRenderer().setSeriesPaint(0, Color.YELLOW);
    }

    public void profitmargin() {
        try {
            String filePath = "src\\newdataset.csv";
            String dateTimePattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
            LocalDateTime startDateDecember = LocalDateTime.parse("2023-12-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateJanuary = LocalDateTime.parse("2024-01-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateFebruary = LocalDateTime.parse("2024-02-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateDecember = LocalDateTime.parse("2023-12-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJanuary = LocalDateTime.parse("2024-01-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateFebruary = LocalDateTime.parse("2024-02-29T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            List<Integer> salesDecember = p.filterSalesPrice(filePath, startDateDecember, endDateDecember, dateTimePattern);
            List<Integer> accquireDecember = p.filterAccquirePrice(filePath, startDateDecember, endDateDecember, dateTimePattern);
            List<Integer> salesJanuary = p.filterSalesPrice(filePath, startDateJanuary, endDateJanuary, dateTimePattern);
            List<Integer> accquireJanuary = p.filterAccquirePrice(filePath, startDateJanuary, endDateJanuary, dateTimePattern);
            List<Integer> salesFebruary = p.filterSalesPrice(filePath, startDateFebruary, endDateFebruary, dateTimePattern);
            List<Integer> accquireFebruary = p.filterAccquirePrice(filePath, startDateFebruary, endDateFebruary, dateTimePattern);

            sumDecember = p.calculateSum(salesDecember);
            costDecember = p.calculateSum1(accquireDecember);
            sumJanuary = p.calculateSum(salesJanuary);
            costJanuary = p.calculateSum1(accquireJanuary);
            sumFebruary = p.calculateSum(salesFebruary);
            costFebruary = p.calculateSum1(accquireFebruary);
            marginDecember = calculateMargin(sumDecember, costDecember, expense);
            marginJanuary = calculateMargin(sumJanuary, costJanuary, expense);
            marginFebruary = calculateMargin(sumFebruary, costFebruary, expense);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private double calculateMargin(int sum, int cost, double expense) {
        if (sum != 0) {
            return ((sum - cost - expense) / sum) * 100;
        } else {
            return 0.0;
        }
    }

    public double expenses() {
        double rent = 2500;
        double Utilitybill = 750.1;
        double insurance = 800;
        double Officesupply = 100;
        double repair = 400;
        double communication = 300;
        double cleaning = 200;
        double total = rent + salaries + Utilitybill + insurance + Officesupply + repair + communication + cleaning;
        return total;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panellinechart = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        ReloadButton = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 0, 153));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rent",  new Double(2500.0)},
                {"Salaries",  new Double(151157.9)},
                {"Utility bills",  new Double(750.1)},
                {"Insurance",  new Double(800.0)},
                {"Office Supplies",  new Double(100.0)},
                {"Maintenance and Repairs",  new Double(400.0)},
                {"Communication Cost",  new Double(300.0)},
                {"Office Cleaning",  new Double(200.0)},
                {"Total ",  new Double(156208.0)}
            },
            new String [] {
                "Expenses", "Amount(RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setPreferredSize(new java.awt.Dimension(140, 160));
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 360, 250));
        add(panellinechart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1220, 290));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Monthly Sales Performance for LeCars Company");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(600, 76));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("=-29068");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 270, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("= 2287140-2160000-156208");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel17.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel23.setText("=-1.27%");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 60, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel27.setText("=(   -29068  / 2287140   ) x 100%");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jTabbedPane1.addTab("June", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 530, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setText("=4292");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setText("=2703400-2542900-156208");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel18.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel22.setText("=(  4292  / 2703400   ) x 100%");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel28.setText("=0.16%");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jTabbedPane1.addTab("July", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setText("= 3593900-3406700-156208");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 530, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel14.setText("=30992");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel19.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel24.setText("=0.86%");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel29.setText("=(   30992  / 3593900   ) x 100%");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jTabbedPane1.addTab("August", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setText("=2873100-2707940-156208");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel11.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 530, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel15.setText("= 8952");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel20.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel25.setText("=(   8952  / 2873100   ) x 100%");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel30.setText("= 0.31%");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jTabbedPane1.addTab("September", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setText("=1043250-975050-156208");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 530, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel16.setText("=-88008");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 270, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel21.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel26.setText("= -8.43%");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel31.setText("=(   -88008  / 1043250   ) x 100%");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jTabbedPane1.addTab("October", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel33.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 530, 50));

        jLabel34.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel34.setText("=");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 20, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 310, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel35.setText("=");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 270, 20));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 310, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel32.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 310, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel36.setText("=");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 270, 20));

        jLabel37.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel37.setText("=");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 20, 20));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 310, -1));

        jTabbedPane1.addTab("January", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel38.setText("Net profit (RM) = Total revenue - Cost of Car Sold -Total expenses  ");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 50));

        jLabel39.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel39.setText("=");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 20));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 330, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel40.setText("=");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 270, 20));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 330, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel41.setText("Net Profit Margin=(  Net Profit / Total Revenue ​  )×100%");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel42.setText("=");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 80, 20));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 320, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel43.setText("=");
        jPanel9.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, 20));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 320, -1));

        jTabbedPane1.addTab("February", jPanel9);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 250));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 250));

        jButton1.setText("MergeDataset");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 90, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setText("Press the \"MergeDataset\" and reload");
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 310, 60));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setText("Press enter to load the value in the text field");
        add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 280, 20));

        ReloadButton.setText("Reload");
        ReloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadButtonActionPerformed(evt);
            }
        });
        add(ReloadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if (sumDecember != 0 && costDecember != 0) {
            try {
                jTextField1.setText(Integer.toString(sumDecember) + "-" + Integer.toString(costDecember) + "-" + Double.toString(expense));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField1.setText("0.0");
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

        if (sumJanuary != 0 && costJanuary != 0) {
            try {
                jTextField2.setText(Double.toString(sumJanuary - costJanuary - expense));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField2.setText("0.0");
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        if (sumJanuary != 0 && costJanuary != 0) {
            try {
                jTextField3.setText("(" + Double.toString(sumJanuary - costJanuary - expense) + "/" + Integer.toString(costJanuary) + ")" + "x100%");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField3.setText("0.0");
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        if (sumJanuary != 0 && costJanuary != 0) {
            try {
                double margin = (sumJanuary - costJanuary - expense) / costJanuary * 100;
                String formattedMargin = String.format("%.2f", margin);
                jTextField4.setText(formattedMargin + "%");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField4.setText("0.0");
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        run();
    }

    public void run() {
        String salesFilePath = "src\\sales.csv";
        String vehicleFilePath = "src\\vehicle.csv";

        try {
            // Load datasets
            List<String> salesDataset = loadDataset(salesFilePath);
            List<String> vehicleDataset = loadDataset(vehicleFilePath);

            // Merge datasets based on the "carPlate" column
            List<String> mergedDataset = mergeDatasets(salesDataset, vehicleDataset, "carPlate");
            writeMergedContentToFile("src\\newdataset.csv", mergedDataset);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> loadDataset(String filePath) throws IOException {
        List<String> dataset = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                dataset.add(line);
            }
        }
        return dataset;
    }

    public List<String> mergeDatasets(List<String> dataset1, List<String> dataset2, String keyColumn) {
        List<String> mergedDataset = new ArrayList<>();
        Map<String, String> mapDataset2 = createMapFromDataset(dataset2, keyColumn);

        for (String row : dataset1) {
            String[] columns = row.split(",");
            String key = columns[2].trim();

            if (mapDataset2.containsKey(key)) {
                mergedDataset.add(row + "," + mapDataset2.get(key));
            }
        }

        return mergedDataset;
    }

    public Map<String, String> createMapFromDataset(List<String> dataset, String keyColumn) {
        Map<String, String> mapDataset = new HashMap<>();

        for (String row : dataset) {
            String[] columns = row.split(",");
            mapDataset.put(columns[0].trim(), row);
        }

        return mapDataset;
    }

    public void writeMergedContentToFile(String filePath, List<String> content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : content) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        if (sumFebruary != 0 && costFebruary != 0) {
            try {
                jTextField5.setText(Integer.toString(sumFebruary) + "-" + Integer.toString(costFebruary) + "-" + Double.toString(expense));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField5.setText("0.0");
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        if (sumFebruary != 0 && costFebruary != 0) {
            try {
                jTextField6.setText(Double.toString(sumFebruary - costFebruary - expense));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField6.setText("0.0");
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        if (sumFebruary != 0 && costFebruary != 0) {
            try {
                jTextField7.setText("(" + Double.toString(sumFebruary - costFebruary - expense) + "/" + Integer.toString(costFebruary) + ")" + "x100%");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField7.setText("0.0");
        }
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        if (sumFebruary != 0 && costFebruary != 0) {
            try {
                double margin = (sumFebruary - costFebruary - expense) / costFebruary * 100;
                String formattedMargin = String.format("%.2f", margin);
                jTextField8.setText(formattedMargin + "%");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            jTextField8.setText("0.0");
        }
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void ReloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadButtonActionPerformed
        // TODO add your handling code here:
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();

        // Create a new JFrame
        JFrame newFrame = new JFrame("Chart Application");

        // Instantiate your Practice5 class
        ProfitMargin practice5 = new ProfitMargin();

        // Add the Practice5 panel to the new JFrame
        newFrame.getContentPane().add(practice5);

        // Set JFrame properties
        newFrame.setSize(1233, 661);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLocationRelativeTo(null); // Center the frame on the screen

        // Make the new JFrame visible
        newFrame.setVisible(true);
    }//GEN-LAST:event_ReloadButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReloadButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel panellinechart;
    // End of variables declaration//GEN-END:variables
}
