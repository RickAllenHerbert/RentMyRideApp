package za.ac.cput.view.general;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopNavigationBar extends JPanel implements ActionListener {
    private ImageIcon iconLogo;
    private JFrame jFrame;

    public TopNavigationBar(JFrame jFrame, int index) {
        this.setBackground(Color.BLACK);
        this.jFrame = jFrame;
        Color orangeColor = new Color(244, 143, 81);

        //Menu Bar
        JMenuBar mainMenu = new JMenuBar();
        mainMenu.setOpaque(true);
        mainMenu.setBackground(Color.BLACK);
        mainMenu.setPreferredSize(new Dimension(1100, 100));

        iconLogo = new ImageIcon("images/logo.png");
        JLabel lblTitle = new JLabel();
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setIcon(iconLogo);
        lblTitle.setSize(300, 60);

        mainMenu.add(lblTitle);
        mainMenu.add(Box.createHorizontalGlue());

        Border emptyBorder = BorderFactory.createEmptyBorder(5, 5, 5, 15);

        JButton btnHome = new JButton("HOME");
        btnHome.setForeground(Color.WHITE);
        btnHome.setBackground(Color.BLACK);
        btnHome.setFont(new Font("Arial", Font.PLAIN, 16));
        btnHome.setBorder(emptyBorder);
        if(index == 0) {
            btnHome.setForeground(orangeColor);
            btnHome.setBackground(Color.BLACK);
        }


        JButton btnAboutUs = new JButton("ABOUT US");
        btnAboutUs.setForeground(Color.WHITE);
        btnAboutUs.setBackground(Color.BLACK);
        if(index == 1) {
            btnAboutUs.setForeground(orangeColor);
            btnAboutUs.setBackground(Color.BLACK);
        }
        btnAboutUs.setFont(new Font("Arial", Font.PLAIN, 16));
        btnAboutUs.setBorder(emptyBorder);

        JButton btnReservations = new JButton("RESERVATIONS");
        btnReservations.setForeground(Color.WHITE);
        btnReservations.setBackground(Color.BLACK);
        if(index == 2) {
            btnReservations.setForeground(orangeColor);
            btnReservations.setBackground(Color.BLACK);
        }
        btnReservations.setFont(new Font("Arial", Font.PLAIN, 16));
        btnReservations.setBorder(emptyBorder);

        JButton btnLogout = new JButton("LOGOUT");

        btnLogout.setForeground(Color.WHITE);
        btnLogout.setBackground(orangeColor);
        btnLogout.setFont(new Font("Arial", Font.PLAIN, 16));

        mainMenu.add(btnHome);
        mainMenu.add(btnAboutUs);
        mainMenu.add(btnReservations);
        mainMenu.add(btnLogout);


        add(mainMenu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

