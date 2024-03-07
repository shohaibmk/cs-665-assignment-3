package edu.bu.met.cs665.example1;

// Concrete Customer classes
public class FrequentCustomer extends Customer {
    public FrequentCustomer(String email) {
        super(email);
    }

    @Override
    public void update(String message) {
        // Customized logic for Frequent customers
        receivedEmail = message;

        System.out.println("Sending email to Frequent Customer " + email + ": " + message);
    }
}
