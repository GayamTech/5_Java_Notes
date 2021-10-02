import java.util.Scanner;
import java.io.*;

public class FileWriteDemo2
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
      System.out.print("Enter the filename: ");
      fileName = input.nextLine();
      
      //Make sure the file does not exist***************
      File file = new File(fileName);
      if(file.exists())
      {
         System.out.println("The file " + fileName + " already exists.");
         System.exit(0);
      }
      //*******************
      
      //Open the file
      PrintWriter outputFile = new PrintWriter(fileName);
      
      //Get data and write it to the file
      for (int i = 1; i <= numFriends; i++)
      {
         //name of friends
         System.out.print("Enter the name of friend number " + i + ": ");
         friendName = input.nextLine();
         
         //Write the name to the file
         outputFile.println(friendName);
      }
      
      //close the file
      outputFile.close();
      System.out.println("Data written to the file.");
         
   }
}
/************
1. The previous example shows you how to make sure that a file exists
before trying to open it for input.
2. But, when  you are opening a file for output, sometimes you want to 
make sure the file does NOT exist.
3. When you use a PrintWriter object to open a file, the file will be 
erased if it already exists.
4. If you do not want to erase the existing file,  you have to check for
its existence before creating the PrintWriter object.
**************/