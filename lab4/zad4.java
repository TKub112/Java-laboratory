import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.io.File; 
import java.util.Random;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

/*
optymalizacja kodu pod wzgledem wczytywania, zeby dzialalo podobnie
popraw javanio func
https://www.tutorialspoint.com/java_nio/java_nio_file.htm
*/
public class zad4
{
	private static long time_io_read=0;
	private static long time_io_write=0;
	private static long time_nio_read=0;
	private static long time_nio_write=0;
 public static void main(String []args) 
   {
			
   	 	

			iofile();
			niofile();
			System.out.println("Save time in io:"+ zad4.time_io_write);
			System.out.println("Write time in io:"+ zad4.time_io_read);
			System.out.println("Save time in nio:"+ zad4.time_nio_write);
			System.out.println("Write time in nio:"+ zad4.time_nio_read);
			

   }
		public static void iofile()
		{
			try
			{
				BufferedReader br = null;
				FileReader fr = null;
				Random r = new Random();



				File myObj = new File("filename.txt");
				myObj.createNewFile();
				//creating file



				FileWriter myWriter = new FileWriter("filename.txt");
				PrintWriter writer = new PrintWriter(myObj);
				writer.print("");

				long startTime = System.nanoTime(); //time initation



				for (int i = 0; i < 1000; i++)myWriter.write((char)(r.nextInt(20)+65));
		    		myWriter.close();
				


				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				zad4.time_io_write=timeElapsed;
				System.out.println("Save time:"+ timeElapsed);
				//write to file





				startTime = System.nanoTime();


				fr = new FileReader("filename.txt");
				br = new BufferedReader(fr);
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
				}
				//read from file


				//zamykanie pliku????
		   	endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				zad4.time_io_read=timeElapsed;
				System.out.println("Read time:" + timeElapsed);
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
		  	System.out.println("You missed arguments");
			}
			catch(InputMismatchException b)
			{
		  	System.out.println("You didnt entered number");
			}
			catch (IOException e) 
			{
      System.out.println("An error occurred.");
      e.printStackTrace(); 
			}
				
		}
		
		public static void niofile()
		{
			try
			{
				BufferedReader br = null;
				FileReader fr = null;
				
				Random r = new Random();
				File myObj = new File("filename.txt"); // Specify the filename
				myObj.createNewFile();
				long startTime = System.nanoTime(); //time initation
				FileWriter myWriter = new FileWriter("filename.txt");

				PrintWriter writer = new PrintWriter(myObj);
				writer.print("");
				//creating file 

				for (int i = 0; i < 1000; i++)myWriter.write((char)(r.nextInt(20)+65));
		   		 myWriter.close();
				


				long endTime = System.nanoTime();
				long timeElapsed = endTime - startTime;
				zad4.time_io_write=timeElapsed;
				System.out.println("Save time:"+ timeElapsed);
				


				//write to file 
				startTime = System.nanoTime();


				fr = new FileReader("filename.txt");
				br = new BufferedReader(fr);
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
				}
				
				//read from file 
				//zamykanie pliku????
		   		endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				zad4.time_io_read=timeElapsed;
				System.out.println("Read time:" + timeElapsed);
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
		  	System.out.println("You missed arguments");
			}
			catch(InputMismatchException b)
			{
		  	System.out.println("You didnt entered number");
			}
			catch (IOException e) 
			{
      System.out.println("An error occurred.");
      e.printStackTrace(); 
			}
				
		}



}

