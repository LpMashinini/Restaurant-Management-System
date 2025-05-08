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

public class RegisterForm extends JFrame {
    private JTextField txtFullName, txtEmail;
    private JPasswordField txtPassword, txtConfirmPassword;
    private JComboBox<String> roleComboBox;

    public RegisterForm() {
        initComponents();
        DatabaseHelper.createTable();
    }

    private void initComponents() {
        setTitle("Fine Dine - Create Account");
        setSize(400, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        // Card Panel
        JPanel cardPanel = new JPanel();
        cardPanel.setPreferredSize(new Dimension(340, 580));
        cardPanel.setBackground(new Color(240, 248, 255));
        cardPanel.setLayout(new BoxLayout(cardPanel, BoxLayout.Y_AXIS));
        cardPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 102), 2));

        // Logo
        JLabel logoLabel = new JLabel();
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/logoIcon.png"));
            logoLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        } catch (Exception e) {
            logoLabel.setText("Logo Missing");
        }
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));

        // Title
        JLabel titleLabel = new JLabel("CREATE ACCOUNT");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 51, 102));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

        // Form fields
        txtFullName = new JTextField();
        txtEmail = new JTextField();
        txtPassword = new JPasswordField();
        txtConfirmPassword = new JPasswordField();

        styleTextField(txtFullName, "Full Name");
        styleTextField(txtEmail, "Email");
        styleTextField(txtPassword, "Password");
        styleTextField(txtConfirmPassword, "Confirm Password");

        // Role ComboBox
        JLabel roleLabel = new JLabel("SELECT ROLE");
        roleLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
        roleLabel.setForeground(new Color(0, 51, 102));
        roleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        roleComboBox = new JComboBox<>(new String[]{"Customer", "Admin"});
        roleComboBox.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        roleComboBox.setFont(new Font("SansSerif", Font.PLAIN, 14));
        roleComboBox.setBackground(Color.LIGHT_GRAY);
        roleComboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Register button
        JButton btnRegister = new JButton("REGISTER");
        btnRegister.setFont(new Font("SansSerif", Font.BOLD, 14));
        btnRegister.setBackground(new Color(0, 102, 153));
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFocusPainted(false);
        btnRegister.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegister.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        btnRegister.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnRegister.addActionListener(this::registerAction);

        // Footer link
        JLabel lblLogin = new JLabel("already have an account login");
        lblLogin.setFont(new Font("SansSerif", Font.PLAIN, 12));
        lblLogin.setForeground(Color.GRAY);
        lblLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblLogin.setBorder(BorderFactory.createEmptyBorder(15, 0, 10, 0));
        lblLogin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                new LoginForm().setVisible(true);
                dispose();
            }
        });

        // Add components to card
        cardPanel.add(logoLabel);
        cardPanel.add(titleLabel);
        cardPanel.add(txtFullName);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        cardPanel.add(txtEmail);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        cardPanel.add(txtPassword);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        cardPanel.add(txtConfirmPassword);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        cardPanel.add(roleLabel);
        cardPanel.add(roleComboBox);
        cardPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        cardPanel.add(btnRegister);
        cardPanel.add(lblLogin);

        add(cardPanel);
    }

    private void styleTextField(JTextField field, String placeholder) {
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        field.setFont(new Font("SansSerif", Font.PLAIN, 14));
        field.setBackground(Color.WHITE);
        field.setForeground(Color.GRAY);
        field.setText(placeholder);
        field.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
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

    private void registerAction(ActionEvent evt) {
        String fullName = txtFullName.getText().trim();
        String email = txtEmail.getText().trim().toLowerCase();
        String password = new String(txtPassword.getPassword()).trim();
        String confirmPassword = new String(txtConfirmPassword.getPassword()).trim();
        String role = roleComboBox.getSelectedItem().toString();
        
        if (!role.equals("Customer") && !role.equals("Admin")) {
        JOptionPane.showMessageDialog(this, "Invalid role selected!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

        
        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        try (Connection conn = DatabaseHelper.getConnection()) {
            String sql = "INSERT INTO users (full_name, email, password, role) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, fullName);
            pstmt.setString(2, email);
            pstmt.setString(3, hashedPassword);
            pstmt.setString(4, role);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registration successful!");
            new LoginForm().setVisible(true);
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "This account already exists " + JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegisterForm().setVisible(true);
        });
    }
}
