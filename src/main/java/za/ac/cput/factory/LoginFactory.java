package za.ac.cput.factory;
/*
    @Description: Login Factory ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import za.ac.cput.entity.Login;

public class LoginFactory {
    public static Login createLogin(String userType,String password, String username)
    {

        Login login = new Login.Builder()
                .setUserType(userType)
                .setUsername(username)
                .setPassword(password)
                .build();
        return login;
    }

    public static Login createLogin(String username)
    {
       return null;
    }
}