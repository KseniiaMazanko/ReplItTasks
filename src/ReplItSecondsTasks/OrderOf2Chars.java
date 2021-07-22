package ReplItSecondsTasks;

import java.util.Scanner;

public class OrderOf2Chars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        String result = "";

        for(char i = start; i<=end; i++){
            result+=i;
        }

        System.out.println(result);
    }


}
