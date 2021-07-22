package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {

        //int i = 1;
        //int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String result = "";

        for (int i = 1; i <= n; i++) {
            result+="*";
            System.out.println(result);
        }




    }

}
