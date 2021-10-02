import java.io.*; //For File class and FileNoFoundException
import java.util.*; //For Scanner and InputMismatchException
import java.text.DecimalFormat; //For the DecimalFormat class

public class SalesReport2
{
   public static void main(String[] args)
   {
      String fileName= null;
      int months = 0;
      Scanner inputFile;
      double oneMonth, totalSales = 0.0, averageSales;
      Scanner keyboard = new Scanner(System.in);            
      DecimalFormat num = new DecimalFormat("#,###.00");
      
      /*****
      
      //Open the file by calling the openFile method.
      Scanner inputFile = openFile(fileName); 
      
       //If the openFile method returning null, then
       //the files was not found. Get a new file name 
       while(inputFile == null)
         {
            System.out.print(fileName + " does not exist."
                           + "\nEnter another file name: ");
            fileName = input.nextLine();
            inputFile = openFile(fileName);
         }  
      ********/
      
      System.out.print("Enter a file name: ");
      fileName = keyboard.nextLine();

      try
      {
         File file = new File(fileName);
         inputFile  = new Scanner(file);
      }
      catch(FileNotFoundException e)
      {
         inputFile = null;
      }  
      
      while(inputFile == null)
      {
         System.out.print("The file " + fileName + " doesn't exist." 
                           + "\nEnter another file name: ");
         fileName = keyboard.nextLine();
         try
         {
            File file = new File(fileName);
            inputFile = new Scanner(file);
         }
         catch(FileNotFoundException e)
         {
            inputFile = null;
         }
         
      }
      
         while(inputFile.hasNext())
         {
            try
            {
               //Get a month's sales amount
               oneMonth = inputFile.nextDouble(); //can throw InputMismatchexception
            
               totalSales += oneMonth;
               months++;
            }
             catch(InputMismatchException e)
            {
                 System.out.println("Non-numeric data found in the file."
                           +"\nThe invalid record will be skipped.");
                   //Skip  past the invalid data
                   inputFile.nextLine();
            }
       
      }         
         //close the file
         inputFile.close();
         
         //average
         averageSales = totalSales/months;
         
         System.out.println("Number of monthss: " + months
                           +"\nTotal Sales: $" + num.format(totalSales)
                           +"\nAverage Sales: $" + num.format(averageSales));
      }
    /**********    
   //The openFile method opens the specified file
   //and returns a reference to a Scanner object.
   public static Scanner openFile(String fileName)
   {
         Scanner scan;
         
         //open the file
         try
         {
            File file = new File(fileName);
            scan = new Scanner(file);
         }
         catch(FileNotFoundException e)
         {
            scan = null;
         }
         return scan;
   }
   ***********/
}
