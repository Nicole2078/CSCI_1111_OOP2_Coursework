/*
Author: Nicole Hackler
Date: 10/11/2023

Programming Exercise 18-3
(Compute greatest common divisor using recursion) The gcd(m, n) can also be defined recursively
as follows:

If m%n is 0, gcd(m, n) is n.
Otherwise, gcd(m, n) is gcd(n, m%n).

The percent symbol (%) is this case represents the modulus operator. The % operator returns the
remainder of two numbers.

Write a recursive method to find the GCD. Write a test program that prompts the user to enter two
integers and display their GCD.
*/
import java.util.*;

public class GCD_usingRecursion {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //User input
        System.out.println("Compute greatest Common Divisor using recursion.");
        System.out.println("Enter the first integer: ");
        int m = input.nextInt();
        System.out.println("Enter the second integer: ");
        int n = input.nextInt();

        //calling the recursion method
        System.out.println("The GCD of " + m + " and " + n + " is: " + gcd(m, n));

    }
    //Method for Recursion
    public static long gcd(long m, long n){
        if (m % n == 0) //Base case
            return n;
        else //Recursive call
            return gcd(n, m % n);
    }
}
