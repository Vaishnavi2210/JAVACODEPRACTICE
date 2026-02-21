package Interview_Programs;

import java.util.*;

public class CombinationSumSimple {
    public static void main(String[] args) {

        int[] nums = {2, 4, 3, 3, 5, 7};
        int target = 6;

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    List<Integer> pair = Arrays.asList(nums[i], nums[j]);
                    Collections.sort(pair);  // avoid duplicates like [4,2]
                    result.add(pair);
                }
            }
        }
        System.out.println(result);

    }
}
