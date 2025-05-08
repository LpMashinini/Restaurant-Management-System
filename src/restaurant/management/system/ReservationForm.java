/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FineDine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReservationForm extends JFrame {
    private int userId;
    private JTextField txtName, txtPhone, txtEmail;
    private JSpinner dateSpinner, timeSpinner, spnPartySize;
    private JTextArea txtSpecialRequests;
    private JButton btnSubmit;

    public ReservationForm(int userId) {
        this.userId = userId;
        initComponents();
        setTitle("Reservations");
        setSize(416, 712);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    private void initComponents() {
        JPanel rootPanel = new JPanel(new BorderLayout());
        rootPanel.setBackground(Color.WHITE);

        // Header
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(25, 42, 86));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JLabel menuIcon = new JLabel("≡");
        menuIcon.setForeground(Color.WHITE);
        menuIcon.setFont(new Font("SansSerif", Font.BOLD, 20));
        headerPanel.add(menuIcon, BorderLayout.WEST);

        JLabel title = new JLabel("Reservations");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("SansSerif", Font.BOLD, 16));
        headerPanel.add(title, BorderLayout.CENTER);

        JLabel userIcon = new JLabel("⬤");
        userIcon.setForeground(Color.WHITE);
        userIcon.setFont(new Font("SansSerif", Font.BOLD, 18));
        headerPanel.add(userIcon, BorderLayout.EAST);

        rootPanel.add(headerPanel, BorderLayout.NORTH);

        // Main Content
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblTitle = new JLabel("New Reservation");
        lblTitle.setFont(new Font("SansSerif", Font.BOLD, 18));
        contentPanel.add(lblTitle);

        JLabel lblDate = new JLabel("Today, " + new SimpleDateFormat("MMMM d, yyyy").format(new Date()));
        lblDate.setFont(new Font("SansSerif", Font.PLAIN, 12));
        lblDate.setForeground(Color.GRAY);
        contentPanel.add(lblDate);

        contentPanel.add(Box.createVerticalStrut(15));

        contentPanel.add(createSection("Customer Information",
            txtName = createField("Full Name"),
            txtPhone = createField("Phone Number"),
            txtEmail = createField("Email")
        ));

        contentPanel.add(Box.createVerticalStrut(10));

        contentPanel.add(createSection("Reservation Details",
            createDateTimePanel(),
            spnPartySize = createSpinner("Party Size", 2, 1, 20)
        ));

        contentPanel.add(Box.createVerticalStrut(10));

        txtSpecialRequests = new JTextArea(4, 20);
        txtSpecialRequests.setLineWrap(true);
        txtSpecialRequests.setWrapStyleWord(true);
        txtSpecialRequests.setBorder(BorderFactory.createTitledBorder("Special Requests"));
        contentPanel.add(txtSpecialRequests);

        contentPanel.add(Box.createVerticalStrut(15));

        btnSubmit = new JButton("Submit Reservation");
        btnSubmit.setBackground(new Color(25, 42, 86));
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnSubmit.setFocusPainted(false);
        btnSubmit.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnSubmit.addActionListener(this::submitReservation);
        contentPanel.add(btnSubmit);

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setBorder(null);
        rootPanel.add(scrollPane, BorderLayout.CENTER);

        // Bottom Navigation
        JPanel navPanel = new JPanel();
        navPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        navPanel.setBackground(Color.WHITE);
        navPanel.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.LIGHT_GRAY));

        JLabel dashboardLabel = new JLabel("\u25A3 Dashboard");
        dashboardLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        navPanel.add(dashboardLabel);

        rootPanel.add(navPanel, BorderLayout.SOUTH);
        add(rootPanel);
    }

    private JPanel createSection(String title, JComponent... components) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createTitledBorder(title));

        for (JComponent comp : components) {
            panel.add(comp);
            panel.add(Box.createVerticalStrut(10));
        }
        return panel;
    }

    private JTextField createField(String placeholder) {
        JTextField field = new JTextField();
        field.setBorder(BorderFactory.createTitledBorder(placeholder));
        return field;
    }

    private JPanel createDateTimePanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2, 10, 0));
        panel.setBackground(Color.WHITE);

        dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "dd MMM yyyy");
        dateSpinner.setEditor(dateEditor);
        dateSpinner.setBorder(BorderFactory.createTitledBorder("Select Date"));

        timeSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setBorder(BorderFactory.createTitledBorder("Select Time"));

        panel.add(dateSpinner);
        panel.add(timeSpinner);

        return panel;
    }

    private JSpinner createSpinner(String title, int value, int min, int max) {
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(value, min, max, 1));
        spinner.setBorder(BorderFactory.createTitledBorder(title));
        return spinner;
    }

    private void submitReservation(ActionEvent e) {
        Date reservationDate = (Date) dateSpinner.getValue();
        Date reservationTime = (Date) timeSpinner.getValue();

        Timestamp timestamp = new Timestamp(reservationDate.getTime());
        timestamp.setHours(reservationTime.getHours());
        timestamp.setMinutes(reservationTime.getMinutes());

        try (Connection conn = DatabaseHelper.getConnection()) {
            String sql = "INSERT INTO reservations (user_id, reservation_date, party_size, special_requests) " +
                         "VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userId);
            pstmt.setTimestamp(2, timestamp);
            pstmt.setInt(3, (Integer) spnPartySize.getValue());
            pstmt.setString(4, txtSpecialRequests.getText());
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Reservation successful!");
            dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }
    }
}
