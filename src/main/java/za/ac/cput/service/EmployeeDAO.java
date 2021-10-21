package za.ac.cput.service;

import com.google.gson.Gson;
import okhttp3.*;
import za.ac.cput.entity.Employee;

import javax.swing.*;
import java.io.IOException;

public class EmployeeDAO {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpClient client = new OkHttpClient();

    public static String post(final String url, String json) throws IOException {
        String credential = Credentials.basic("admin1", "admin1234");
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("Authorization", credential)
                .header("Authorization", credential)
                .build();
        try(Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    public static void saveEmployee(Employee employee) {
        try {
            final String URL = "http://localhost:8080/employee/create";
            Gson g = new Gson();
            String jsonString = g.toJson(employee);
            String r = post(URL, jsonString);
            if(r != null) {
                JOptionPane.showMessageDialog(null, "Record has been saved.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Record was not stored.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
