# Java Email Administration Application

A Java-based console application designed to automate the process of creating email accounts for new employees. It handles department assignment, secure random password generation, mailbox capacity management, and alternate email configuration.

---

## Features

- **Automated Email Generation**: Constructs corporate email addresses using the format `firstname.lastname@department.company.com`.
- **Department Selection**: Interactively assigns users to specific departments (`Sales`, `Development`, `Accounting`, or `None`).
- **Random Password Generation**: Automatically creates a secure, randomized password of configurable length upon account creation.
- **Encapsulated Setter Methods**: Allows updating:
  - Mailbox capacity
  - Alternate email address
  - Password
- **Getter Methods**: Safely retrieves current account details without exposing private variables directly.
- **Account Summary**: Displays complete user details via `showInfo()`.

---

## File Structure

```text
emailApp/
│
├── Email.java       # Contains class variables, constructors, and core methods
├── EmailApp.java    # Contains the main method to run and test the application
└── README.md        # Project documentation