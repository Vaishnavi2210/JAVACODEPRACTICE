package _13_arrays;

public class Demo2 {
    public static void main(String[] args) {

        // Create an array of size 5
        int[] arr = new int[5];

      //  int[] arr2 = new int[-5];   // NegativeArraySizeException

        // Assign values to the array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // arr[5] = 6;  -- // ArrayIndexOutOfBoundsException

        System.out.println("Array elements : ");
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");   // print elements
        }
    }

}
