package ReplItSecondsTasks;

import java.util.Scanner;

public class AppearenceOfTwoWordsEqual {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        boolean areEqual = false;
        int countOfJava = 0;
        int countOfPython = 0;

        for(int i=0; i<=sentence.length()-4; i++){
            String eachJava = sentence.substring(i, i+4);
            //System.out.println(eachJava);
            if(eachJava.equals("java")){
                countOfJava ++;
            }
        }

        for(int i=0; i<=sentence.length()-6; i++){
            String eachPython = sentence.substring(i, i+6);
            //System.out.println(eachPython);
            if(eachPython.equals("python")){
                countOfPython ++;
            }
        }

        if(countOfJava == countOfPython) {
            areEqual = true;
        }


        System.out.println("areEqual = " + areEqual);

    }

}
