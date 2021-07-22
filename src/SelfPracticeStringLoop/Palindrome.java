package SelfPracticeStringLoop;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = scan.next();

        String reversed = "";

        for(int i = input.length()-1; i>=0; i--){
            reversed +=input.charAt(i);
        }

        if(reversed.equalsIgnoreCase(input)){
            System.out.println("The entered word is palindrome");
        }
        else{
            System.out.println("The entered word is not palidrome");
        }

    }



}
