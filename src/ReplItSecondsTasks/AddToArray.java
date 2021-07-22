package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {

    // youyr codes here
    public static void add_to_r(int[] r, int n) {
        //create new array with one more position:
       int [] resultArr = Arrays.copyOf(r, r.length+1);
       resultArr[resultArr.length-1]=n;
        System.out.println(Arrays.toString(resultArr));
    }


    // Do not change those lines
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        add_to_r(arr, n);

    }
}
