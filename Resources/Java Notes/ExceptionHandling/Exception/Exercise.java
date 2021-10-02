import java.util.*; 
public class Exercise 
{ 
   public static void main(String[] args) 
   { 
      int studentAge = 0; 
      String studentName;
      Scanner keyboard = new Scanner(System.in); 
      boolean success = true;
      
      while(success == true)
      {
      try 
      { 
         System.out.print("Student Age: "); 
         studentAge = keyboard.nextInt(); 
         if( studentAge < 0 ) 
            //throw new Exception("Positive Number Required"); 
            throw new InputMismatchException();
         System.out.println("Student Age: " + studentAge); 
         
         keyboard.nextLine();
         
         System.out.print("Enter your name: ");
         studentName = keyboard.nextLine();
         if(studentName.equals(""))
            throw new NullPointerException();
         System.out.println("Student name: " + studentName);
          success = false;     
        } 
       catch(InputMismatchException exc) 
       { 
         System.out.println("The operation could not be carried because " 
                           + "the number you typed is not valid"); 
         keyboard.nextLine();
       }
       catch(NullPointerException e)
       {
         System.out.println("You entered nothing for name.");
       } 
       /* 
       catch(Exception exc) 
       { 
         System.out.println("Error: " + exc.getMessage()); 
       } 
       */
       }
    } 
  }
  
  //http://www.java-forums.org/new-java/39831-try-catch-while-loop-doesnt-work.html
