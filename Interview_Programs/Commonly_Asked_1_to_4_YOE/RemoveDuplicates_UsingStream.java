package Interview_Programs.Commonly_Asked_1_to_4_YOE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates_UsingStream {
    //2️⃣ Remove Duplicates from Array / List Question:
    // Remove duplicates from array and return unique values.
    // Concept tested: HashSet, Java 8 Streams, Time complexity

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};

        //Using HashSet
        Set<Integer> set = new HashSet<>();

        for (int n : arr){
            set.add(n);
        }
        System.out.println(set);

        // Java8 Stream                             // Time Complexity → O(n)
        List<Integer> list = new ArrayList<>();
        List<Integer> unique = list.stream()
                                   .distinct()
                                   .collect(Collectors.toList());

    }
}
