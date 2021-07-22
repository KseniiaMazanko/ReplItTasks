package SelfPracticeStringLoop;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        //ask the user to enter a string and then remove all the duplicate chars

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scan.next();

        String result = "";

        for(int i = 0; i<=input.length()-1; i++){
            if(!result.contains(""+input.charAt(i))){
                result += input.charAt(i);
            }

        }
        System.out.println(result);



    }

}
