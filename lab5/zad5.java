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
import java.lang.String;
import java.io.FileNotFoundException;
import java.lang.StringIndexOutOfBoundsException;
/*
optymalizacja kodu pod wzgledem wczytywania, zeby dzialalo podobnie
popraw javanio func
https://www.tutorialspoint.com/java_nio/java_nio_file.htm
*/
public class zad5
{
 public static void main(String []args) 
   {
			
			/*File myObj = new File("filename.txt"); // Specify the filename
				if (myObj.createNewFile()) {
		      System.out.println("File created: " + myObj.getName());
		    } else {
		      System.out.println("File already exists.");
		    } */
			try
			{

					Scanner scan= new Scanner(System.in);
					System.out.println("Input filename:");
					String str=scan.nextLine();
					//giving input filename


					File myObj = new File("name_of_file.txt"); // Specify the filename
					myObj.createNewFile();
					FileWriter myWriter = new FileWriter("name_of_file.txt");
					PrintWriter writer = new PrintWriter(myObj);
				  writer.print("");
					myWriter.write(str);
				  myWriter.close();
					//creating and writing file
		
					String str_data="";
					BufferedReader br = null;
					FileReader fr = null;
					fr = new FileReader(str);
					br = new BufferedReader(fr);
					String sCurrentLine;
					
					while ((sCurrentLine = br.readLine()) != null) 
					{
						str_data+=sCurrentLine;
					}

					//reading file to str_data
					//System.out.println(str_data);
					//czytanie z pliku 
					Random r = new Random();
					int str_len=str_data.length(),randomv;
					//System.out.println(str_len);
					str_len=0;
					System.out.println("Press Enter to continue");
					while(true)
					{
					scan.next();
					
					randomv=r.nextInt(5);
				
					for(int i=0;i<randomv;i++)
					{
						System.out.print((char)str_data.charAt(str_len));
						if(str_len==str_data.length())
						{
							break;
						}
						str_len++;
					}
					if(str_len==str_data.length())
					{
						break;
					}

					
					}
					//print text 
					

			}
			catch(FileNotFoundException s)
			{System.out.println("File not exists");
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
			catch(StringIndexOutOfBoundsException a1)
			{
		  	System.out.println("Out of index");
			}
			
			
			
		}



}

