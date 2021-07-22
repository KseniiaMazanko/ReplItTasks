package ReplItSecondsTasks;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {


        int [] num1 = new int[12];
        int [] num2 = {1,2,3,4,5};
        num1=num2;
        for(int i=0; i<num1.length;i++){
            System.out.println(num1[i]);
        }
        //System.out.println(Arrays.toString(num1));
    }
}
