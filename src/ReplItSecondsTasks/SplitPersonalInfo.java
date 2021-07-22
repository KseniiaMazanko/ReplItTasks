package ReplItSecondsTasks;

import java.util.Scanner;

public class SplitPersonalInfo {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {

        String array [] = info.split(",");
        System.out.println("person name: " + array[0] + "\nlast name: " + array[1]
                + "\nage: " + array[2]);

    }

}
