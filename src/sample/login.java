
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class login extends JFrame implements ActionListener {
    private Container c;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JPasswordField passText;
    private JButton loginButton;
    private JLabel message;

    public login() {
        setTitle("Login Form");
        setBounds(300, 90, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        userLabel.setSize(100, 20);
        userLabel.setLocation(50, 50);
        c.add(userLabel);

        userText = new JTextField();
        userText.setFont(new Font("Arial", Font.PLAIN, 15));
        userText.setSize(150, 20);
        userText.setLocation(150, 50);
        c.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passLabel.setSize(100, 20);
        passLabel.setLocation(50, 100);
        c.add(passLabel);

        passText = new JPasswordField();
        passText.setFont(new Font("Arial", Font.PLAIN, 15));
        passText.setSize(150, 20);
        passText.setLocation(150, 100);
        c.add(passText);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
        loginButton.setSize(100, 20);
        loginButton.setLocation(150, 150);
        loginButton.addActionListener(this);
        c.add(loginButton);

        message = new JLabel("");
        message.setFont(new Font("Arial", Font.PLAIN, 15));
        message.setSize(300, 25);
        message.setLocation(50, 200);
        c.add(message);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String userName = userText.getText();
        String password = new String(passText.getPassword());

        if (userName.equals("admin") && password.equals("admin")) {
            message.setText("Login successful!");
        } else {
            message.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new login();
    }
}