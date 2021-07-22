package ReplItSecondsTasks;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the item:");
        String input = scan.nextLine();

        int balance = 100;

        int blanket = 60;
        int charger = 15;
        int hat = 25;
        int headphones = 30;
        int laptop = 200;
        int pants = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int cable = 10;



        if(input.equalsIgnoreCase("blanket")){
            if(balance<blanket || balance==0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }
            else{
                balance-=blanket;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("charger")){
            if(balance<charger || balance==0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }
            else {
                balance -= charger;
                System.out.println("Thank you for your purchase!" + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("hat")) {
            if (balance < hat || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= hat;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("headphones")) {
            if (balance < headphones || balance ==  0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= headphones;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("laptop")) {
            if (balance < laptop || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= laptop;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("pants")) {
            if (balance < pants || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= pants;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("pillow")) {
            if (balance < pillow || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= pillow;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("smartphone")) {
            if (balance < smartphone || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= smartphone;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("socks")) {
            if (balance < socks || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= socks;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else if(input.equalsIgnoreCase("USB cable")) {
            if (balance < cable || balance == 0) {
                System.out.println("Sorry, not enough funds on your gift card!");
            } else {
                balance -= cable;
                System.out.println("Thank you for your purchase! " + "\n" + "Your current balance is: " + balance + "$");
            }
        }
        else {
            System.out.println("Invalid item!");
        }




    }

}
