package za.ac.cput.view;


import za.ac.cput.view.general.TopNavigationBar;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {

    public HomePage() {
        super("Rent My Ride Home");

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.BLACK);
        TopNavigationBar navBar = new TopNavigationBar(this, 0);
        northPanel.add(navBar);


        JPanel centerSouthPanel = new JPanel();
        centerSouthPanel.setBackground(Color.WHITE);
        ImageIcon iconLogos = new ImageIcon("images/home/advert.png");
        JLabel imageHolderLogos = new JLabel();
        imageHolderLogos.setIcon(iconLogos);

        centerSouthPanel.add(imageHolderLogos);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.add(centerSouthPanel);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.WHITE);
        ImageIcon iconFooter = new ImageIcon("images/home/footer.png");
        JLabel imageFooterHolder = new JLabel();
        imageFooterHolder.setIcon(iconFooter);

        southPanel.add(imageFooterHolder);

        getContentPane().add(northPanel, BorderLayout.NORTH);
        getContentPane().add(centerPanel, BorderLayout.CENTER);
        getContentPane().add(southPanel, BorderLayout.SOUTH);

        setSize(1200, 1000);
        setPreferredSize(new Dimension(1200, 760));
        setResizable(false);
        pack();
        setVisible(true);
    }
}
