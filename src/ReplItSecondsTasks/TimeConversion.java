package ReplItSecondsTasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {

        String result = "";
        String[] array = s.split(":");

        if (array[2].contains("AM")) {
            if (array[0].equals("12")) {
                array[0] = "00";
                array[2]=array[2].substring(0, array[2].length() - 2);
                result += array[0] +":"+ array[1] +":" + array[2];
            } else {
                result += array[0]+ ":" + array[1] + ":" + array[2].substring(0, array[2].length() - 2);
            }
        } else if (array[2].contains("PM"))
            if (array[0].equals("12")) {
                array[2]=array[2].substring(0, array[2].length() - 2);
                result += array[0] +":"+ array[1] +":"+ array[2];
            }
            else {
                int hours12 = Integer.parseInt(array[0]);
                result = (hours12 + 12) + ":" + array[1] +":" + array[2].substring(0, array[2].length() - 2);
            }
        System.out.println(result);
    }



    }







