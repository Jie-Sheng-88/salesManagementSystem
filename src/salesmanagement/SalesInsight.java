package salesmanagement;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;

public class SalesInsight extends javax.swing.JPanel {

    int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0;
    private static String employeeID;
    FilterandSum o = new FilterandSum();

    public SalesInsight(String employeeID) {
        this.employeeID = employeeID;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        salesInformation = new javax.swing.JLabel();
        JavaRides = new javax.swing.JLabel();
        since2004 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LeCars = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 153, 102));
        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 25)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/12.png"))); // NOI18N
        jLabel4.setText("Total sales cases by month");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 490, -1));

        jLabel2.setBackground(new java.awt.Color(255, 153, 102));
        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 25)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/12.png"))); // NOI18N
        jLabel2.setText("Total sales cases of each employee        ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 540, -1));

        jLabel5.setBackground(new java.awt.Color(255, 153, 102));
        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 25)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/12.png"))); // NOI18N
        jLabel5.setText("Customer Engagement");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 490, -1));

        jLabel6.setBackground(new java.awt.Color(255, 153, 102));
        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 25)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/12.png"))); // NOI18N
        jLabel6.setText("Total sales by month");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 490, -1));

        jLabel3.setBackground(new java.awt.Color(255, 153, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 25)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/12.png"))); // NOI18N
        jLabel3.setText("Acquire price by month");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 500, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jButton2.setText("Chart");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 100, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jButton3.setText("Chart");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 100, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jButton1.setText("Chart");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 100, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jButton4.setText("Chart");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 100, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jButton5.setText("Chart");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 100, -1));

        salesInformation.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 40)); // NOI18N
        salesInformation.setText("Sales Information");
        add(salesInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        JavaRides.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        JavaRides.setText("JavaRides");
        add(JavaRides, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 110, 20));

        since2004.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        since2004.setText("-- SINCE 2004 --");
        add(since2004, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 40, 80, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Press the \"MergeDataset\" and reload for the first time to load the data");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,80));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 700, 370));

        LeCars.setFont(new java.awt.Font("Freestyle Script", 0, 50)); // NOI18N
        LeCars.setText(" LeCars");
        add(LeCars, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 110, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("Reload");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 70, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("Merge Dataset");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 140, 30));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/3.png"))); // NOI18N
        background.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                backgroundComponentRemoved(evt);
            }
        });
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
    }// </editor-fold>//GEN-END:initComponents

    public static void SalesInsight() {
        JFrame frame = new JFrame("Chart Application");
        SalesInsight sales = new SalesInsight(employeeID);
        frame.getContentPane().add(sales);
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String file = "src\\sales.csv";
        CategoryDataset dataset = createDataset(file);

        JFreeChart chart = ChartFactory.createBarChart(
                "Sales per Employee",
                "Employee ID",
                "Number of Cases Sales",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setDomainAxis(new CategoryAxis("Employee Id"));
        plot.setRangeAxis(new NumberAxis("Total Sales Cases"));

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        Color color = new Color(79, 129, 189);
        renderer.setSeriesPaint(0, color);

        plot.setBackgroundPaint(new Color(240, 240, 240));
        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Bar Chart Application");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private CategoryDataset createDataset(String file) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Map<String, Integer> employeeCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean firstRow = true;
            while ((line = reader.readLine()) != null) {
                if (firstRow) {
                    firstRow = false;
                    continue;
                }

                String[] row = line.split(",");
                String employeeId = row[4].trim();

                employeeCountMap.put(employeeId, employeeCountMap.getOrDefault(employeeId, 0) + 1);
            }

            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(employeeCountMap.entrySet());
            sortedEntries.sort(Map.Entry.comparingByValue());

            for (Map.Entry<String, Integer> entry : sortedEntries) {
                dataset.addValue(entry.getValue(), "Number of Sales", entry.getKey());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataset;


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String file = "src\\sales.csv";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                String dateTimeString = row[1].trim();

                if (dateTimeString.contains("2023-06")) {
                    count++;
                }
                if (dateTimeString.contains("2023-07")) {
                    count1++;
                }
                if (dateTimeString.contains("2023-08")) {
                    count2++;
                }
                if (dateTimeString.contains("2023-09")) {
                    count3++;
                }
                if (dateTimeString.contains("2023-10")) {
                    count4++;
                }
                if (dateTimeString.contains("2023-11")) {
                    count5++;
                }
                if (dateTimeString.contains("2023-12")) {
                    count6++;
                }
                if (dateTimeString.contains("2024-01")) {
                    count7++;
                }
                if (dateTimeString.contains("2024-02")) {
                    count8++;
                }

            }

            JFreeChart lineChart = createLineChart();

            displayChart(lineChart);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private JFreeChart createLineChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(count, "Months", "June 2023");
        dataset.addValue(count1, "Months", "July 2023");
        dataset.addValue(count2, "Months", "August 2023");
        dataset.addValue(count3, "Months", "September 2023");
        dataset.addValue(count4, "Months", "October 2023");
        dataset.addValue(count5, "Months", "November 2023");
        dataset.addValue(count6, "Months", "December 2023");
        dataset.addValue(count7, "Months", "January 2024");
        dataset.addValue(count8, "Months", "February 2024");

        JFreeChart lineChart = ChartFactory.createLineChart(
                "Total Sales Cases by months",
                "Months",
                "Total sales count",
                dataset
        );
        ChartAppearance(lineChart);

        return lineChart;
    }

    private void ChartAppearance(JFreeChart chart) {
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        plot.setBackgroundPaint(Color.BLACK);

        plot.getRenderer().setSeriesPaint(0, Color.YELLOW);
    }

    private static void displayChart(JFreeChart chart) {
        JFrame frame = new JFrame();
        frame.setTitle("Line Chart");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));

        frame.add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String file = "src\\sales.csv";
        DefaultPieDataset pieDataset = createDataset1(file);

        JFreeChart chart = ChartFactory.createPieChart(
                "Customer Engagement",
                pieDataset,
                true,
                true,
                false
        );
        PiePlot plot = (PiePlot) chart.getPlot();

        plot.setBackgroundPaint(new Color(240, 240, 240));
        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Pie Chart Application");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private DefaultPieDataset createDataset1(String file) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        Map<String, Integer> custCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean firstRow = true;
            while ((line = reader.readLine()) != null) {
                if (firstRow) {

                    firstRow = false;
                    continue;
                }

                String[] row = line.split(",");
                String custId = row[3].trim();

                custCountMap.put(custId, custCountMap.getOrDefault(custId, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : custCountMap.entrySet()) {
                dataset.setValue(entry.getKey(), entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataset;


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            String filePath = "src\\newdataset.csv";
            String dateTimePattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
            LocalDateTime startDateJune = LocalDateTime.parse("2023-06-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateJuly = LocalDateTime.parse("2023-07-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateAugust = LocalDateTime.parse("2023-08-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateSeptember = LocalDateTime.parse("2023-09-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateOctober = LocalDateTime.parse("2023-10-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateNovember = LocalDateTime.parse("2023-11-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateDecember = LocalDateTime.parse("2023-12-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateJanuary = LocalDateTime.parse("2024-01-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateFebruary = LocalDateTime.parse("2024-02-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJune = LocalDateTime.parse("2023-06-30T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJuly = LocalDateTime.parse("2023-07-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateAugust = LocalDateTime.parse("2023-08-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateSeptember = LocalDateTime.parse("2023-09-30T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateOctober = LocalDateTime.parse("2023-10-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateNovember = LocalDateTime.parse("2023-11-30T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateDecember = LocalDateTime.parse("2023-12-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJanuary = LocalDateTime.parse("2024-01-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateFebruary = LocalDateTime.parse("2024-02-29T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));

            List<Integer> salesJune = o.filterSalesPrice(filePath, startDateJune, endDateJune, dateTimePattern);
            List<Integer> salesJuly = o.filterSalesPrice(filePath, startDateJuly, endDateJuly, dateTimePattern);
            List<Integer> salesAugust = o.filterSalesPrice(filePath, startDateAugust, endDateAugust, dateTimePattern);
            List<Integer> salesSeptember = o.filterSalesPrice(filePath, startDateSeptember, endDateSeptember, dateTimePattern);
            List<Integer> salesOctober = o.filterSalesPrice(filePath, startDateOctober, endDateOctober, dateTimePattern);
            List<Integer> salesNovember = o.filterSalesPrice(filePath, startDateNovember, endDateNovember, dateTimePattern);
            List<Integer> salesDecember = o.filterSalesPrice(filePath, startDateDecember, endDateDecember, dateTimePattern);
            List<Integer> salesJanuary = o.filterSalesPrice(filePath, startDateJanuary, endDateJanuary, dateTimePattern);
            List<Integer> salesFebruary = o.filterSalesPrice(filePath, startDateFebruary, endDateFebruary, dateTimePattern);

            int sumJune = o.calculateSum(salesJune);
            int sumJuly = o.calculateSum(salesJuly);
            int sumAugust = o.calculateSum(salesAugust);
            int sumSeptember = o.calculateSum(salesSeptember);
            int sumOctober = o.calculateSum(salesOctober);
            int sumNovember = o.calculateSum(salesNovember);
            int sumDecember = o.calculateSum(salesDecember);
            int sumJanuary = o.calculateSum(salesJanuary);
            int sumFebruary = o.calculateSum(salesFebruary);

            createBarChart(sumJune, sumJuly, sumAugust, sumSeptember, sumOctober, sumNovember, sumDecember, sumJanuary, sumFebruary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createBarChart(int sumJune, int sumJuly, int sumAugust, int sumSeptember, int sumOctober, int sumNovember, int sumDecember, int sumJanuary, int sumFebruary) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(sumJune, "Sales", "June 2023");
        dataset.addValue(sumJuly, "Sales", "July 2023");
        dataset.addValue(sumAugust, "Sales", "August 2023");
        dataset.addValue(sumSeptember, "Sales", "September 2023");
        dataset.addValue(sumOctober, "Sales", "October 2023");
        dataset.addValue(sumNovember, "Sales", "November 2023");
        dataset.addValue(sumDecember, "Sales", "December 2023");
        dataset.addValue(sumJanuary, "Sales", "January 2024");
        dataset.addValue(sumFebruary, "Sales", "February 2024");

        JFreeChart chart = ChartFactory.createBarChart(
                "Total Sales by Month",
                "Month",
                "Total Sales",
                dataset
        );
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDomainAxis(new CategoryAxis("Month"));
        plot.setRangeAxis(new NumberAxis("Total Sales"));

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        Color color = new Color(79, 129, 189);
        renderer.setSeriesPaint(0, color);

        plot.setBackgroundPaint(new Color(240, 240, 240));
        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Bar Chart Application");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String filePath = "src\\newdataset.csv";
            String dateTimePattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
            LocalDateTime startDateJune = LocalDateTime.parse("2023-06-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateJuly = LocalDateTime.parse("2023-07-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateAugust = LocalDateTime.parse("2023-08-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateSeptember = LocalDateTime.parse("2023-09-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateOctober = LocalDateTime.parse("2023-10-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateNovember = LocalDateTime.parse("2023-11-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateDecember = LocalDateTime.parse("2023-12-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateJanuary = LocalDateTime.parse("2024-01-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime startDateFebruary = LocalDateTime.parse("2024-02-01T00:00:00+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJune = LocalDateTime.parse("2023-06-30T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJuly = LocalDateTime.parse("2023-07-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateAugust = LocalDateTime.parse("2023-08-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateSeptember = LocalDateTime.parse("2023-09-30T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateOctober = LocalDateTime.parse("2023-10-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateNovember = LocalDateTime.parse("2023-11-30T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateDecember = LocalDateTime.parse("2023-12-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateJanuary = LocalDateTime.parse("2024-01-31T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));
            LocalDateTime endDateFebruary = LocalDateTime.parse("2024-02-29T23:59:59+00:00", DateTimeFormatter.ofPattern(dateTimePattern));

            List<Integer> accquireJune = o.filterAccquirePrice(filePath, startDateJune, endDateJune, dateTimePattern);
            List<Integer> accquireJuly = o.filterAccquirePrice(filePath, startDateJuly, endDateJuly, dateTimePattern);
            List<Integer> accquireAugust = o.filterAccquirePrice(filePath, startDateAugust, endDateAugust, dateTimePattern);
            List<Integer> accquireSeptember = o.filterAccquirePrice(filePath, startDateSeptember, endDateSeptember, dateTimePattern);
            List<Integer> accquireOctober = o.filterAccquirePrice(filePath, startDateOctober, endDateOctober, dateTimePattern);
            List<Integer> accquireNovember = o.filterAccquirePrice(filePath, startDateNovember, endDateNovember, dateTimePattern);
            List<Integer> accquireDecember = o.filterAccquirePrice(filePath, startDateDecember, endDateDecember, dateTimePattern);
            List<Integer> accquireJanuary = o.filterAccquirePrice(filePath, startDateJanuary, endDateJanuary, dateTimePattern);
            List<Integer> accquireFebruary = o.filterAccquirePrice(filePath, startDateFebruary, endDateFebruary, dateTimePattern);

            int sumJune = o.calculateSum1(accquireJune);
            int sumJuly = o.calculateSum1(accquireJuly);
            int sumAugust = o.calculateSum1(accquireAugust);
            int sumSeptember = o.calculateSum1(accquireSeptember);
            int sumOctober = o.calculateSum1(accquireOctober);
            int sumNovember = o.calculateSum1(accquireNovember);
            int sumDecember = o.calculateSum1(accquireDecember);
            int sumJanuary = o.calculateSum1(accquireJanuary);
            int sumFebruary = o.calculateSum1(accquireFebruary);

            createBarChart2(sumJune, sumJuly, sumAugust, sumSeptember, sumOctober, sumNovember, sumDecember, sumJanuary, sumFebruary);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createBarChart2(int sumJune, int sumJuly, int sumAugust, int sumSeptember, int sumOctober, int sumNovember, int sumDecember, int sumJanuary, int sumFebruary) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(sumJune, "Cost", "June 2023");
        dataset.addValue(sumJuly, "Cost", "July 2023");
        dataset.addValue(sumAugust, "Cost", "August 2023");
        dataset.addValue(sumSeptember, "Cost", "September 2023");
        dataset.addValue(sumOctober, "Cost", "October 2023");
        dataset.addValue(sumNovember, "Cost", "November 2023");
        dataset.addValue(sumDecember, "Cost", "December 2023");
        dataset.addValue(sumJanuary, "Cost", "January 2024");
        dataset.addValue(sumFebruary, "Cost", "February 2024");

        JFreeChart chart = ChartFactory.createBarChart(
                "Total Acquire Cost of cars by Month",
                "Month",
                "Total Acquire Cost",
                dataset
        );
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setDomainAxis(new CategoryAxis("Month"));
        plot.setRangeAxis(new NumberAxis("Total Acquire Cost"));

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        Color color = new Color(79, 129, 189);
        renderer.setSeriesPaint(0, color);

        plot.setBackgroundPaint(new Color(240, 240, 240));
        ChartPanel chartPanel = new ChartPanel(chart);

        JFrame frame = new JFrame("Bar Chart Application1");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void backgroundComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_backgroundComponentRemoved

    }//GEN-LAST:event_backgroundComponentRemoved

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();

        JFrame newFrame = new JFrame("Chart Application");

        SalesInsight sales = new SalesInsight(employeeID);

        newFrame.getContentPane().add(sales);

        newFrame.setSize(900, 600);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLocationRelativeTo(null);

        newFrame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        run();
    }

    public void run() {
        String salesFilePath = "src\\sales.csv";
        String vehicleFilePath = "src\\vehicle.csv";

        try {
            List<String> salesDataset = loadDataset(salesFilePath);
            List<String> vehicleDataset = loadDataset(vehicleFilePath);

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
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        InfoViewManagement infoViewManagement = new InfoViewManagement(employeeID);
        infoViewManagement.InfoViewManagement();
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaRides;
    private javax.swing.JLabel LeCars;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel salesInformation;
    private javax.swing.JLabel since2004;
    // End of variables declaration//GEN-END:variables
}
