package ReplItSecondsTasks;

import java.util.Scanner;

public class TestUnit {

    public static void main(String[] args) {


        int _firstName = 5;
        int $first = 5;

//        int a =5;
//        byte b = (byte) a;
//        System.out.println(b);

        int num = -5;
        System.out.println(num++ + ",");
        System.out.println(num=0);
        System.out.println("," + --num);

//        short s = 13-9/3*10;
//        s+=-10;
//        System.out.println(s);

//        boolean one = ('a' != 'z') && false;
//        boolean two = one || 0 ==(9-10+1);

//        System.out.println(two);
//        System.out.println(one);

        long l = 100;
        short d = (short)l;
        System.out.println(d+10);

        int a =10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);

        short s = 13+3*(10-6)%2;
        boolean b = s !=25;

        System.out.println(b);

        byte c = 104;
        boolean check = c<100;

        if(check){
            c-=100;

        }
        else{
            c=50;
        }
        System.out.println(c);

        double decimal = 13.142;

        int whole = decimal<20 ? 20:10;

        System.out.println(whole);


        String name = "Jimmy";
        boolean lof;

        if(name == "James") {
            check=false;
        }
        else{
            check=true;
        }

//        String str = check ? "5":"10";
//        System.out.println(str == 10);

        int one = 5;
        int two = 2;

        if(one-- > two*2){
            System.out.println("one");
        }
        else{
            System.out.println(two);
        }









    }


}
