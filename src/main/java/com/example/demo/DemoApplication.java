package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class DemoApplication {

    // 🔐 Hardcoded credentials (security vulnerability)
    private static final String DB_USERNAME = "admin";
    private static final String DB_PASSWORD = "password123";

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        // 💥 Code smell: unused variable
        String unusedToken = "token_xyz";

        // 💀 Duplicate code and insecure logging
        System.out.println("Connecting to DB with user: " + DB_USERNAME);
        System.out.println("Connecting to DB with user: " + DB_USERNAME);

        // 🤫 Swallowed exception (bad practice)
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            // nothing done here — bad practice
        }

        // 😵 Base64-encoded password output (poor practice)
        String encoded = Base64.getEncoder().encodeToString(DB_PASSWORD.getBytes());
        System.out.println("Encoded password: " + encoded);
    }
}
