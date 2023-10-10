/*
Author: Nicole Hackler
Date: 10/9/2023

Programming 17-14 & 17-15
(Encrypt file) Encode the file by adding 5 to every byte in the file. Write a program that
prompts the user to enter an input file name and an output file name and saves the encrypted
version of the input file to the output file.

(Decrypt files) Suppose a file is encrypted using the scheme in Programming Exercise 17.14.
Write a program to decode an encrypted file. Your program should prompt the user to enter
an input file name for the encrypted file and an output file name for the unencrypted
version of the input file.
*/
import java.io.*;
import java.util.*;

public class EncryptDecrypt {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        //Encryption:
        //User input for the file to read from.
        System.out.println("File Encryption");
        System.out.println("Enter an source file to encrypt: ");
        File sourceFile = new File(input.nextLine() + ".dat");
        //User input for the file to be saved to.
        System.out.println("Enter an target file name to save the encryption to: ");
        File targetFile = new File(input.nextLine() + ".dat");

        //Input (reads/displays from file)
        try(
                BufferedInputStream source = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream target = new BufferedOutputStream(new FileOutputStream(targetFile))
        ){
            int value;
            while((value = source.read()) != -1)
                target.write(value + 5);

        }
        catch (EOFException ex){
            System.out.println("End of file.");
        }

        //Decryption:
        //Source file should be the one previously used as the target file to encrypt
        System.out.println("Decryption");
        System.out.println("Enter file to decrypt: ");
        File newSourceFile = new File(input.nextLine() + ".dat");
        System.out.println("Enter new file source name for the decrypted file: ");
        File newTargetFile = new File(input.nextLine() + ".dat");
        //Input (reads/displays from file)
        try(
                BufferedInputStream newSource = new BufferedInputStream(new FileInputStream(newSourceFile));
                BufferedOutputStream newTarget = new BufferedOutputStream(new FileOutputStream(newTargetFile))
        ){
            int value;
            while((value = newSource.read()) != -1)
                newTarget.write(value - 5);

        }
        catch (EOFException ex){
            System.out.println("End of file.");
        }
    }
}
