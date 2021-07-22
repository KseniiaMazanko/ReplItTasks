package ReplItSecondsTasks;

import java.util.Scanner;

public class Population {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int result = 0;
        int day = 0;

        while (inhabitants>=0){
            if(inhabitants==0){
                System.out.println("---- EXTINCT ----");
                break;
            }
            else {
                System.out.println("Day " + day + "[" + inhabitants + "]");
                inhabitants = inhabitants / 2;
                day++;

            }
        }


    }

}
