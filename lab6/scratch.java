import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;



class WektoryRoznejDlugosciException extends Exception {
    int a;
    int b;

    public WektoryRoznejDlugosciException(int x,int z) {
        a = x;
        b = z;
    }

    public String toString() {
        return   "Dlugosc wektora A" + (a-1) +  "Dlugosc wektora B: " + (b-1) ;
    }

}



class scratch {

    static void compute(int a,int b) throws WektoryRoznejDlugosciException {
        if (a != b)
            throw new WektoryRoznejDlugosciException(a,b);

    }//own exception class



    public static void main(String[] args) {
        int[] arr_A;
        int[] arr_B;

        while(true) {

            arr_A = read_vector();
            arr_B = read_vector();
            int size_a = arr_A[0], size_b = arr_B[0];////the first element of vector is the length of vector

            try {
                compute(size_a ,size_b);

            }
            catch(WektoryRoznejDlugosciException ex1) {
                System.out.print("WektoryRoznejDlugosciException \n Dlugosc wektora A: " + (size_a-1) + "Dlugosc wektora b:"+(size_b-1));
                System.exit(0);
            }
            //WektoryRoznejDlugosciException


            if(size_a==size_b) {
                if(size_a==0) {
                System.out.print("vector are ampty");
                }
                break;
             }
            else
            {
                continue;
            }
        }// Input vector with the same size



        int[] sum_vec;
        sum_vec = new int[arr_A[0] +1];
        sum_vec[0]=arr_A[0];////the first element of vector is the length of vector
        for(int i=1;i<arr_A[0]+1;i++) {
            sum_vec[i] = arr_A[i] + arr_B[i];
        }


        write_vector_tofile(sum_vec);



    }

    public static int[] read_vector() {
        Scanner myObj = new Scanner(System.in);
        // Create a Scanner object

        System.out.println("Input Vector");
        int[] integers;

        String userName = myObj.nextLine();
        // Read user input
        Scanner scan = new Scanner(userName);
        integers = new int[500];
        int i=1;

        while(scan.hasNextInt()) {
            if (scan.hasNextInt()) {
                integers[i]=scan.nextInt();//1a isnt an int

                i++;
            }
        }
        int d=0;
        integers[0]=i;//length of vector


        return integers;
}

    public static void write_vector_tofile(int[] data) {
        File myObj = new File("text1.txt");
        try {

            myObj.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //creating new file


        try {

            FileWriter myWriter = new FileWriter("text1.txt");
            PrintWriter writer = new PrintWriter(myObj);
            writer.print("");
            for (int i = 1; i < data[0]; i++)
            {

                char c=(char)(data[i] + '0');//convert to ascii
                myWriter.write(c);
                myWriter.write(' ');
            }

            //writing to file
            myWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}