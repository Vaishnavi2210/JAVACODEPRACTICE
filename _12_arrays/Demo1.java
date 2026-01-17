package _12_arrays;

public class Demo1 {
    public static void main(String[] args) {


                // Declare and initialize an array of integers
                int[] numbers = {10, 20, 30, 40, 50};

                // Print the array elements
                System.out.println("Array elements:");
                for(int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);   // to access value we use array[] index.
                }



      /*  What is length vs length()?
         --> length is an instance variable which stores the size of an array which is created inside the array object
             Length() is method present in String class which returns the string length.
      */
    }
}
