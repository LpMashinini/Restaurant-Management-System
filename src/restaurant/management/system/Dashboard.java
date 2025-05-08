
import java.awt.Color;

public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboard = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoFineDine = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ordersLabel = new javax.swing.JLabel();
        dashboardLabel = new javax.swing.JLabel();
        staffLabel = new javax.swing.JLabel();
        reservationLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        inventoryLabel = new javax.swing.JLabel();
        reviewsLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalOrdersPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        customersPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pieChart = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        salesOverview = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        revenueExpenses = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        topMenuItems = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(30, 81, 123));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINE DINE");

        logoFineDine.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\fine dine new white pixel bg removed.png")); // NOI18N
        logoFineDine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoFineDineMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Exceptional Dining Experience");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoFineDine)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoFineDine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ordersLabel.setBackground(new java.awt.Color(255, 255, 255));
        ordersLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        ordersLabel.setForeground(new java.awt.Color(0, 0, 0));
        ordersLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\order pixel.png")); // NOI18N
        ordersLabel.setText("Orders");
        ordersLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordersLabel.setOpaque(true);
        ordersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ordersLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ordersLabelMouseExited(evt);
            }
        });

        dashboardLabel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(0, 0, 0));
        dashboardLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\dashboard (1) pixel.png")); // NOI18N
        dashboardLabel.setText("Dashboard");
        dashboardLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardLabel.setOpaque(true);
        dashboardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardLabelMouseExited(evt);
            }
        });

        staffLabel.setBackground(new java.awt.Color(255, 255, 255));
        staffLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        staffLabel.setForeground(new java.awt.Color(0, 0, 0));
        staffLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\staff pixel.png")); // NOI18N
        staffLabel.setText("Staff");
        staffLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        staffLabel.setOpaque(true);
        staffLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staffLabelMouseExited(evt);
            }
        });

        reservationLabel.setBackground(new java.awt.Color(255, 255, 255));
        reservationLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        reservationLabel.setForeground(new java.awt.Color(0, 0, 0));
        reservationLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\booking pixel.png")); // NOI18N
        reservationLabel.setText("Reservations");
        reservationLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reservationLabel.setOpaque(true);
        reservationLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reservationLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reservationLabelMouseExited(evt);
            }
        });

        menuLabel.setBackground(new java.awt.Color(255, 255, 255));
        menuLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(0, 0, 0));
        menuLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\menu pixel.png")); // NOI18N
        menuLabel.setText("Menu");
        menuLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuLabel.setOpaque(true);
        menuLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuLabelMouseExited(evt);
            }
        });

        inventoryLabel.setBackground(new java.awt.Color(255, 255, 255));
        inventoryLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        inventoryLabel.setForeground(new java.awt.Color(0, 0, 0));
        inventoryLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\inventory pixel.png")); // NOI18N
        inventoryLabel.setText("Inventory");
        inventoryLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryLabel.setOpaque(true);
        inventoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryLabelMouseExited(evt);
            }
        });

        reviewsLabel.setBackground(new java.awt.Color(255, 255, 255));
        reviewsLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        reviewsLabel.setForeground(new java.awt.Color(0, 0, 0));
        reviewsLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\feedback pixel.png")); // NOI18N
        reviewsLabel.setText("Reviews");
        reviewsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reviewsLabel.setOpaque(true);
        reviewsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reviewsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reviewsLabelMouseExited(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel21.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Account");

        settingsLabel.setBackground(new java.awt.Color(255, 255, 255));
        settingsLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        settingsLabel.setForeground(new java.awt.Color(0, 0, 0));
        settingsLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\settings pixel.png")); // NOI18N
        settingsLabel.setText("Settings");
        settingsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsLabel.setOpaque(true);
        settingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsLabelMouseExited(evt);
            }
        });

        logoutLabel.setBackground(new java.awt.Color(255, 255, 255));
        logoutLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(0, 0, 0));
        logoutLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\logout pixel.png")); // NOI18N
        logoutLabel.setText("Logout");
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.setOpaque(true);
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reviewsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ordersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboardLabel)
                .addGap(18, 18, 18)
                .addComponent(ordersLabel)
                .addGap(18, 18, 18)
                .addComponent(reservationLabel)
                .addGap(18, 18, 18)
                .addComponent(staffLabel)
                .addGap(18, 18, 18)
                .addComponent(menuLabel)
                .addGap(18, 18, 18)
                .addComponent(inventoryLabel)
                .addGap(18, 18, 18)
                .addComponent(reviewsLabel)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(settingsLabel)
                .addGap(18, 18, 18)
                .addComponent(logoutLabel)
                .addGap(79, 79, 79))
        );

        titleLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 50)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("Dashboard");

        topPanel.setBackground(new java.awt.Color(30, 81, 123));

        jLabel24.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Welcome back,");

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gwembo Shitongolo");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        totalOrdersPanel.setBackground(new java.awt.Color(30, 81, 123));

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Orders");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("R450,430");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("6,250");

        javax.swing.GroupLayout totalOrdersPanelLayout = new javax.swing.GroupLayout(totalOrdersPanel);
        totalOrdersPanel.setLayout(totalOrdersPanelLayout);
        totalOrdersPanelLayout.setHorizontalGroup(
            totalOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalOrdersPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(89, 89, 89))
            .addGroup(totalOrdersPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        totalOrdersPanelLayout.setVerticalGroup(
            totalOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalOrdersPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(totalOrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        customersPanel.setBackground(new java.awt.Color(30, 81, 123));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Customers");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("3,200");

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Average Order Value");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("R240.34");

        javax.swing.GroupLayout customersPanelLayout = new javax.swing.GroupLayout(customersPanel);
        customersPanel.setLayout(customersPanelLayout);
        customersPanelLayout.setHorizontalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customersPanelLayout.createSequentialGroup()
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel13))
                    .addGroup(customersPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(103, 103, 103))))
        );
        customersPanelLayout.setVerticalGroup(
            customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pieChart.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\orders by category pixel.png")); // NOI18N

        javax.swing.GroupLayout pieChartLayout = new javax.swing.GroupLayout(pieChart);
        pieChart.setLayout(pieChartLayout);
        pieChartLayout.setHorizontalGroup(
            pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pieChartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        pieChartLayout.setVerticalGroup(
            pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pieChartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        salesOverview.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\sales overview pixel.png")); // NOI18N

        javax.swing.GroupLayout salesOverviewLayout = new javax.swing.GroupLayout(salesOverview);
        salesOverview.setLayout(salesOverviewLayout);
        salesOverviewLayout.setHorizontalGroup(
            salesOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        salesOverviewLayout.setVerticalGroup(
            salesOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        revenueExpenses.setBackground(new java.awt.Color(255, 255, 255));
        revenueExpenses.setForeground(new java.awt.Color(204, 204, 204));

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\revenue and expenses pixel.png")); // NOI18N

        javax.swing.GroupLayout revenueExpensesLayout = new javax.swing.GroupLayout(revenueExpenses);
        revenueExpenses.setLayout(revenueExpensesLayout);
        revenueExpensesLayout.setHorizontalGroup(
            revenueExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, revenueExpensesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );
        revenueExpensesLayout.setVerticalGroup(
            revenueExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, revenueExpensesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        topMenuItems.setBackground(new java.awt.Color(30, 81, 123));

        jLabel27.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Top Menu Items");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dom Perigon");

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chocolate Souffle");

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Baked Alaska");

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dry Aged Ribeye");

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Venison Tenderloin Medallion");

        javax.swing.GroupLayout topMenuItemsLayout = new javax.swing.GroupLayout(topMenuItems);
        topMenuItems.setLayout(topMenuItemsLayout);
        topMenuItemsLayout.setHorizontalGroup(
            topMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(topMenuItemsLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        topMenuItemsLayout.setVerticalGroup(
            topMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(revenueExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalOrdersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(salesOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(totalOrdersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(customersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salesOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revenueExpenses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseEntered
        dashboardLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_dashboardLabelMouseEntered

    private void dashboardLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseExited
        dashboardLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_dashboardLabelMouseExited

    private void ordersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseEntered
        ordersLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_ordersLabelMouseEntered

    private void ordersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseExited
        ordersLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_ordersLabelMouseExited

    private void reservationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationLabelMouseEntered
        reservationLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_reservationLabelMouseEntered

    private void reservationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationLabelMouseExited
        reservationLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_reservationLabelMouseExited

    private void staffLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLabelMouseEntered
        staffLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_staffLabelMouseEntered

    private void staffLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLabelMouseExited
        staffLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_staffLabelMouseExited

    private void menuLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseEntered
        menuLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_menuLabelMouseEntered

    private void menuLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseExited
        menuLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_menuLabelMouseExited

    private void inventoryLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryLabelMouseEntered
        inventoryLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_inventoryLabelMouseEntered

    private void inventoryLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryLabelMouseExited
        inventoryLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_inventoryLabelMouseExited

    private void reviewsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewsLabelMouseEntered
        reviewsLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_reviewsLabelMouseEntered

    private void reviewsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewsLabelMouseExited
        reviewsLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_reviewsLabelMouseExited

    private void settingsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseEntered
        settingsLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_settingsLabelMouseEntered

    private void settingsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseExited
        settingsLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_settingsLabelMouseExited

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseEntered
        logoutLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_logoutLabelMouseEntered

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseExited
        logoutLabel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_logoutLabelMouseExited

    private void dashboardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabelMouseClicked
        dashboardLabel.setVisible(true);
    }//GEN-LAST:event_dashboardLabelMouseClicked

    private void logoFineDineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoFineDineMouseClicked
        logoFineDine.setVisible(true);
    }//GEN-LAST:event_logoFineDineMouseClicked

    private void menuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseClicked
        /*
        new MenuManagement("Manager").setVisible(true);
        this.dispose();
        */
    }//GEN-LAST:event_menuLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customersPanel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoFineDine;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel ordersLabel;
    private javax.swing.JPanel pieChart;
    private javax.swing.JLabel reservationLabel;
    private javax.swing.JPanel revenueExpenses;
    private javax.swing.JLabel reviewsLabel;
    private javax.swing.JPanel salesOverview;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel staffLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topMenuItems;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel totalOrdersPanel;
    // End of variables declaration//GEN-END:variables
}
