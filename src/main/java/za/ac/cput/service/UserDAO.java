package za.ac.cput.service;

import com.google.gson.Gson;
import kong.unirest.json.JSONObject;
import okhttp3.*;
import za.ac.cput.entity.MultiPurposeUser;

import java.io.IOException;

public class UserDAO {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpClient client = new OkHttpClient();

    private static String run(String URL) throws IOException {
        String credential = Credentials.basic("admin1", "admin1234");
        Request request = new Request.Builder()
                .url(URL)
                .addHeader("Authorization", credential)
                .header("Authorization", credential)
                .build();
        try(Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static MultiPurposeUser login(String username, String password) {
        try {

            final String URL = "http://localhost:8080/multilogin/login/" + username + "/" + password;
            String responseBody = run(URL);
            System.out.println(responseBody);
            JSONObject userInfo = new JSONObject(responseBody);
            Gson g = new Gson();
            MultiPurposeUser user = g.fromJson(userInfo.toString(), MultiPurposeUser.class);


            return user;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
