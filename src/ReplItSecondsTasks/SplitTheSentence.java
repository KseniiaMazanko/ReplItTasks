package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SplitTheSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        if(!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")){
            System.out.println("invalid email");
        }
        else{
            String [] splited = email.split("@");
            String id = splited[0];
            String domain = splited[1];
            //System.out.println(Arrays.toString(id));
            System.out.println("Email id: " + id);
            System.out.println("Email domain: " + domain);
        }


    }




}
