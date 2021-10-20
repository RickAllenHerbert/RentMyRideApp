package za.ac.cput;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import za.ac.cput.entity.Login;


import java.io.IOException;


public class App 
{
    private static OkHttpClient client = new OkHttpClient();
    private static String run(String URL) throws IOException
    {
Request request = new Request.Builder().url(URL).build();
try (Response response = client.newCall(request).execute())
{
return response.body().string();
}
    }
public static void getAll()
{
    try{
        final String URL = "http://localhost:8080/db_example";
        String responseBody = run(URL);
        JSONArray logins = new JSONArray(responseBody);

        for (int i=0;i<logins.length();i++)
        {
JSONObject login = logins.getJSONObject(i);
Gson g = new Gson();
Login log = g.fromJson(logins.toString(), Login.class);
            System.out.println(log.toString());

        }
    }
   catch (Exception e)
    {
        System.out.println(e.getMessage());
    }
}


    public static void main( String[] args )
    {
        getAll();

    }

}
