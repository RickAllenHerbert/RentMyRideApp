package za.ac.cput.view.usersetup;

import za.ac.cput.view.AccessPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    private JPanel panelWest, panelCenter;
    private JLabel lblImage, lblLoginText, lblUsername, lblFirstName, lblLastName, lblPassword, lblConfirmPassword, lblEmail;
    private JTextField txtUsername, txtPassword, txtFirstName, txtLastName, txtConfirmPassword, txtEmail;
    private JButton btnRegister, btnGoToLogin;
    private ImageIcon iconLogo;

    public RegisterPanel() {
        Color orangeColor = new Color(244, 143, 81);
        panelWest = new JPanel();

        iconLogo = new ImageIcon("images/access/display.png");
        lblImage = new JLabel();
        lblImage.setBackground(Color.WHITE);
        lblImage.setIcon(iconLogo);
        panelWest.setSize(300, 700);
        panelWest.setPreferredSize(new Dimension(200, 500));

        panelWest.add(lblImage);
        panelWest.setBackground(Color.WHITE);

        panelCenter = new JPanel(new GridLayout(13, 1));
        Border emptyBorder = BorderFactory.createEmptyBorder(50, 50, 50, 50);

        panelCenter.setBorder(emptyBorder);
        panelCenter.setBackground(Color.WHITE);
        panelCenter.setSize(500, 700);
        panelCenter.setPreferredSize(new Dimension(500, 500));

        lblLoginText = new JLabel("Register new account");
        lblLoginText.setHorizontalAlignment(JLabel.CENTER);
        lblLoginText.setFont(new Font("Arial", Font.BOLD, 16));
        lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 16));

        lblFirstName = new JLabel("First Name");
        lblFirstName.setFont(new Font("Arial", Font.PLAIN, 16));
        txtFirstName = new JTextField();
        txtFirstName.setFont(new Font("Arial", Font.PLAIN, 16));

        lblLastName = new JLabel("Last Name");
        lblLastName.setFont(new Font("Arial", Font.PLAIN, 16));
        txtLastName = new JTextField();
        txtLastName.setFont(new Font("Arial", Font.PLAIN, 16));


        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 16));
        txtPassword = new JTextField();
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 16));

        lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 16));
        txtConfirmPassword = new JTextField();
        txtConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 16));

        lblEmail = new JLabel("Email");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 16));
        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Arial", Font.PLAIN, 16));

        btnRegister = new JButton("REGISTER");
        btnRegister.setBorderPainted(false);
        btnRegister.setBackground(orangeColor);
        btnRegister.setForeground(Color.WHITE);

        btnGoToLogin = new JButton("Already have an account? Sign in.");
        btnGoToLogin.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        btnGoToLogin.setBorderPainted(false);
        btnGoToLogin.setContentAreaFilled(false);
        btnGoToLogin.setForeground(Color.BLUE);
        btnGoToLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccessPage.Login();
            }
        });

        panelCenter.add(new JLabel());
        panelCenter.add(lblLoginText);
        panelCenter.add(lblUsername);
        panelCenter.add(txtUsername);
        panelCenter.add(lblFirstName);
        panelCenter.add(txtFirstName);
        panelCenter.add(lblLastName);
        panelCenter.add(txtLastName);
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(lblConfirmPassword);
        panelCenter.add(txtConfirmPassword);
        panelCenter.add(lblEmail);
        panelCenter.add(txtEmail);
        panelCenter.add(new JLabel());
        panelCenter.add(btnRegister);
        panelCenter.add(new JLabel());
        panelCenter.add(btnGoToLogin);

        setSize(new Dimension(7000, 700));
        setPreferredSize(new Dimension(7000, 500));

        add(panelWest, BorderLayout.WEST);
        add(panelCenter, BorderLayout.CENTER);
    }
}
