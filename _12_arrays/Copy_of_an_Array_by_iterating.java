package _12_arrays;

public class Copy_of_an_Array_by_iterating {
   //  Write a Java program to copy an array by iterating the array
   public static void main(String[] args){

       int[] arr = {1,3,5,8,2,4,6,9,7};

       // Create a new array of the same length
       int[] copyArr = new int[arr.length];

       // Copy elements one by one
       for(int i = 1; i < arr.length; i++){
          copyArr[i] = arr[i];
       }

       System.out.println("Original array:");
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }

       System.out.println("Copied array:");
       for (int i = 0; i < copyArr.length; i++) {
           System.out.print(copyArr[i] + " ");
       }

   }
}
