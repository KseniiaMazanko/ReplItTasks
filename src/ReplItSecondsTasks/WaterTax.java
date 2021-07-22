package ReplItSecondsTasks;

import java.util.Scanner;

public class WaterTax {

    public static double waterTax(double units){
        double bill = 0.0;
        double fee50 = 50.0;
        double fee100=100.0;

        //your code here


        if(units>150){
            bill=(units*0.90)+fee100;
        }
         else if(units>100){
            bill=(units*0.90)+fee50;
        }
        else if(units>50){
            bill=units*0.90;
        }

       else{
            bill = units*0.60;
        }



        //end your code here

        return bill;
    }//end waterTax

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }


}
