package za.ac.cput.view.usersetup;

import za.ac.cput.view.AccessPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {
    private JPanel panelWest, panelCenter;
    private JLabel lblImage, lblDescription, lblLoginText, lblUsername, lblPassword;
    private JTextField txtUsername, txtPassword;
    private JButton btnLogin, btnGoToRegister;
    private ImageIcon iconLogo;

    public LoginPanel() {
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

        lblDescription = new JLabel("Hello ! Welcome back.");
        lblDescription.setFont(new Font("Helvetica", Font.BOLD, 20));
        lblLoginText = new JLabel("Log in");
        lblLoginText.setHorizontalAlignment(JLabel.CENTER);
        lblLoginText.setFont(new Font("Arial", Font.PLAIN, 16));
        lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 16));

        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 16));
        txtPassword = new JTextField();
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 16));

        btnLogin = new JButton("LOGIN");
        btnLogin.setBorderPainted(false);
        btnLogin.setBackground(orangeColor);
        btnLogin.setForeground(Color.WHITE);

        btnGoToRegister = new JButton("Not registered? Register now!");
        btnGoToRegister.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        btnGoToRegister.setBorderPainted(false);
        btnGoToRegister.setContentAreaFilled(false);
        btnGoToRegister.setForeground(Color.BLUE);
        btnGoToRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccessPage.Register();
            }
        });

        panelCenter.add(lblDescription);
        panelCenter.add(new JLabel());
        panelCenter.add(lblLoginText);
        panelCenter.add(lblUsername);
        panelCenter.add(txtUsername);
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(new JLabel());
        panelCenter.add(btnLogin);
        panelCenter.add(btnGoToRegister);

        setSize(new Dimension(7000, 700));
        setPreferredSize(new Dimension(7000, 500));

        add(panelWest, BorderLayout.WEST);
        add(panelCenter, BorderLayout.CENTER);
    }
}
