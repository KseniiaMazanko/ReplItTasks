package ReplItSecondsTasks;

import java.util.Scanner;

public class TipCalculator {

    /*
    Write a program for a tip calculator. There will be different service quality benchmarks
    that will determine the tip given. There will also the ability to calculate based on the
    number of people in the party and if there is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number)
Service Quality: (String)
Total to pay:
Total tip:
Total per person:
Tip per person:

Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String split = scan.next();
        int numberOfPeople = scan.nextInt();
        double checkAmount = scan.nextDouble();
        String quality = scan.next();
        String amountOfPeople = "";
        double totalTip = 0;
        double totalAmount = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;

        switch (numberOfPeople){
            case 1:
                amountOfPeople="&";
                if(quality.equalsIgnoreCase("poor")){
                    totalTip = checkAmount * 0.05;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair")){
                    totalTip = checkAmount * 0.1;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("good")){
                    totalTip = checkAmount * 0.15;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("great")){
                    totalTip = checkAmount * 0.2;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("poor")){
                    totalTip = checkAmount * 0.25;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else {
                    System.out.println("Invalid tip amount");
                }

                break;
            case 2:
                amountOfPeople = "&&";
                if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("yes")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount / 2;
                    tipPerPerson = totalTip / 2;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.1;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/2;
                    tipPerPerson = totalTip/2;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.15;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/2;
                    tipPerPerson = totalTip/2;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.2;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/2;
                    tipPerPerson = totalTip/2;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.25;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/2;
                    tipPerPerson = totalTip/2;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else {
                    System.out.println("Invalid tip amount");
                }


                break;
            case 3:
                amountOfPeople = "&&&";
                if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("yes")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount / 3;
                    tipPerPerson = totalTip / 3;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.1;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/3;
                    tipPerPerson = totalTip/3;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.15;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/3;
                    tipPerPerson = totalTip/3;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.2;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/3;
                    tipPerPerson = totalTip/3;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.25;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/3;
                    tipPerPerson = totalTip/3;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }

                else {
                    System.out.println("Invalid tip amount");
                }
                break;
            case 4:
                amountOfPeople = "&&&&";
                if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("yes")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount / 4;
                    tipPerPerson = totalTip / 4;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.1;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/4;
                    tipPerPerson = totalTip/4;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.15;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/4;
                    tipPerPerson = totalTip/4;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.2;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/4;
                    tipPerPerson = totalTip/4;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.25;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/4;
                    tipPerPerson = totalTip/4;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }

                else {
                    System.out.println("Invalid tip amount");
                }
                break;
            case 5:
                amountOfPeople = "&&&&&";
                if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("yes")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount / 5;
                    tipPerPerson = totalTip / 5;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("poor") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.1;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/5;
                    tipPerPerson = totalTip/5;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("fair") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.15;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/5;
                    tipPerPerson = totalTip/5;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("good") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.2;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/5;
                    tipPerPerson = totalTip/5;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("great") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);

                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("yes")){
                    totalTip = checkAmount * 0.25;
                    totalAmount =checkAmount+totalTip;
                    totalPerPerson = totalAmount/5;
                    tipPerPerson = totalTip/5;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: "+ totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }
                else if(quality.equalsIgnoreCase("excellent") && split.equalsIgnoreCase("no")) {
                    totalTip = checkAmount * 0.05;
                    totalAmount = checkAmount + totalTip;
                    totalPerPerson = totalAmount;
                    tipPerPerson = totalTip;
                    System.out.println("Number of people entered:" + amountOfPeople + "\n" + "Total to pay: " + totalAmount + "\n" + "Total tip: " + totalTip + "\n" +
                            "Total per person: " + totalPerPerson + "\n" + "Tip per person: " + tipPerPerson);
                }

                else {
                    System.out.println("Invalid tip amount");
                }
                break;

        }



    }
}
