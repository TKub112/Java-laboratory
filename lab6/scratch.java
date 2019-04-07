import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


class scratch {

    public static void main(String[] args) {
        int[] arr_A;
        int[] arr_B;

        while(true) {

            arr_A = read_vector();
            arr_B = read_vector();
            int size_a = arr_A[0], size_b = arr_B[0];////the first element of vector is the length of vector
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
        }// Input vector with the same siz



        int[] sum_vec;
        sum_vec = new int[arr_A[0]+1];
        sum_vec[0]=arr_A[0];////the first element of vector is the length of vector
        for(int i=1;i<arr_A[0]+1;i++)
        {
            sum_vec[i]=arr_A[i]+arr_B[i];
        }
        for(int i=0;i<arr_A[0]+1;i++)
        {
            System.out.println( );
        }

        //write_vector_tofile(sum_vec);



    }

    public static int[] read_vector() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input Vector");
        int[] integers;
        while(true){
            //String userName = myObj.nextLine();  // Read user input
            //String[] integerStrings = userName.split(" ");


            /*for (int i = 0; i < userName.length; i++) {
                if(!(isDigit(userName.charAt(i))==userName.charAt(i)==' '))
                {
                    continue;
                }
            }*/

            integers = new int[500];
            /*integers[0]=integerStrings.length-1;//saving on the first element of vector the length of vector
            System.out.print(integers[0]);
            try {
                for (int i = 1; i < integers.length+1; i++) {
                    integers[i] = Integer.parseInt(integerStrings[i]);
                    System.out.println(i+"i");
                    System.out.print(integers[i]+"value");
                }
            }
            catch(java.lang.NumberFormatException a)
            {
                continue;
            }*/
            int i=1;
            System.out.println("enter a number");
            while(myObj.hasNext()) {
                if (myObj.hasNextInt()) {
                    integers[i]=myObj.nextInt();
                    i++;
                }


                break;

            }
            int d=0;
            integers[0]=i;//length of vector




            break;


        }

        return integers;
}



    public static void write_vector_tofile(int[] data) {



        try {
            FileOutputStream file = new FileOutputStream("pic.dat");
            for (int i = 0; i < data[0]; i++)
                file.write(data[i]);
            file.close();
        } catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }
    }


}