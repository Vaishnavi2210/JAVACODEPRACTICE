package _13_arrays.EASY_LEVEL1;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

      /*  for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
     */
        System.out.println();

        // Two Pointer method - reverse

        int left = 0, right = arr.length-1;

            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        System.out.println("Reverse Array is : " + Arrays.toString(arr));

    }
}

// O(n) - Time
// O(1) - space