package ReplItSecondsTasks;

import java.util.Scanner;

public class SecondsTask {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;
        int seconds = 0;

        hours = inputSeconds/3600;
        remainingSeconds = inputSeconds%3600;
        minutes = remainingSeconds/60;
        seconds = remainingSeconds%60;

        System.out.println(hours + " hours, " + minutes + " minutes," + seconds + " seconds");


        /* Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:

"Enter seconds:"

Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.

Assign values to the hours, minutes, seconds variables

Display the result.

Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
         */

    }

}
