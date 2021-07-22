package ReplItSecondsTasks;

import java.util.Scanner;

public class CLeanString {

    public static String clean (String text , String badWord) {

        String [] result = text.split(" ");
        String resultStr = "";
        for(int i=0; i<result.length; i++){
            if(result[i].equals(badWord)){
                continue;
            }
            resultStr+=result[i]+" ";
        }

return resultStr;


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));


    }






}

/*
    This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

```
clean ("one two three","two")

returns "one three"
```

```
clean ("foo bar","foo")

returns "bar"
```

```
clean ("he said bla bla bla","bla")

returns "he said"
```
     */
