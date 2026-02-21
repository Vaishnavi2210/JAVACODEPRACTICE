package Interview_Programs.Commonly_Asked_1_to_4_YOE;

import java.util.*;

public class TwoSum_PairSum {
    // Given an array, find all pairs whose sum = target Variants:
    // return only one pair return all unique pairs with duplicates
    //  without duplicates optimized using HashSet / HashMap

    // int[] n = {1, 2, 3, 3, 4, 5, 6};          find pair whose sum = 9

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        int target = 9;

        Set<List<Integer>> result = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    List<Integer> pair = Arrays.asList(arr[i], arr[j]);
                    Collections.sort(pair);
                    result.add(pair);
                }
            }
        }
        System.out.println(result);
    }
}
