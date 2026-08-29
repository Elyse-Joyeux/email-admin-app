import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("  WELCOME TO THE EMAIL MANAGEMENT SYSTEM  ");
        System.out.println("==========================================");

        System.out.print("Enter employee first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter employee last name: ");
        String lastName = scanner.nextLine();

        // creates the object using the original constructor logic
        Email emp1 = new Email(firstName, lastName);

        boolean running = true;

        while (running) {
            System.out.println("\n--- MANAGEMENT OPTIONS ---");
            System.out.println("1. Show Employee Details");
            System.out.println("2. Change Password");
            System.out.println("3. Set Alternate Email");
            System.out.println("4. Change Mailbox Capacity");
            System.out.println("5. Change Company Suffix");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\n--- ACCOUNT OVERVIEW ---");
                    System.out.println(emp1.showInfo());
                    System.out.println(emp1.getAlternateEmail());
                    break;

                case 2:
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    
                    // simple input validation check before calling the method
                    if (newPassword.length() < 6) {
                        System.out.println("ERROR: Password must be at least 6 characters!");
                    } else {
                        emp1.changePassword(newPassword);
                        System.out.println("SUCCESS: Password updated to: " + emp1.getPassword());
                    }
                    break;

                case 3:
                    System.out.print("Enter alternate email address: ");
                    String altEmail = scanner.nextLine();
                    
                    // format check before updating
                    if (!altEmail.contains("@") || !altEmail.contains(".")) {
                        System.out.println("ERROR: Invalid email address format!");
                    } else {
                        emp1.setAlternateEmail(altEmail);
                        System.out.println("SUCCESS: " + emp1.getAlternateEmail());
                    }
                    break;

                case 4:
                    System.out.print("Enter new mailbox capacity in MB: ");
                    int newCap = scanner.nextInt();
                    
                    if (newCap <= 0) {
                        System.out.println("ERROR: Capacity must be greater than 0MB!");
                    } else {
                        emp1.setMailBoxCapacity(newCap);
                        System.out.println("SUCCESS: New Mailbox Capacity is " + emp1.getMailBoxCapacity() + "MB");
                    }
                    break;

                case 5:
                    System.out.print("Enter new company suffix (e.g., company.com): ");
                    String newSuffix = scanner.nextLine();

                    if (!newSuffix.contains(".")) {
                        System.out.println("ERROR: Invalid domain format! Example: company.com");
                    } else {
                        emp1.setCompanySuffix(newSuffix);
                        System.out.println("SUCCESS: Company suffix updated to: " + emp1.getCompanySuffix());
                    }
                    break;

                case 6:
                    System.out.println("Exiting Email Management System. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid selection. Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}