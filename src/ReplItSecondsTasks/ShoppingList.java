package ReplItSecondsTasks;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
            do {
                System.out.println("Enter Item" + count + " and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport+="Item"+count + ": "+  item + " Price: " + price;
                count++;
                totalPrice += price;
                System.out.println("Add one more item?");
                countinue = scan.next();
                if(countinue.equals("yes")){
                    shoppingListReport+=", ";
                }
            }

            while (countinue.equals("yes") && count <= 10);
        System.out.println(shoppingListReport);
        System.out.println("Total price: " + totalPrice);

    }


}
