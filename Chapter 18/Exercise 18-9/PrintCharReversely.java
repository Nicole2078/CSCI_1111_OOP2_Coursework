/*
Author: Nicole Hackler
Date: 10/12/2023

Programming Exercise 18-9
(Print the character of a string reversely) Write a recursive method that displays a string
reversely on the console using the following header:

public static void reverseDisplay(String value)

*/
import java.util.*;

public class PrintCharReversely {

    public static void main(String[] args){
        //Created a scanner and user input to test the program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        // this was the original string
//    String s = "ABCDE";
    reverseDisplay(s);
    }

    //Method for Recursion
    public static void  reverseDisplay(String value){
        //Getting the last character in the string
        Character last = value.charAt(value.length() - 1);
        //Printing out the last character in the string
        System.out.print(last);
        //Reassigning the main string to a smaller string to reverse
        value = value.substring(0, value.length() - 1);
        //Base case
        if((null == value) || (value.length() <= 1)) {
            System.out.println(value);
        }
        //Recursive call
        else{
            reverseDisplay(value);

        }
    }
}
