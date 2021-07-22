package ReplItSecondsTasks;

import java.util.Scanner;

public class Next3 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    public static void next3 (int num){
        int a=num+1;
        int b=num+2;
        int c = num+3;
        System.out.println("next 3 are: " + a + " " + b + " "+ c + " ");
    }

}
