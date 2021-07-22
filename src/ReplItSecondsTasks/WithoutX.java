package ReplItSecondsTasks;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";

        if((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("X") || word.endsWith("x"))){
            result = word.substring(1, word.length()-1);
            System.out.println(result);
        }
        else{
            System.out.println(word);
        }

    }


}
