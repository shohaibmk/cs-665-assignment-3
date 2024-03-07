package edu.bu.met.cs665.example1;

// Base class for Customer
abstract class Customer implements EmailObserver {
    protected String email;
    protected String receivedEmail;


    public Customer(String email) {
        this.email = email;
    }

    public abstract void update(String message);

    public String getReceivedEmail() {
        return receivedEmail;
    }
}
