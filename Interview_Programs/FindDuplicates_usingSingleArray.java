package Interview_Programs;

import java.util.Arrays;

public class FindDuplicates_usingSingleArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 4, 5, 7, 7, 8};
        Arrays.sort(arr);

        for (int i = 0; i< arr.length-1; i++){
            if(arr[i] == arr[i+1])
            System.out.println(arr[i]);
        }
    }
}
