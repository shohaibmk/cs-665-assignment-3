package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

// Email Subject implementation
public class EmailGenerator implements EmailSubject {
    private List<EmailObserver> observers = new ArrayList<>();

    @Override
    public void attach(EmailObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(EmailObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (EmailObserver observer : observers) {
            observer.update(generateEmailContent());
        }
    }

    private String generateEmailContent() {
        // Generate email content here based on customer type
        return "Generated email content";
    }

    public void generateEmails() {
        // Simulate email generation
        notifyObservers();
    }
}
