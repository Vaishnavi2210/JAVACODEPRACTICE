package _12_arrays;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40 ,50};

        // 1. Reverse Array (without modifying existing array)
        for (int i = arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // 2: Reverse In-Place (modify the array)
        for(int i = 0; i < arr.length-i-1; i++){
            int temp = arr[i];
            arr[arr.length-i-1] = arr[i+1];
            arr[i+1] = temp;
        }


        System.out.println("Reverse Array by copying array");


    }
}