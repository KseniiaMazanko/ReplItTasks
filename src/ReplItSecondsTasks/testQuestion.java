package ReplItSecondsTasks;

public class testQuestion {

    public static void main(String[] args) {


        String s1 = new String("abc");
        String s2 = new String ("abc");

        String s3 = "abc";
        String s4 = "abc";

//        System.out.println(s1.equals(s2)); //    "s1==s2 is:abc"   !=    "abc"
//        System.out.println(s3.equalsIgnoreCase(s4));

        System.out.println(s1==s2);

        System.out.println(s3==s4);
    }


}
