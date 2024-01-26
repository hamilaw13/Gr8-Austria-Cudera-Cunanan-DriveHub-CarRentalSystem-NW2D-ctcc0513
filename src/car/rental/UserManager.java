package car.rental;

import java.util.HashMap;
import java.util.Map;

public class UserManager {

    private static final Map<String, String> userDatabase = new HashMap<>();

    // Method to register a new user
    public static boolean registerUser(String username, String password) {
        if (!userDatabase.containsKey(username)) {
            userDatabase.put(username, password);
            return true;
        }
        return false;
    }

    // Method to authenticate a user during login
    public static boolean authenticateUser(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
