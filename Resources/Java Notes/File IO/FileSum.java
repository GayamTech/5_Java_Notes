import java.util.Scanner;
import java.io.*;

public class FileSum
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      double sum = 0.0;      
      String fileName;
      
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
      
      //Open the file for reading
      File myFile = new File(fileName);
      Scanner inputFile = new Scanner(myFile);
      
      //Read all of the values from the file
      //and calculate their total
      while(inputFile.hasNext())
      {
         //Read a value from the file
         double number = inputFile.nextDouble();
         
         //Add the number to sum
         sum = sum + number;
      }
      //close the file
      inputFile.close();
      
      //Display the sum of the numbers
      System.out.println("The sum of the numbers in Numbers.txt is " + sum);
   }
}