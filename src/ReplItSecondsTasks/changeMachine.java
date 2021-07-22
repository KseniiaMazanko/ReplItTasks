package ReplItSecondsTasks;

import java.util.Scanner;

public class changeMachine {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int remainder = 0;


        if(cents>0 && cents < 100){
            quarters = cents/25;
            remainder = cents%25;

            dimes = remainder/10;
            remainder = remainder%10;

            nickels = remainder/5;
            remainder = remainder%5;

            pennies = remainder/1;

            System.out.println("Your change is " + quarters + " quaters, " + dimes + " dimes, " + nickels + " nickels, " + "and " + pennies + "pennies");

        }
        else {
            System.out.println("Invalis cents amount");
        }

    }
}
