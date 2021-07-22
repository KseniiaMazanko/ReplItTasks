package ReplItSecondsTasks;

import java.util.Scanner;

public class ScannerALotOfInputs {

    public static void main(String[] args) {

        int age = 0;
        int zipcode = 0;

        double height = 0;
        double weight = 0;

        boolean isMarried = false;

        long workPhoneNumber = 0;
        long personalPhoneNumber = 0;

        String email = "";
        String street = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!" + "\n" + "Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();

        // continue for city:
        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zipcode");
        zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Enter your height");
        height = scan.nextDouble();

        System.out.println("Enter your weight");
        weight = scan.nextDouble();

        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();




        System.out.println("Patient personal information" + "\n" + "Full name: " + lastName + " " + firstName + "\n"
                + " Address: " + street + ", " + city + ", " + state +" " + zipcode + "\n" + " Contacts: work phone number - "
                + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email + "\n" + " Age: "
                + age + "\n" + " Height: " + height + "\n" + " Weight: " + weight + " pounds"  + "\n" + " Married?: " + isMarried);



    }
}
