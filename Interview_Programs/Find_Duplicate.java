package Interview_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 5, 7, 7, 8};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates  = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Unique No: "+ set);
        System.out.println("Duplicates No: " +duplicates);
    }
}