import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();
        
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(submitButton);
        frame.add(clearButton);

        // Define action listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle submit button click
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Registration Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match.");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle clear button click
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                confirmPasswordField.setText("");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
