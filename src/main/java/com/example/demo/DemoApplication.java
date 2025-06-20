package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Base64;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        // --- BAD CODE STARTS HERE ---

        // Hardcoded password (Security Hotspot)
        String password = "admin123";

        // Useless assignment (Code Smell)
        String unusedVar = "This will not be used";

        // Base64 used for passwords (Security Hotspot)
        String encoded = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println("Encoded password: " + encoded);

        // Empty catch block (Code Smell)
        try {
            int x = 1 / 0;
        } catch (Exception e) {
            // ignored
        }

        // System.out.println in prod code (Code Smell)
        System.out.println("App started!");
    }
}