import java.util.Scanner;
import java.io.*;

public class FileWriteDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      String fileName;
      String friendName;
      int numFriends;
      
      System.out.print("How many friends do you have? ");
      numFriends = input.nextInt();
      
      //Comsume the remaining newline character
      input.nextLine();
      
      //Get the filename
      //If the file already exists, it will be erased and a new empty file 
      //with the same name will be created.
      System.out.print("Enter the filename: ");
      fileName = input.nextLine();
      
      //step1: Open the file
      //PrintWriter might throw an Exception like disk is full
      PrintWriter outputFile = new PrintWriter(fileName);
      
      //step 2: write data to the file. Get data and write it to the file
      for (int i = 1; i <= numFriends; i++)
      {
         //name of friends
         System.out.print("Enter the name of friend number " + i + ": ");
         friendName = input.nextLine();
         
         //Write the name to the file
         outputFile.println(friendName);
      }
      
      //step 3: close the file
      outputFile.close();
      System.out.println("Data written to the file.");
      
      
      
            
   }
}
/*

1.	You need the import java.io.*; statement in the top section of your program.
2.	Because we have not yet learned how to respond to exceptions, any method that uses a PrintWriter object must have a throws IOException clause in its header.
3.	You create a PrintWriter object and pass the name of the file as a String to the constructor.
4.	You use the PrintWrite class's print and println methods to write data to the file.
5.	When finished writing to the file, you use the PrintWriter class's close method to close the file.

*/