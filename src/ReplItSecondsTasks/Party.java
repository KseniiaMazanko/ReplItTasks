package ReplItSecondsTasks;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name = input.next();
        String result = "" + name;

        while(true){
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next();
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");
                name = input.next();
                result += ", " + name;
            }
            else if(answer.equalsIgnoreCase("no")){
                System.out.println("Guest's list: " + result);
                break;
            }
        }


    }
}
