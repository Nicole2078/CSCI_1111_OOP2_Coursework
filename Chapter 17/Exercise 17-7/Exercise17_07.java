/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * ** Changes made by: Nicole Hackler **
 * Date: 10/05/2023
 *
 * Programing 17-7
 * (Restore objects from a file) The Loan class in Listing 10.2 does not implement
 * Serializable. Rewrite the Loan class to implement Serializable. Exercise17_07
 * creates a file named Exercise17_07.dat containing Loan objects that were written
 * using the ObjectOutputStream. Modify Exercise17_07 by adding a void function
 * called outputData that reads the Loan objects from the file and displays the total
 * loan amount. Suppose you don't know how many loan objects there are in the file, use
 * EOFException to end the loop.
 */
/**
 *
 * @author rmazorow
 */
import java.io.*;

public class Exercise17_07 extends Loan {
    public static void main(String[] args) throws FileNotFoundException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);

        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
            outputData();
        }
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
    }

    //The method (function.... giggle..) the assignment asked for called outputData
    public static void outputData() throws IOException {
        try (
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
        ) {
            Loan loan1 = (Loan)(input.readObject()); //creating the first object after reading it
            Loan loan2 = (Loan)(input.readObject()); //creating the second object after reading it
            System.out.println("The total loan amount for Loan1 is: " + loan1.getLoanAmount());
            System.out.println("The total loan amount for Loan2 is: " + loan2.getLoanAmount());
        }
        catch (EOFException | ClassNotFoundException ex){
            System.out.print("End of File");
        }
    }
}
