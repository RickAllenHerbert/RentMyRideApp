package za.ac.cput.view;

import za.ac.cput.view.usersetup.LoginPanel;
import za.ac.cput.view.usersetup.RegisterPanel;

import javax.swing.*;
import java.awt.*;

public class AccessPage extends JFrame {
    private static CardLayout cL;
    private static Container contPanel;
    private JPanel loginPanel, registerPanel;

    public AccessPage() {
        super("Welcome to Rent My Ride");
        contPanel = new JPanel();
        loginPanel = new LoginPanel();
        registerPanel = new RegisterPanel();
        cL = new CardLayout();

        contPanel.setLayout(cL);

        loginPanel.setBackground(Color.WHITE);
        registerPanel.setBackground(Color.WHITE);

        contPanel.add(loginPanel, "1");
        contPanel.add(registerPanel, "2");
        cL.show(contPanel, "1");

        getContentPane().add(contPanel, BorderLayout.CENTER);

        setSize(new Dimension(1000, 500));
        setPreferredSize(new Dimension(740, 550));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    public static void Register() {
        cL.show(contPanel, "2");
    }

    public static void Login() {
        cL.show(contPanel, "1");
    }


}
