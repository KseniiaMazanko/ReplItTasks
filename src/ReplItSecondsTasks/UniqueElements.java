package ReplItSecondsTasks;

public class UniqueElements {

    public static void main(String[] args) {

        /*write a program that can print out the unique numbers from an array of integers
        Ex:
        int[] arr ={1,1,2,3,3,4}

        output:
        2 4
        */

        int[] arr ={1,1,2,2,3,3,4,4,5,6,7,8,9,10};

        for(int j=0; j<arr.length; j++){


            int element = arr[j];
            int count = 0;

            for(int i=0; i<arr.length; i++){
                if(element ==arr[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(element + " ");
            }

        }





    }
}
