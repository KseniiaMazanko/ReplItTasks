package ReplItSecondsTasks;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));

    }

    public static int max(int x, int max){

        if(x>max){
            return x;
        }
        else if(x<max){
            return max;
        }
        else{
            return x;
        }


    }


}
