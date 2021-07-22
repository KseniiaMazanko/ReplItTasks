package ReplItSecondsTasks;

import java.util.Scanner;

public class FindTheLongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }


        String theLongest = "";
        for(int i=0; i< words.length; i++){
            if(words[i].length()>theLongest.length()){
                theLongest=words[i];
            }
        }
        System.out.println(theLongest);

    }

}
