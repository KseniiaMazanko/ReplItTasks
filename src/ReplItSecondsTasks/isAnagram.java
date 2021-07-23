package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagram {

    public static boolean isAnagram(String word1, String word2) {

        String [] arr = word1.toLowerCase().split("");
        String [] arr2 = word2.toLowerCase().split("");

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(Arrays.equals(arr, arr2)){
            return true;
        }

        return false;



    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));



    }

}
