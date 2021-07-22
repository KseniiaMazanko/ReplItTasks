package ReplItSecondsTasks;

import java.util.Scanner;

public class UtopianTree {


    public static void main(String[] args) {

        int growth = 0;
        int size = 0;

        for(int year = 1; year<=10; year++){
            if(year>=1 && year<=3){
                growth=1;
                size+=growth;
            }
            if(year>3 && year<=10){
                growth=2;
                size+=growth;
            }
            System.out.println("year " + year + " - growth " + growth + " cm" + "\n" + "tree size: " + size);

        }


    }
}
