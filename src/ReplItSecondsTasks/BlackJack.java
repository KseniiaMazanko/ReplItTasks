package ReplItSecondsTasks;

import java.util.Scanner;

public class BlackJack {


    public static void main(String[] args) {

        /*In blackjack after the player asks to keep the house 4 things may happen.

if the card total is bigger then 21 the player busts.

if the house score is bigger then the player, the player loses .

if the player score is equal to the house then they are a draw.

if the player score is bigger then the house the player wins.

player and house scores are represented by player and house int variables.

check them using ifs to determine the result.

         */
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        if(player>21){
            System.out.println("player bust");
        }
        else if(house>player){
            System.out.println("player loss");
        }
        else if(player>house){
            System.out.println("it's a tie");
        }
        else{
            System.out.println("player win");
        }

    }
}
