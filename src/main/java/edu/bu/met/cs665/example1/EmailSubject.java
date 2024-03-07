package edu.bu.met.cs665.example1;

// Subject Interface
interface EmailSubject {
    void attach(EmailObserver observer);
    void detach(EmailObserver observer);
    void notifyObservers();
}
