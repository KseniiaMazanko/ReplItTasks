package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {


        float f1 = (12_345.1>123_45.0)? 12_456:124_56.02f;
        float f2 = f1+1024;

        System.out.println(f2);


        System.out.println("_______________________________");


        String str = " ";
        str.trim();
        boolean A = str.isEmpty();

        System.out.println(A);

        String str2 = "Batch 21";
        int Z = str2.trim().length();

        System.out.println(Z);

        System.out.println("_______________________");
        String s1= "abc";
        String s2 = "abc";
        System.out.println("s1==s2 is:" + s1==s2);


            boolean x = true;
            boolean y = !x==false;
        System.out.println("y = " + y);


        double z=10;
        switch((int) z) {
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }

        char [] array = {'D', 'C', 'A', 'B'};
        Arrays.sort(array);

        for(char each: array){
            System.out.println(each+" ");
            if(each=='D'){
                continue;
            }
        }

        int wd = 0;
        String[] days = {"sun", "mon", "wed", "sat"};
        for(int i=0; i<days.length;i++){
            switch(days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;
            }
        }
        System.out.println(wd);


        int [] num1 = new int[3];
        int [] num2 = {1,2,3,4,5};
        num1=num2;
        for(int i=0; i<num1.length;i++){
            System.out.println(num1[i]);
        }



        }

    }



