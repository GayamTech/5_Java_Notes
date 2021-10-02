
import java.io.*; //For File class and FileNoFoundException
import java.util.*; //For Scanner and InputMismatchException
import java.text.DecimalFormat; //For the DecimalFormat class

public class SalesReport
{
   public static void main(String[] args)
   {
      String fileName = "SalesData.txt";
      int months = 0;
      double oneMonth, totalSales = 0.0, averageSales;
      
      DecimalFormat num = new DecimalFormat("#,###.00");
      
      try
      {
         //open the file
         File file = new File(fileName);
         Scanner inputFile = new Scanner(file);//can throw FileNotFoundException
         
         while(inputFile.hasNext())
         {
            //Get a month's sales amount
            oneMonth = inputFile.nextDouble(); //can throw InputMismatchexception
            
            totalSales += oneMonth;
            months++;
         }
         
         //close the file
         inputFile.close();
         
         //average
         averageSales = totalSales/months;
         
         System.out.println("Number of monthss: " + months
                           +"\nTotal Sales: $" + num.format(totalSales)
                           +"\nAverage Sales: $" + num.format(averageSales));
      }
      catch(FileNotFoundException e)
      {
         System.out.println("The file " + fileName + " does not exist.");
      }
      catch(InputMismatchException e)
      {
         System.out.println("Non-numeric data found in the file.");
      }
   }
}
/************
When an exception is thorwn by code in the try block, the JVM begins
searching the try statement for a catch clause that can handle it. 
It searches the catch clauses from top to bottom and passes control
of the program to the first catch clause with a parameter that is
compatible with the exception.
**************/