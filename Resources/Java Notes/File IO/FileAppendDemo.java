import java.util.Scanner;
import java.io.*;

public class FileAppendDemo
{
   public static void main(String[] args) throws IOException
   {
      //create a FileWriter object and open the existing file for writing
      //any data written to the file will be appended to the 
      //file's existing contents.
      //The FileWriter class also throws an IOExcpetion if the 
      //file cannot be opened for any reason
      FileWriter fWriter = new FileWriter("C:\\Users\\Room 203A\\Desktop\\myFriends.txt", true);    
      //FileWriter fWriter = new FileWriter("C:\\Users\\Administrator\\Desktop\\friends.txt", true);   
      //Open the file
      PrintWriter outputFile = new PrintWriter(fWriter);
      
      outputFile.println("Bill");
      outputFile.println("Steven");
      outputFile.println("Sharon");
      //close the file
      outputFile.close();
            
      
      
            
   }
}