package ReplItSecondsTasks;

import java.util.Scanner;

public class LimitString {

    public static String limit(String text, int maxLength){
        // your code

        String result = text.substring(0, maxLength);
        return result;




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }

}
/*
This method gets a string and an int, it returns a string.

The method will limit the given String by a certain amount of characters(given int)

Examples:

limit("abcd",2)

returns "ab"
limit("abcd",2)

returns "ab"
limit("bla bla",3)

returns "bla"
 */
