/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FineDine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;
import org.mindrot.jbcrypt.BCrypt;

public class ForgotPasswordDialog extends JDialog {
    private JTextField txtEmail;
    private JPasswordField txtNewPassword, txtConfirmPassword;

    public ForgotPasswordDialog() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Password Reset");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setModal(true);
        setLayout(new GridLayout(5, 1, 10, 10));
        getContentPane().setBackground(Color.WHITE);

        // Email Field
        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        txtEmail = new JTextField(20);
        emailPanel.add(new JLabel("Email:"));
        emailPanel.add(txtEmail);

        // New Password Field
        JPanel newPassPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        txtNewPassword = new JPasswordField(20);
        newPassPanel.add(new JLabel("New Password:"));
        newPassPanel.add(txtNewPassword);

        // Confirm Password Field
        JPanel confirmPassPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        txtConfirmPassword = new JPasswordField(20);
        confirmPassPanel.add(new JLabel("Confirm Password:"));
        confirmPassPanel.add(txtConfirmPassword);

        // Reset Button
        JButton btnReset = new JButton("Reset Password");
        btnReset.addActionListener(this::resetPasswordAction);

        add(emailPanel);
        add(newPassPanel);
        add(confirmPassPanel);
        add(btnReset);
    }

    private void resetPasswordAction(ActionEvent evt) {
        String email = txtEmail.getText().trim().toLowerCase();
        String newPassword = new String(txtNewPassword.getPassword());
        String confirmPassword = new String(txtConfirmPassword.getPassword());

        if (email.isEmpty() || newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!");
            return;
        }

        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/finedineresturant",
            "root",
            "Unam@123#"
        )) {
            // 1. Check if email exists
            String checkSql = "SELECT id FROM users WHERE email = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, email);
            
            ResultSet rs = checkStmt.executeQuery();
            
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "Email not found!");
                return;
            }

            // 2. Update password
            String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
            String updateSql = "UPDATE users SET password = ? WHERE email = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, hashedPassword);
            updateStmt.setString(2, email);
            
            int affectedRows = updateStmt.executeUpdate();
            
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Password updated successfully!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password update failed!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}