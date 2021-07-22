package ReplItSecondsTasks;

import java.util.Scanner;

public class Laptop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size: ");
        double size = scan.nextDouble();
        int price = 0;

        if(size==13.3){
            price+=200;
        }
        else if(size==15.0){
            price+=300;
        }
        else if(size==17.3){
            price+=400;
        }

        System.out.println("Select CPU type: ");
        String cpu = scan.next();

        if(cpu.equalsIgnoreCase("i3")){
            price+=150;
        }
        else if(cpu.equalsIgnoreCase("i5")){
            price+=250;
        }
        else if(cpu.equalsIgnoreCase("i7")){
            price+=350;
        }

        System.out.println("Select RAM size: ");
        int ram = scan.nextInt();
        for(int i=4; i<=ram; i++){
            if(i%4==0){
                price+=50;
            }
        }

        System.out.println("Select storage type: ");
        String storageType = scan.next();

        System.out.println("Enter memory size: ");
        int memory = scan.nextInt();

        if(storageType.equalsIgnoreCase("SSD")) {
            for (int i = 500; i <= memory; i++) {
                if (i % 500 == 0) {
                    price += 100;
                }
            }
        }
        else if(storageType.equalsIgnoreCase("HDD")){
            for(int i=500; i<=memory; i++){
                if(i%500==0) {
                    price += 50;
                }
            }
        }


        System.out.println("Enter screen resolution: ");
        String screen = scan.next();

        if(screen.equalsIgnoreCase("FULLHD")){
            price+=100;
        }
        else if(screen.equalsIgnoreCase("4K")){
            price+=200;
        }

        System.out.println("Laptop price is: $" + price);



    }


}
