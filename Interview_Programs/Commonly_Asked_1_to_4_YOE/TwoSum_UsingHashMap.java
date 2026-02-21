package Interview_Programs.Commonly_Asked_1_to_4_YOE;

import java.util.*;

public class TwoSum_UsingHashMap {
    // Brute force → O(n²)
    //HashMap → O(n)
    //Space complexity → O(n)

        public static  List<List<Integer>> TwoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int n : arr) {
            int complement = target - n;
            if (map.containsKey(complement)) {
                result.add(Arrays.asList(n, complement));
            }
            map.put(n, 1);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 7, 8};   // add of two number is 9 find pair
        int target = 9;

        System.out.println(TwoSum(arr, target));
    }
}

