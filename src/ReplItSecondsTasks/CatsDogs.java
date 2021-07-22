package ReplItSecondsTasks;

import java.util.Scanner;

public class CatsDogs {


    public static void main(String[] args) {

        /*Print true if the string "cat" and "dog" appear the same number of times
        in the given string word.*/

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();


        for(int i=0; i<=word.length()-3; i++){
            String each = word.substring(i, i+3);

            if(each.equals("cat")){
                countOfCats++;
            }
            if(each.equals("dog")){
                countOfDogs++;
            }
            System.out.println(each);


        }

        boolean isSame = countOfCats==countOfDogs;

        if(isSame){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
