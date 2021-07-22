package ReplItSecondsTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] arr = str.split(", ");

        String result = "";

        String shortest = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i].length()<shortest.length()){
                shortest= arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i].length()==shortest.length()){
                result+=arr[i]+",";
            }
        }



        String [] resultArr = result.split(",");
        Arrays.sort(resultArr);

        System.out.println(Arrays.toString(resultArr));

        





    }






}
