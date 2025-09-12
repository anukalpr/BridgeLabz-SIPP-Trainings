package UserValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class User {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String name = null, phone = null;
        int age = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Name:")) {
                    name = line.substring(5).trim();
                } else if (line.startsWith("Age:")) {
                    age = Integer.parseInt(line.substring(4).trim());
                } else if (line.startsWith("Phone:")) {
                    phone = line.substring(6).trim();
                }
            }

            System.out.println("=== User Validation ===");
            System.out.println("User Name: " + name);
            System.out.println("User Age: " + age);

            if (age < 18) {
                throw new UnderAgeException("Name: " + name + ", Age: " + age + " - Age must be 18 or above.");
            }

            if (phone == null || phone.isEmpty()) {
                System.out.println("Phone number is invalid. Cannot be null or empty.");
            } else if (phone.length() != 13) {
                System.out.println("Phone number is invalid. Must be 13 characters long.");
            } else if (!phone.startsWith("+91")) {
                System.out.println("Invalid phone number. Must start with +91.");
            } else {
                System.out.println("Phone number is valid: " + phone);
            }

            if (age >= 18) {
                System.out.println("Processing user: " + name);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
