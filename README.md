# Email Application

This application automates the process of creating email accounts for new hires in an organization. It generates email addresses based on the provided information, allows setting mailbox capacity, and generates temporary passwords for new accounts.

## Features

- **Email Generation:** Automatically generates email addresses using the provided first name, last name, and department information.
- **Department Selection:** Users can select the department code (Sales, Development, Accounting, or None) for the new employee.
- **Password Generation:** Generates a temporary password for new email accounts.
- **Mailbox Capacity Setting:** Allows setting the mailbox capacity for each email account.
- **Password Change:** Provides functionality to change the temporary password after the first successful login.

## How to Use

1. **Compile:** Compile the source files using a Java compiler.
2. **Run:** Execute the `EmailApp` class to create a new email account.
3. **Follow Prompts:** Enter the first name, last name, and department code for the new employee as prompted.
4. **Review Output:** Review the generated email account information, including the email address, department, mailbox capacity, and temporary password.

## Sample Usage
```bash
$ java org.example.EmailApp
Enter first name = John
Enter last name = Doe
New employee John. Select department code
1 for Sales
2 for Development
3 for Accounting
0 for none
Enter department code here = 1
Employee Name: JOHN DOE
Email: john.doe@sales.company.com
Department: sales
Mailbox capacity: 100mb
Temporary password: D#i(i04F2p
Please reset password after first successful login
```

## Dependencies

None
