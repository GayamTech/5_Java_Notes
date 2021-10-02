//unchecked exception
import java.util.Scanner;

class uncheckedExe1
{
   public static void main(String[] args)
   {
      int num1, num2, res;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter number 1: ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter number 2: ");
      num2 = keyboard.nextInt();
      
      res = num1 / num2;
      
      //divide by zero. Throw ArithmeticException
      
      System.out.println("The result is " + res);
   }
}