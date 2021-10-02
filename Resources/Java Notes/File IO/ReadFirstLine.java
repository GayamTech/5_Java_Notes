//Veronica

import java.util.Scanner;
import java.io.*;

public class ReadFirstLine
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the name of a file: ");
		String fileName = keyboard.nextLine();
		
		//open file and create a connection
		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);
		
		//read the first line from the file
		String line =inputFile.nextLine();
		
		//display
		System.out.println(line);
		
		//close
		inputFile.close();
		
		
	}
}