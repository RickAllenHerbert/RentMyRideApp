package za.ac.cput.service;

import com.google.gson.Gson;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import okhttp3.*;
import za.ac.cput.entity.Car;
import za.ac.cput.entity.MultiPurposeUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CarDAO {
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

    public static ArrayList<Car> getAllCars() {
        try {
            ArrayList<Car> equipmentRentalsList = new ArrayList<>();
            final String URL = "http://localhost:8080/car/getall";
            String responseBody = run(URL);
            JSONArray cars = new JSONArray(responseBody);

            for (int i = 0; i < cars.length(); i++) {
                JSONObject car = cars.getJSONObject(i);

                Gson g = new Gson();
                Car c = g.fromJson(car.toString(), Car.class);
                equipmentRentalsList.add(c);
            }
            return equipmentRentalsList;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
