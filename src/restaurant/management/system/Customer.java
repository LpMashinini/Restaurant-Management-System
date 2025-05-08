
import java.awt.Color;

public class Customer extends javax.swing.JFrame {

    public Customer() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        logoFineDine = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ordersLabel = new javax.swing.JLabel();
        reservationLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        reviewsLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(30, 81, 123));

        logoFineDine.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Downloads\\fine dine new white pixel bg removed.png")); // NOI18N
        logoFineDine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoFineDineMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINE DINE");

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
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoFineDine)
                            .addComponent(jLabel1))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoFineDine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(39, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reviewsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(menuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ordersLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reservationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ordersLabel)
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
                .addGap(0, 217, Short.MAX_VALUE))
        );

        topPanel.setBackground(new java.awt.Color(30, 81, 123));

        jLabel24.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Welcome back,");

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bradley Johnsons");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1212, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoFineDineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoFineDineMouseClicked
        logoFineDine.setVisible(true);
    }//GEN-LAST:event_logoFineDineMouseClicked

    private void ordersLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseEntered
        ordersLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_ordersLabelMouseEntered

    private void ordersLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersLabelMouseExited
        ordersLabel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_ordersLabelMouseExited

    private void reservationLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationLabelMouseEntered
        reservationLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_reservationLabelMouseEntered

    private void reservationLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationLabelMouseExited
        reservationLabel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_reservationLabelMouseExited

    private void menuLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseEntered
        menuLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_menuLabelMouseEntered

    private void menuLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseExited
        menuLabel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_menuLabelMouseExited

    private void reviewsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewsLabelMouseEntered
        reviewsLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_reviewsLabelMouseEntered

    private void reviewsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewsLabelMouseExited
        reviewsLabel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_reviewsLabelMouseExited

    private void settingsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseEntered
        settingsLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_settingsLabelMouseEntered

    private void settingsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseExited
        settingsLabel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_settingsLabelMouseExited

    private void logoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseEntered
        logoutLabel.setBackground(new Color(137, 196, 244));
    }//GEN-LAST:event_logoutLabelMouseEntered

    private void logoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseExited
        logoutLabel.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_logoutLabelMouseExited

    private void menuLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLabelMouseClicked

        /*
        new MenuManagement("Customer").setVisible(true);
        this.dispose();
        */
    }//GEN-LAST:event_menuLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoFineDine;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel ordersLabel;
    private javax.swing.JLabel reservationLabel;
    private javax.swing.JLabel reviewsLabel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
