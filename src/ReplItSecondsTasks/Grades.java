package ReplItSecondsTasks;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter subject name number 1 and score for this subject");

        String name1 = scan.next();
        double number1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String name2 = scan.next();
        double number2 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String name3 = scan.next();
        double number3 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String name4 = scan.next();
        double number4 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String name5 = scan.next();
        double number5 = scan.nextDouble();

        double average = number1+ number2 + number3 + number4 + number5;

      //  scan.close();

        System.out.println("Summary: " + name1 + " - " + number1 + ", " + name2 + " - " + number2 + ", "
                + name3 + " - " + number3 + ", " + name4 + " - " + number4 + ", " + name5 + " - " + number5 + "\n" +
                "Your average score is: " + average + "\n" + "Thank you for using Grader!" + "\n" + "Goodbye!");
    }
}
