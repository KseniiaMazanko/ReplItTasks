package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String result = "";

       for(int i = 0; i<word.length(); i++) {
           if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                   word.charAt(i) == 'o' || word.charAt(i) == 'u') {
               result += word.charAt(i);
           }
       }

           System.out.println(result);









    }

}
