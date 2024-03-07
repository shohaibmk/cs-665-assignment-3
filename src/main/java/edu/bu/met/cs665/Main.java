/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.example1.*;

/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {
    EmailGenerator emailGenerator = new EmailGenerator();

    BusinessCustomer businessCustomer = new BusinessCustomer("business@example.com");
    ReturningCustomer returningCustomer = new ReturningCustomer("returning@example.com");
    returningCustomer.update("Happy to see you back !!!");
    FrequentCustomer frequentCustomer = new FrequentCustomer("frequent@example.com");
    frequentCustomer.update("Here are your daily deals");
    NewCustomer newCustomer = new NewCustomer("new@example.com");
    newCustomer.update("Welcome to the world of computing");
    VIPCustomer vipCustomer = new VIPCustomer("vip@example.com");
    vipCustomer.update("Here are you perks for being a VIP customer");

    emailGenerator.attach(businessCustomer);
    emailGenerator.attach(returningCustomer);
    emailGenerator.attach(frequentCustomer);
    emailGenerator.attach(newCustomer);
    emailGenerator.attach(vipCustomer);

    emailGenerator.generateEmails();
  }
}

