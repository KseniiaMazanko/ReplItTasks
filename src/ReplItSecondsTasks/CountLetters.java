package ReplItSecondsTasks;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));

    }

    public static String countLetters(String str){

        String result = "";
        int count = 0;
        for(int j=0; j<str.length(); j++){
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
                result =  count+""+ str.charAt(j);
            }

        }


return result;

    }
    /*
    Write a method countLetters that can count letters in a given string and return a new string in the given format:

number of letters + letter
number of letters + letter
Example:

input: countLetters("aaabbcccc");

output: "3a2b4c"
     */


}
