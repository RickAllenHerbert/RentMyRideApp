package za.ac.cput.view;

import za.ac.cput.view.general.TopNavigationBar;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationPage extends JFrame {
    private JTextField pickupLocation;
    private JLabel lblText, lblDateStart, lblDateEnd;
    private JComboBox cbPickupTime, cbDropOffTime;
    private JButton btnSearch;

    public ReservationPage() {
        super("Reservations");
        Color orangeColor = new Color(244, 143, 81);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.BLACK);
        TopNavigationBar navBar = new TopNavigationBar(this, 2);
        northPanel.add(navBar);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.WHITE);

        JPanel centerTopPanel = new JPanel();
        JPanel centerTopPanelDataHolder = new JPanel(new GridLayout(5, 9));
        centerTopPanelDataHolder.setPreferredSize(new Dimension(1150, 200));
        centerTopPanelDataHolder.setBorder(new EmptyBorder(10, 20,20,10));
        centerTopPanelDataHolder.setBackground(orangeColor);

        lblText = new JLabel("Let's find your ideal car");
        lblText.setFont(new Font("Arial", Font.BOLD, 16));
        pickupLocation = new JTextField();
        pickupLocation.setText("Enter pickup location");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String Date = LocalDate.now().format(formatter);
        lblDateStart = new JLabel(Date);
        lblDateStart.setFont(new Font("Arial", Font.BOLD, 16));
        lblDateEnd = new JLabel(Date);
        lblDateEnd.setFont(new Font("Arial", Font.BOLD, 16));
        cbPickupTime = new JComboBox();
        cbDropOffTime = new JComboBox();

        for(int x = 8; x <= 22; x++) {
            String value;
            if(x < 10) {
                value = "0" + x + ":00";
            } else {
                value = x + ":00";
            }
            cbPickupTime.addItem(value);
            cbDropOffTime.addItem(value);
        }

        btnSearch = new JButton("SEARCH");
        btnSearch.setBorderPainted(false);
        btnSearch.setBackground(new Color(102,205,0));
        btnSearch.setForeground(Color.WHITE);

        centerTopPanelDataHolder.add(lblText);
        centerTopPanelDataHolder.add(new JLabel());
        centerTopPanelDataHolder.add(pickupLocation);
        centerTopPanelDataHolder.add(new JLabel());
        centerTopPanelDataHolder.add(lblDateStart);
        centerTopPanelDataHolder.add(lblDateEnd);
        centerTopPanelDataHolder.add(cbPickupTime);
        centerTopPanelDataHolder.add(cbDropOffTime);
        centerTopPanelDataHolder.add(new JLabel());
        centerTopPanelDataHolder.add(btnSearch);

        centerTopPanel.setBackground(Color.WHITE);

        centerTopPanel.add(centerTopPanelDataHolder);

        centerPanel.add(centerTopPanel, BorderLayout.NORTH);

        JPanel centerMiddlePanel = new JPanel();
        centerMiddlePanel.setBackground(Color.PINK);
        centerPanel.add(centerMiddlePanel ,BorderLayout.CENTER);


        getContentPane().add(northPanel, BorderLayout.NORTH);
        getContentPane().add(centerPanel, BorderLayout.CENTER);

        setSize(1200, 1000);
        setPreferredSize(new Dimension(1200, 760));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }
}
