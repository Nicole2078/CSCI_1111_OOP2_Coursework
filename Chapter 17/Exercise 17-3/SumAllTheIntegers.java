/*
Author: Nicole Hackler
Date: 10/4/2023

Exercise 17-3
(Sum all the integers in a binary data file) Write a program that contains 2 methods:

1. Write a method to create a file named Exercise17_3.dat if it does not exist. Append
new data to it if it already exists. Write 100 integers created randomly into the file
using writeInt(int) in DataOutputStream. Integers are separated by a space.

2. Write a method that reads the integers from the file and finds the sum of the integers.
Assume the file contains an unspecified number of integers.
 */
import java.io.*;

public class SumAllTheIntegers {
    public static void main(String[] args) throws IOException {
    //Calling the dataOutput method
        out();
        int sumMain = sumIn();
        System.out.println(sumMain);
    }
    public static int sumIn()throws IOException{

        //Creating an input stream and reading/writing them for the file
        DataInputStream inData =
                new DataInputStream(new BufferedInputStream(new FileInputStream("Exercise17_3.dat")));

        int sumSumIn = 0;
        try {
            while (true)
                sumSumIn += inData.readInt();
        }catch (EOFException ex){
            return sumSumIn;
        }
    }

    public static void out() throws IOException {
        //Creating an output stream and a file
        DataOutputStream outData =
                new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Exercise17_3.dat", true)));

        int randomNumber = 0;
        //Creating 100 random numbers and writing them to the file
        for (int i = 0; i < 100; i++) {
            randomNumber = (int) ((Math.random()) * 100);
            outData.writeInt(randomNumber);
        }
        outData.flush();
    }
}
