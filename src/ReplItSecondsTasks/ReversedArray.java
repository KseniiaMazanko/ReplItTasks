package ReplItSecondsTasks;

import java.util.Arrays;

public class ReversedArray {

    /*
        Write a program that can reverse an array of integers
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

         */
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int [] reversed = new int[array.length];

        for(int i=array.length-1, j=0; i>=0; i--, j++){

            reversed [j] = array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversed));

    }



}
