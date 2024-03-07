package edu.bu.met.cs665.example1;

public class NewCustomer extends Customer {
    public NewCustomer(String email) {
        super(email);
    }

    @Override
    public void update(String message) {
        // Customized logic for New customers
        receivedEmail = message;

        System.out.println("Sending email to New Customer " + email + ": " + message);
    }
}
