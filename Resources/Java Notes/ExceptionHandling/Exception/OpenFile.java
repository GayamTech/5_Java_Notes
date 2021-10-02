

import java.io.*;
import java.util.Scanner;

public class OpenFile
{
   public static void main(String[] args)
   {
      File file;
      Scanner keyboard = new Scanner(System.in);
      Scanner inputFile;
      String fileName;
   
      System.out.print("Enter the file name: ");
      fileName = keyboard.nextLine();
   
      //open file
      try
      {
         file = new File(fileName);
      
      /*
         if(!file.exists())
         {
            throw new FileNotFoundException();
         }
      */
         inputFile = new Scanner(file); //Scanner class constructor can throw exception object
         System.out.println("The file was found");
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      System.out.println("Done");
    }
}