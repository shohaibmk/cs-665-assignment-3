package edu.bu.met.cs665.example1;

public class VIPCustomer extends Customer {
    public VIPCustomer(String email) {
        super(email);
    }

    @Override
    public void update(String message) {
        // Customized logic for VIP customers
        receivedEmail = message;

        System.out.println("Sending email to VIP Customer " + email + ": " + message);
    }
}

