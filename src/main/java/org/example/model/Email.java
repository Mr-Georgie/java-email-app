package org.example.model;

/**
 * Represents an Email account.
 */
public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity;

    // Constructor to receive firstName and last Name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public String showPersonnelInfo() {
        return "Employee Name: " + firstName.toUpperCase() + " " + lastName.toUpperCase() + "\n" +
                "Email: " + email + "\n" +
                "Department: " + department + "\n" +
                "Mailbox capacity: " + mailboxCapacity + "mb" + "\n" +
                "Temporary password: " + password + "\n" +
                "Please reset password after first successful login";
    }
}
