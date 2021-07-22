package ReplItSecondsTasks;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Scanner;

public class PrintThreeFirstLetters {
/*
The code provided in your main method will take in five Strings and
save them into an array called arr. Print out the first three
letter of each element on seperate lines. You can assume that every
element of arr is at least 3 letters long.
 */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        for(int i=0; i<arr.length; i++){
            String each = arr[i].substring(0,3);
            System.out.println(each);
        }



    }



}
