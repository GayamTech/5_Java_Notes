import java.io.*; // for File class and FileNotFoundException
import java.util.Scanner; //for Scanner class

public class OpenFile
{
   public static void main(String[] args)
   {
      File file;
      Scanner input = new Scanner(System.in);
      Scanner inputFile;
      String fileName;
      
      System.out.print("Ente the name of the file: ");
      fileName = input.nextLine();
      
      //open the file
      try
      {
         file = new File(fileName);
         
         /*
         if (!file.exists()) 
         { 
            throw new FileNotFoundException(); 
         } 
         */

         inputFile = new Scanner(file);//Scanner class constructor can throw exception object
         System.out.println("The file was found");
         
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File NOT found");
      }
      System.out.println("Done");
      
   }  
} 