package edu.bu.met.cs665.example1;

public class BusinessCustomer extends Customer {
    public BusinessCustomer(String email) {
        super(email);
    }

    @Override
    public void update(String message) {
        receivedEmail = message;

        System.out.println("Sending email to Business Customer " + email + ": " + message);
    }
}
