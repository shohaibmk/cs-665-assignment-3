package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailGenerationTest {
    @Test
    void testBusinessCustomer() {
        EmailGenerator emailGenerator = new EmailGenerator();
        BusinessCustomer businessCustomer = new BusinessCustomer("business@example.com");
        emailGenerator.attach(businessCustomer);
        emailGenerator.generateEmails();
        assertEquals("Generated email content", businessCustomer.getReceivedEmail());
    }

    @Test
    void testReturningCustomer() {
        EmailGenerator emailGenerator = new EmailGenerator();
        ReturningCustomer returningCustomer = new ReturningCustomer("returning@example.com");
        emailGenerator.attach(returningCustomer);
        emailGenerator.generateEmails();
        assertEquals("Generated email content", returningCustomer.getReceivedEmail());
    }

    @Test
    void testFrequentCustomer() {
        EmailGenerator emailGenerator = new EmailGenerator();
        FrequentCustomer frequentCustomer = new FrequentCustomer("frequent@example.com");
        emailGenerator.attach(frequentCustomer);
        emailGenerator.generateEmails();
        assertEquals("Generated email content", frequentCustomer.getReceivedEmail());
    }

    @Test
    void testNewCustomer() {
        EmailGenerator emailGenerator = new EmailGenerator();
        NewCustomer newCustomer = new NewCustomer("new@example.com");
        emailGenerator.attach(newCustomer);
        emailGenerator.generateEmails();
        assertEquals("Generated email content", newCustomer.getReceivedEmail());
    }

    @Test
    void testVIPCustomer() {
        EmailGenerator emailGenerator = new EmailGenerator();
        VIPCustomer vipCustomer = new VIPCustomer("vip@example.com");
        emailGenerator.attach(vipCustomer);
        emailGenerator.generateEmails();
        assertEquals("Generated email content", vipCustomer.getReceivedEmail());
    }
}

