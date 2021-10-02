import java.io.*;
import java.util.*;


public class Excercise_2 
{
   public static void main(String []args)
   {
   int studentAge;
   String studentName;
   Scanner keyboard = new Scanner(System.in);
   
   int successAge = 1; //added
   int successName = 1; //added
   
      while(successAge<=3)//added
      {
         try//how do you make it only run 3 times before it says you are out of chances
         {
         System.out.print("Enter age:\n");
         //studentAge = keyboard.nextInt();
         studentAge = Integer.parseInt(keyboard.nextLine()); //added Wrapper class 11/17/2016

            if(studentAge < 1)
               throw new InputMismatchException();
            else   
            {
            System.out.println("Student age is "+studentAge);
            break;//added 11/16/2016
            }
                                
         }
         catch(NumberFormatException e)//added 11/17. You can also use Exception if you don't have this catch
         {
            System.out.println("Error: invalid input.");
         }
         catch(InputMismatchException e)
         {
         System.out.println("Enter an age "
         +"greater than 1");
         }
         catch(Exception e )
         {
         System.out.println("error" + e.getMessage());
         }
         successAge++; //added
      }
      if(successAge > 3) //added
      {
         System.out.println("You are out of chance for entering an age.");
      }  
      
      keyboard.nextLine();
      
      while(successName <= 3) //added
      {
         try{
            System.out.print("\n\nEnter name \n");
            studentName = keyboard.nextLine();//how do you make it accept letters only right now the name 2 is still accepted
            if(studentName.equals(""))
               throw new NullPointerException();
            else
            {
               System.out.println("Student name "+studentName);
               break; //added 11/16/2016
            }     
         }
         catch(NullPointerException e)
         {
         System.out.println("Your entered nothing ");
         }
         catch(Exception e )
         {
         System.out.println("error" + e.getMessage());
         }
         successName++; //added
      }
      if(successName > 3)//added
      {
         System.out.println("You are out of chance for entering a name.");
      }
   }
}    