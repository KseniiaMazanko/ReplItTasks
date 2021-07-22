package ReplItSecondsTasks;

import java.util.Scanner;

public class PrintUniqueWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (String word : words) {
            int count=0;
            for(int i=0; i<words.length; i++){
                if(word.equals(words[i])){
                    count++;
                }

        }
            if(count==1){
                System.out.println(word);
            }

    }






    }


}
