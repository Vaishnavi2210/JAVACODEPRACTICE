package _13_arrays.MEDIUM_LEVEL2;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_from_Array {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 2, 9, 8, 1, 4, 1};
        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");

                    duplicate = true;
                    break;

                }
            }
            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Using HashSet
        int[] arr2 = {1, 3, 5, 2, 7, 2, 6, 1, 9};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int n : arr2){
            if(!set.add(n)) {
                duplicates.add(n);
            }
        }
        System.out.println("Duplicate Elements : " + duplicates);
        System.out.println("Unique Elements : " + set);

    }
}