import java.util.Scanner;


class scratch {

    public static void main(String[] args) {

        while(true) {
            int[] arr_A;
            int[] arr_B;
            arr_A = read_vector();
            arr_B = read_vector();
            int size_a = arr_A[0], size_b = arr_B[0];////the first element of vector is the length of vector
        if(size_a[0]==size_b[0]) {
            if(size_a[0]==0) {
                System.out.print("vector are ampty")
            }
            break;
        }
        }// Input vector with the same siz
        



    }

    public static int[] read_vector() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input Vector");
        int[] integers;
        while(true){
            String userName = myObj.nextLine();  // Read user input
            String[] integerStrings = userName.split(" ");
            integers = new int[integerStrings.length];
            integers[0]=integers.length;//saving on the first element of vector the length of vector
            try {
                for (int i = 1; i < integers.length+1; i++) {
                    integers[i] = Integer.parseInt(integerStrings[i]);
                }
            }
            catch(java.lang.NumberFormatException a)
            {
                continue;
            }
            break;

        }

        return integers;
}
}