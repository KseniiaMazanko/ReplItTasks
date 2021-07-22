package ReplItSecondsTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt()};
        int count =0;

        while(!(inhabitants[0]==0 && inhabitants[1]==0 && inhabitants[2]==0 && inhabitants[3]==0 && inhabitants[4]==0
                && inhabitants[5]==0 && inhabitants[6]==0 && inhabitants[7]==0)){
          System.out.println("Day " + count + Arrays.toString(inhabitants));
          for (int i = 0; i < inhabitants.length; i++) {
              inhabitants[i] = inhabitants[i] / 2;
          }
          count++;
      }


        System.out.println("Day " + count + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");









        }


        //System.out.println(Arrays.toString(inhabitants));




}
