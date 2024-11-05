/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turismogt_rental_login;

/**
 *
 * @author syafi
 */
public class TurismoGTWebsite {
    private AuthenticationSystem authSystem;

    public TurismoGTWebsite() {
        this.authSystem = new AuthenticationSystem();
    }

    public boolean login(String identifier, String password) {
        System.out.println("Validating credentials...");
        boolean isValid = authSystem.validateCredentials(identifier, password);

        if (isValid) {
            System.out.println("Access granted.");
            return true;
        } else {
            System.out.println("Access denied. Invalid credentials.");
            return false;
        }
    }
}
