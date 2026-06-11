package com.example.pii;

public class UserProfile {

    // Personally Identifiable Information (PII)
    private String fullName = "John Doe";
    private String email = "john.doe@example.com";
    private String phoneNumber = "+1-202-555-0147";
    private String dateOfBirth = "1990-05-15";
    private String address = "1234 Elm Street, Springfield, IL, 62704, USA";

    // Sensitive Identifiers
    private String ssn = "123-45-6789";              // Social Security Number (US)
    private String passportNumber = "X1234567";
    private String driverLicense = "D1234567890";

    // Financial Information
    private String creditCardNumber = "4111 1111 1111 1111";
    private String bankAccountNumber = "9876543210";
    private String ifscCode = "HDFC0001234";

    // Authentication-related data (should never be stored in plain text)
    private String username = "johndoe90";
    private String password = "P@ssw0rd123"; // insecure practice (for demo only)

    public void printUserDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Address: " + address);

        System.out.println("SSN: " + ssn);
        System.out.println("Passport: " + passportNumber);
        System.out.println("Driver License: " + driverLicense);

        System.out.println("Credit Card: " + creditCardNumber);
        System.out.println("Bank Account: " + bankAccountNumber);
        System.out.println("IFSC Code: " + ifscCode);

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        UserProfile user = new UserProfile();
        user.printUserDetails();
    }
}
