
import java.util.Scanner;
public class Email{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 700;
    private String alternateEmail;
    private String companySuffix = "elysecompany.com";

    // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+ this.firstName + " " + this.lastName);

        // call a method asking for the department and return the department
        this.department = setDepartment();
        System.out.println("Department is " + this.department);


        // call a method returning a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine firstName and lastName to generate an email
        String depPrefix = department.isEmpty() ? "" : department + ".";
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + depPrefix + companySuffix; 
        System.out.println("Your email is " + this.email);
    }
    // ask the department
    private String setDepartment(){
        System.out.print("Department Choice\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice == 1){ return "sales";}
        else if(depChoice == 2){ return "dev";}
        else if(depChoice == 3){ return "acct";}
        else { return "";}
    }
    // generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYZ1234567890!@#$%&*";
        char[] password = new char[length];

        for(int i = 0; i < length; i++){
           int random = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }

    // set the mail box capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }


    // set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail; 
    }


    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail(){
        return ("Your alternate email is " + alternateEmail);
     }
    public String getPassword() { return password; }

}