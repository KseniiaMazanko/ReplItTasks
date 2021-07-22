package SelfPracticeStringLoop;

import java.util.Scanner;

public class FindUnique {

    public static void main(String[] args) {



        //ask the user for a string and then remove all the duplicates (leave only unique)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scan.next();

        String result = "";

        for(int i=0; i<input.length(); i++){

            char ch = input.charAt(i);

            boolean isUnique = input.indexOf(ch) == input.lastIndexOf(ch);

            if(isUnique) {
                result +=ch;
            }

        }
        System.out.println("The unique characters of the entered are: " + result);

    }
}
