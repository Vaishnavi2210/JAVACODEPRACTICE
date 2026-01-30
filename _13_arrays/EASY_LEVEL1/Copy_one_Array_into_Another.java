package _13_arrays.EASY_LEVEL1;

import java.util.Arrays;

public class Copy_one_Array_into_Another {

    public static void main(String[] args){
        int[] arr = {1, 3, 2, 5, 4, 7, 3};

        int[] arr1 = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        // using clone() method
         int[] arr2 = arr.clone();
         System.out.println(Arrays.toString(arr2));

    }
}
