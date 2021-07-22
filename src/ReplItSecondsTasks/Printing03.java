package ReplItSecondsTasks;

import java.util.Scanner;

public class Printing03 {

    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
		String[] arr = new String[6];
		for (int i=0;i<6;i++)
		{
			arr[i] = input.nextLine();
		}
         */

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }

        for(int i=0; i< arr.length-2; i++){
            System.out.println(arr[i] + ", " + arr[i+1] + ", " + arr[i+2]);
        }


    }

}
