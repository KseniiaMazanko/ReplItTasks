package SelfPracticeStringLoop;

import java.util.Scanner;

public class StringReverse {


    //ask the user to enter a string and then reverse it

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word you would like me to reverse:");
        String input = scan.next();

        String reverse = "";

        for(int i=input.length()-1; i>=0; i--){
            reverse += input.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);

    }
}
