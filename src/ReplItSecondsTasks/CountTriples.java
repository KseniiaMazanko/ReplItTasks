package ReplItSecondsTasks;

import java.util.Scanner;

public class CountTriples {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        String result="";
        for (int i = 0; i <= str.length() - 3; i++) {

          result = "" + str.charAt(i) + str.charAt(i) + str.charAt(i);
          String each = str.substring(i,i+3);
          if(each.equalsIgnoreCase(result)){
              count++;
          }
        }

        /*for(int i=0; i<str.length()-2;i++) {
                if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
                    count++;
                }
        }

         */
        System.out.println(count);



    }

}
