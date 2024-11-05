/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turismogt_rental_login;

/**
 *
 * @author syafi
 */
import java.util.HashMap;
import java.util.Map;
public class AuthenticationSystem {
    private Map<String, String> credentialsDatabase;

    public AuthenticationSystem() {
        credentialsDatabase = new HashMap<>();
        // Adding some sample credentials (for demonstration purposes)
        credentialsDatabase.put("user@example.com", "password123");
        credentialsDatabase.put("555-1234", "securePass");
    }

    public boolean validateCredentials(String identifier, String password) {
        String storedPassword = credentialsDatabase.get(identifier);
        return storedPassword != null && storedPassword.equals(password);
    }
}
