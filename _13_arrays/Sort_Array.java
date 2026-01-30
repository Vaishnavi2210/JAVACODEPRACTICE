package _13_arrays;

import java.util.Arrays;

public class Sort_Array {
    public static void main(String[] args) {
        // 1. Write a Java program to sort a numeric array and a string array.

        int[] arr = {1,3,5,8,2,4,6,9,7};

        System.out.println("Array before sorting"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting"+ Arrays.toString(arr));

        String[] names = {"Vaishnavi", "Jay", "Anushka", "Tejas", "Kunal"};

       System.out.println("Array before sorting"+ Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Array after sorting"+ Arrays.toString(names));




    }
}
