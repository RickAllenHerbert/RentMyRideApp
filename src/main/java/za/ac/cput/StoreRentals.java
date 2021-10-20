package za.ac.cput;

import com.google.gson.Gson;
//import jdk.nashorn.internal.scripts.JO;
import okhttp3.*;
import za.ac.cput.entity.Login;
import za.ac.cput.factory.LoginFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StoreRentals extends JFrame implements ActionListener {
    public static final MediaType JSON = MediaType.get("application/json;charset-utf-8");

    private static OkHttpClient client = new OkHttpClient();
    private JLabel lblUserType;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JTextField txtUserType;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JButton btnSave;
    private JButton btnCancel;

    public StoreRentals() {
        super("Create new Login");
        lblUserType = new JLabel("User Type:");
        txtUserType = new JTextField(30);
        lblUsername = new JLabel("Username:");
        txtUsername = new JTextField("Auto-generated-");
        txtUsername.setEnabled(false);
        lblPassword = new JLabel("Password:");
        txtPassword = new JTextField(30);
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");

    }

    public void setGUI() {
        this.setLayout(new GridLayout(6, 2));
        this.add(lblUserType);
        this.add(txtUserType);
        this.add(lblUsername);
        this.add(txtUsername);
        this.add(lblPassword);
        this.add(txtPassword);
        this.add(btnSave);
        this.add(btnCancel);

        btnSave.addActionListener(this);
        btnCancel.addActionListener(this);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            store(txtUsername.getText());
        } else if (e.getSource() == btnCancel) {
            System.exit(0);
        }
    }

    public void store(String username) {
        try {
            final String URL = "http//localhost:8080/client/create";
            Login login = LoginFactory.createLogin(username);
            Gson g = new Gson();
            String jsonString = g.toJson(login);
            String logi = post(URL, jsonString);
            if (logi != null)
                JOptionPane.showMessageDialog(null, "Saved successfully");
            else
                JOptionPane.showMessageDialog(null, "Not saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String post(final String url, String json) throws IOException
    {
      RequestBody body = RequestBody.create(JSON,json);
      Request request = new Request.Builder()
              .url(url)
              .post(body)
              .build();

      try(Response response = client.newCall(request).execute())
      {
return response.body().string();
      }
    }

    public static void main(String[] args) {
        new StoreRentals().setGUI();
    }
}