package ReplItSecondsTasks;

import java.util.Scanner;

public class QuizzTask {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        //your code here
        String result = "";
        if(a.equals("a") || a.equals("b") || a.equals("c")){
            if(a.equals("b")){
                result = a + " is correct";
            }
            else {
                result = a + " is wrong";
            }
        }
        else {
            result = a + " is not a valid answer";
        }

        System.out.println(result);


    }
}
