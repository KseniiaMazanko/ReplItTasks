package ReplItSecondsTasks;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        int result = 1;

        for (int i=1; i<=number; i++){
            result*=i;

        }
        System.out.println(result);


    }


}
