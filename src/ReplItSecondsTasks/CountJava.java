package ReplItSecondsTasks;

import java.util.Scanner;

public class CountJava {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count =0;

        for(int i=0; i<=word.length()-4; i++){
            String each = word.substring(i, i+4);
            //System.out.println("each = " + each);
            if(each.equals("java"))
            {
                count++;
            }
        }
        System.out.println("count = " + count);





    }
}
