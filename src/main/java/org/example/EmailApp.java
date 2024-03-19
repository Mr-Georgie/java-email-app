package org.example;

import org.example.model.Email;
import org.example.services.EmailService;

import java.util.Scanner;

public class EmailApp {

    static EmailService emailService = new EmailService();

    public static void main(String[] args) {
        System.out.print("Enter first name = ");
        Scanner in = new Scanner(System.in);
        String firstName = in.next();

        System.out.print("Enter last name = ");
        String lastName = in.next();

        Email newEmail = emailService.createEmailAccount(firstName, lastName);
        newEmail.setMailboxCapacity(100);

        System.out.println(newEmail.showPersonnelInfo());
    }
}