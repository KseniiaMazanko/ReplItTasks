package ReplItSecondsTasks;

import java.util.Scanner;

public class email {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = "";
        String lastName = "";
        String result = "";
        String domain = "";

        if(email.contains("_")){
            firstName = email.substring(0, email.indexOf("_"));
            lastName  = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));
            result = lastName + "_" + firstName + domain;
            System.out.println(result);
        }
        else{
            System.out.println(email);
        }


    }

}
