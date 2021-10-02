
import java.util.Scanner;

public class NumberFormatExceptionExe
{
   public static void main(String[] args) throws NumberFormatException 
   { 
      char a; 
      int b; 
      Scanner keyboard = new Scanner(System.in); 
      
      System.out.println("Enter value b: "); 
      b = Integer.parseInt(keyboard.nextLine()); 
      
      System.out.println("Enter char: "); 
      a = keyboard.nextLine().charAt(0); 
      System.out.println("This is "+a); 
    }
}
