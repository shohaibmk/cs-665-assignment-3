package edu.bu.met.cs665.example1;

public class ReturningCustomer extends Customer {
    public ReturningCustomer(String email) {
        super(email);
    }

    @Override
    public void update(String message) {
        // Customized logic for Returning customers
        receivedEmail = message;

        System.out.println("Sending email to Returning Customer " + email + ": " + message);
    }
}
