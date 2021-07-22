package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintFirstAndLastChar {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine(),input.nextLine()};
        String result = "";

        for (String each : words) {
            for(int i=0; i<each.length(); i++){
                result = "" + each.charAt(0) + each.charAt(each.length()-1);

            }
            System.out.println(result);
        }


    }

}
