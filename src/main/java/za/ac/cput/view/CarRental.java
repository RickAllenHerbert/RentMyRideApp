package za.ac.cput.view;


import za.ac.cput.view.general.TopNavigationBar;

import javax.swing.*;
import java.awt.*;

public class CarRental extends JFrame {

    public CarRental() {
        super("Rent My Ride");

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.BLACK);
        TopNavigationBar navBar = new TopNavigationBar(this, 0);

        ImageIcon imageIcon = new ImageIcon("images/cars/Cars.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(300, 100,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        JLabel imageHolderLogos = new JLabel();
        imageHolderLogos.setIcon(imageIcon);
        northPanel.add(navBar);
        northPanel.add(imageHolderLogos);


        JPanel centerSouthPanel = new JPanel();
        centerSouthPanel.setBackground(Color.WHITE);
        GridLayout layout = new GridLayout(2,5);
        layout.setHgap(5);
        JPanel centerPanel = new JPanel(layout);
        centerPanel.setBackground(Color.WHITE);

        ImageIcon car1 = new ImageIcon("images/cars/1.png");
        JLabel imageHolderCar1 = new JLabel();
        imageHolderCar1.setIcon(car1);

        ImageIcon car2 = new ImageIcon("images/cars/2.png");
        JLabel imageHolderCar2 = new JLabel();
        imageHolderCar2.setIcon(car2);

        ImageIcon car3 = new ImageIcon("images/cars/3.png");
        JLabel imageHolderCar3 = new JLabel();
        imageHolderCar3.setIcon(car3);

        ImageIcon car4 = new ImageIcon("images/cars/4.jpg");
        JLabel imageHolderCar4 = new JLabel();
        imageHolderCar4.setIcon(car4);

        ImageIcon car5 = new ImageIcon("images/cars/5.png");
        JLabel imageHolderCar5 = new JLabel();
        imageHolderCar5.setIcon(car5);

        ImageIcon car6 = new ImageIcon("images/cars/6.png");
        JLabel imageHolderCar6 = new JLabel();
        imageHolderCar6.setIcon(car6);

        ImageIcon car7 = new ImageIcon("images/cars/7.png");
        JLabel imageHolderCar7 = new JLabel();
        imageHolderCar7.setIcon(car7);

        ImageIcon bakkie1 = new ImageIcon("images/cars/bakkie.png");
        JLabel imageHolderbakkie1 = new JLabel();
        imageHolderbakkie1.setIcon(bakkie1);

        ImageIcon bakkie2 = new ImageIcon("images/cars/izuzu bakkie.png");
        JLabel imageHolderbakkie2 = new JLabel();
        imageHolderbakkie2.setIcon(bakkie2);

        ImageIcon bakkie3 = new ImageIcon("images/cars/Hyundai bakkie.png");
        JLabel imageHolderbakkie3 = new JLabel();
        imageHolderbakkie3.setIcon(bakkie3);

        centerPanel.add(imageHolderCar1);
        centerPanel.add(imageHolderCar2);
        centerPanel.add(imageHolderCar3);
        centerPanel.add(imageHolderCar4);
        centerPanel.add(imageHolderCar5);
        centerPanel.add(imageHolderCar6);
        centerPanel.add(imageHolderCar7);
        centerPanel.add(imageHolderbakkie1);
        centerPanel.add(imageHolderbakkie2);
        centerPanel.add(imageHolderbakkie3);


        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.WHITE);
        ImageIcon iconFooter = new ImageIcon("images/home/footer.png");
        JLabel imageFooterHolder = new JLabel();
        imageFooterHolder.setIcon(iconFooter);

        southPanel.add(imageFooterHolder);

        JPanel centerCenterPanel = new JPanel();
        centerCenterPanel.setBackground(Color.WHITE);
        centerCenterPanel.add(centerSouthPanel);
        centerCenterPanel.add(centerPanel);
        centerCenterPanel.add(northPanel);

        getContentPane().add(northPanel, BorderLayout.NORTH);
        getContentPane().add(centerCenterPanel, BorderLayout.CENTER);
        getContentPane().add(southPanel, BorderLayout.SOUTH);



//        centerPanel.pack();
//        centerPanel.setVisible(true);

        setSize(1200, 760);
        pack();
        setVisible(true);

//        setSize(1200, 1000);
//        setPreferredSize(new Dimension());
//        setResizable(false);
//        pack();
//        setVisible(true);
    }
}
