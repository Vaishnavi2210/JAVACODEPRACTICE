package _13_arrays;

public class Sum_of_Array_Elements {
    public static void main(String[] args) {
    // Write a Java program to sum values of an array.
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add each element to sum
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
