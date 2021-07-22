package ReplItSecondsTasks;

import java.util.Scanner;

public class AverageTemps {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double sum = 0;
        double average = 0;

        for (double temp : temps) {
            sum+=temp;
            average = sum/temps.length;
        }

        System.out.println(average);

        }
    }



