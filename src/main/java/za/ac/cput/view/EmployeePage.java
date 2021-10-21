package za.ac.cput.view;

import za.ac.cput.entity.Employee;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.service.EmployeeDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeePage extends JFrame {
    private JPanel panelCenter;
    private JLabel lblName, lblSurname, lblPassword, lblUsername, lblUserType;
    private JTextField txtName, txtSurname, txtPassword, txtUsername;
    private JComboBox cbUserType;
    private JButton btnAddEmployee;

    public EmployeePage() {
        Color orangeColor = new Color(244, 143, 81);
        lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Arial", Font.PLAIN, 16));
        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Arial", Font.PLAIN, 16));

        lblName = new JLabel("First Name");
        lblName.setFont(new Font("Arial", Font.PLAIN, 16));
        txtName = new JTextField();
        txtName.setFont(new Font("Arial", Font.PLAIN, 16));

        lblSurname = new JLabel("Last Name");
        lblSurname.setFont(new Font("Arial", Font.PLAIN, 16));
        txtSurname = new JTextField();
        txtSurname.setFont(new Font("Arial", Font.PLAIN, 16));


        lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Arial", Font.PLAIN, 16));
        txtPassword = new JTextField();
        txtPassword.setFont(new Font("Arial", Font.PLAIN, 16));

        lblUserType = new JLabel("Confirm Password");
        lblUserType.setFont(new Font("Arial", Font.PLAIN, 16));
        cbUserType = new JComboBox();
        cbUserType.addItem("Admin");
        cbUserType.addItem("Employee");
        cbUserType.setFont(new Font("Arial", Font.PLAIN, 16));


        btnAddEmployee = new JButton("ADD EMPLOYEE");
        btnAddEmployee.setBorderPainted(false);
        btnAddEmployee.setBackground(orangeColor);
        btnAddEmployee.setForeground(Color.WHITE);
        btnAddEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String lastName = txtPassword.getText();
                String username = txtUsername.getText();
                String password = txtPassword.getText();
                String userType = cbUserType.getSelectedItem().toString();

                Employee employee = EmployeeFactory.createEmployee(name, lastName, userType, username, password);
                EmployeeDAO.saveEmployee(employee);

            }
        });
        panelCenter = new JPanel(new GridLayout(13, 1));
        panelCenter.add(new JLabel());
        panelCenter.add(lblName);
        panelCenter.add(txtName);
        panelCenter.add(lblSurname);
        panelCenter.add(txtSurname);
        panelCenter.add(txtUsername);
        panelCenter.add(lblUsername);
        panelCenter.add(txtUsername);
        panelCenter.add(lblPassword);
        panelCenter.add(txtPassword);
        panelCenter.add(lblUserType);
        panelCenter.add(cbUserType);
        panelCenter.add(new JLabel());
        panelCenter.add(btnAddEmployee);

        setSize(new Dimension(700, 700));
        setPreferredSize(new Dimension(700, 500));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        add(panelCenter, BorderLayout.CENTER);
    }
}
