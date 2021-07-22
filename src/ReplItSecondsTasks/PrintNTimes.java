package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintNTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result = "";

        for(int i=0; i<n; i++){
            result+="*";
        }
        System.out.println(result);


    }

}
