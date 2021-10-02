import java.util.Scanner;
import java.io.*;

public class FileReadDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      
      //Get the file name
      System.out.print("Enter the file name: ");
      String fileName = input.nextLine();
      
      //open the file
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
      
      //read lines from the file until no more are left
      while(inputFile.hasNext())
      {
         //Read the next name
         String line = inputFile.nextLine();
         
         //display the last name read
         System.out.println(line);
       }
       //close the file
       inputFile.close();
      }
}
         