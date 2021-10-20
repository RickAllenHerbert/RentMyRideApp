package za.ac.cput.view.general;

import za.ac.cput.view.AccessPage;
import za.ac.cput.view.HomePage;
import za.ac.cput.view.ReservationPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopNavigationBar extends JPanel implements ActionListener {
    private ImageIcon iconLogo;
    private JFrame jFrame;
    private int currentIndex;

    public TopNavigationBar(JFrame jFrame, int index) {
        this.currentIndex = index;
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
        btnHome.addActionListener(this);
        btnHome.setForeground(Color.WHITE);
        btnHome.setBackground(Color.BLACK);
        btnHome.setFont(new Font("Arial", Font.PLAIN, 16));
        btnHome.setBorder(emptyBorder);
        if(index == 0) {
            btnHome.setForeground(orangeColor);
            btnHome.setBackground(Color.BLACK);
        }


        JButton btnAboutUs = new JButton("ABOUT US");
        btnAboutUs.addActionListener(this);
        btnAboutUs.setForeground(Color.WHITE);
        btnAboutUs.setBackground(Color.BLACK);
        if(index == 1) {
            btnAboutUs.setForeground(orangeColor);
            btnAboutUs.setBackground(Color.BLACK);
        }
        btnAboutUs.setFont(new Font("Arial", Font.PLAIN, 16));
        btnAboutUs.setBorder(emptyBorder);

        JButton btnReservations = new JButton("RESERVATIONS");
        btnReservations.addActionListener(this);
        btnReservations.setForeground(Color.WHITE);
        btnReservations.setBackground(Color.BLACK);
        if(index == 2) {
            btnReservations.setForeground(orangeColor);
            btnReservations.setBackground(Color.BLACK);
        }
        btnReservations.setFont(new Font("Arial", Font.PLAIN, 16));
        btnReservations.setBorder(emptyBorder);


        JButton btnLogout = new JButton("LOGOUT");
        btnLogout.addActionListener(this);

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
        if(e.getActionCommand().equals("HOME")){
            if(currentIndex == 0) {
                System.out.println("Current in home");
            }
            else {
                HomePage homePage = new HomePage();
                this.jFrame.dispose();
            }
        }
        else if(e.getActionCommand().equals("ABOUT US")) {
            if(currentIndex == 1) {
                System.out.println("Current in the about us");
            }
            else {
                JOptionPane.showMessageDialog(null,"ABOUT US");
            }
        }
        else if(e.getActionCommand().equals("RESERVATIONS")) {
            if(currentIndex == 2) {
                System.out.println("Current in reservations");
            }
            else {
                ReservationPage reservationPage = new ReservationPage();
                this.jFrame.dispose();
            }
        }
        else if(e.getActionCommand().equals("LOGOUT")) {
            AccessPage accessPage = new AccessPage();
            this.jFrame.dispose();
        }
    }
}

