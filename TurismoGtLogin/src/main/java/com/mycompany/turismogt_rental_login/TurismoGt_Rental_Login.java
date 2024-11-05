/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.turismogt_rental_login;

/**
 *
 * @author syafi
 */
import java.util.Scanner;
public class TurismoGt_Rental_Login {
    public static void main(String[] args) {
        TurismoGTWebsite website = new TurismoGTWebsite();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TurismoGT!");
        System.out.println("Please select a login option:");
        System.out.println("1. Email");
        System.out.println("2. Phone");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String loginMethod = (choice == 1) ? "email" : "phone";
        System.out.println("Enter your " + loginMethod + ":");
        String identifier = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        boolean isLoggedIn = website.login(identifier, password);

        if (isLoggedIn) {
            System.out.println("Login successful! Redirecting to the reservation page...");
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        scanner.close();
    }
    
}
