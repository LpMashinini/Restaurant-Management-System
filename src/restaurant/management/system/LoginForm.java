/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FineDine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import org.mindrot.jbcrypt.BCrypt;

public class LoginForm extends JFrame {
    private JTextField txtEmail;
    private JPasswordField txtPassword;

    public LoginForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Fine Dine - Login");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        // Main card panel
        JPanel cardPanel = new JPanel();
        cardPanel.setPreferredSize(new Dimension(340, 540));
        cardPanel.setBackground(Color.WHITE);
        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
        cardPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 102), 2));

        // Logo
        JLabel logoLabel = new JLabel();
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        logoLabel.setIcon(new ImageIcon(
            new ImageIcon(getClass().getResource("/images/logoIcon.png"))
                .getImage()
                .getScaledInstance(120, 120, Image.SCALE_SMOOTH)
        ));
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        // Title & subtitle
        JLabel titleLabel = new JLabel("Fine Dine");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 2, 0));

        JLabel subtitleLabel = new JLabel("Exceptional Dining Experience");
        subtitleLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        subtitleLabel.setForeground(Color.GRAY);
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

        // Fields
        txtEmail = new JTextField();
        styleTextField(txtEmail, "Email");

        txtPassword = new JPasswordField();
        styleTextField(txtPassword, "Password");

        // Login button
        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnLogin.setBackground(new Color(10, 49, 97));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnLogin.setFocusPainted(false);
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogin.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        btnLogin.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btnLogin.addActionListener(this::loginAction);

        // Demo info
        JLabel demoLabel = new JLabel("<html><center>For demo: admin/admin, customer/customer<br>Firebase authentication enabled</center></html>", SwingConstants.CENTER);
        demoLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        demoLabel.setForeground(Color.GRAY);
        demoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        demoLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Forgot Password
        JLabel forgotPassword = new JLabel("Forgot Password?");
        forgotPassword.setFont(new Font("SansSerif", Font.PLAIN, 13));
        forgotPassword.setForeground(new Color(255, 140, 0));
        forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgotPassword.setAlignmentX(Component.CENTER_ALIGNMENT);
        forgotPassword.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        forgotPassword.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        new ForgotPasswordDialog().setVisible(true);
    }
});


        // Create Account
        JLabel createAccount = new JLabel("CREATE ACCOUNT");
        createAccount.setFont(new Font("SansSerif", Font.PLAIN, 12));
        createAccount.setForeground(Color.GRAY);
        createAccount.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        createAccount.setAlignmentX(Component.CENTER_ALIGNMENT);
        createAccount.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));
        createAccount.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new RegisterForm().setVisible(true);
                dispose();
            }
        });

        // Add components to card
        cardPanel.add(logoLabel);
        cardPanel.add(titleLabel);
        cardPanel.add(subtitleLabel);
        cardPanel.add(txtEmail);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        cardPanel.add(txtPassword);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        cardPanel.add(btnLogin);
        cardPanel.add(demoLabel);
        cardPanel.add(forgotPassword);
        cardPanel.add(createAccount);

        add(cardPanel);
    }

    private void styleTextField(JTextField field, String placeholder) {
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        field.setFont(new Font("SansSerif", Font.PLAIN, 14));
        field.setBackground(Color.WHITE);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        field.setText(placeholder);
        field.setForeground(Color.GRAY);

        field.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (field.getText().equals(placeholder)) {
                    field.setText("");
                    field.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (field.getText().isEmpty()) {
                    field.setText(placeholder);
                    field.setForeground(Color.GRAY);
                }
            }
        });
    }

    private void loginAction(ActionEvent evt) {
        String email = txtEmail.getText().trim().toLowerCase();
        String password = new String(txtPassword.getPassword()).trim();

        if (email.isEmpty() || email.equals("email") || password.isEmpty() || password.equals("password")) {
            JOptionPane.showMessageDialog(this, "Please enter valid credentials.");
            return;
        }

        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/finedineresturant",
            "root",
            "Unam@123#"
        )) {
            String sql = "SELECT id, password FROM users WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String hashedPassword = rs.getString("password");
                int userId = rs.getInt("id");
                if (BCrypt.checkpw(password, hashedPassword)) {
                    ReservationForm reservationForm = new ReservationForm(userId);
                    reservationForm.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect password.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "User not found. Check email.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
