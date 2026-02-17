package Interview_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Find_Misiing_Number_using_Stream {
////  find all missing number from griven arrey using streram
//           int arr[]={1,2,1,2,5,8};
    public static void main(String[] args) {

        int[] arr = {1,2,1,2,5,8};

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        List<Integer> missing = IntStream.rangeClosed(1,8)
                .filter(i -> !set.contains(i))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(missing);


        /*

        // for any missing no.
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        Set<Integer> present = Arrays.stream(arr)
                                     .boxed()
                                     .collect(Collectors.toSet());

        List<Integer> missing = IntStream.rangeClosed(min, max)
                .filter(n -> !present.contains(n))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Missing numbers : "+ missing);
        */
    }
}
