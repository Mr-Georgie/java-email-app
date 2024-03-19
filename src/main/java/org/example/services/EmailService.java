package org.example.services;

import org.example.model.Email;

import java.util.Scanner;

public class EmailService {

    public Email createEmailAccount(String firstName, String lastName) {
        int defaultPasswordLength = 10;

        Email newEmail = new Email(firstName, lastName);
        newEmail.setDepartment(selectDepartment(newEmail.getFirstName()));
        newEmail.setPassword(randomPassword(defaultPasswordLength));

        generateEmail(newEmail);

        return newEmail;
    }

    private String selectDepartment(String firstName) {
        System.out.print("New employee "+ firstName +". Select department code\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none\n Enter department code here = ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1) return "sales";
        else if (departmentChoice == 2) return "dev";
        else if (departmentChoice == 3) return "acct";
        else return "";
    }

    private void generateEmail(Email emailAccount){
        String companySuffix = "company.com";

        String newEmail =
                emailAccount.getFirstName().toLowerCase() + "." + emailAccount.getLastName().toLowerCase() + "@" + emailAccount.getDepartment().toLowerCase() + "." + companySuffix;

        emailAccount.setEmail(newEmail);
    }

    // Generate random password
    private String randomPassword(int length) {
        // Define the characters to be used in the password
        String allowableCharacters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:',.<>?";

        char[] password = new char[length];

        for (int i = 0; i<length; i++) {
            int randomIndex = (int) (Math.random() * allowableCharacters.length());
            password[i] = allowableCharacters.charAt(randomIndex);
        }

        return new String(password);
    }
}
