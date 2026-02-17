package _1_coreJava._17_collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_UtilityClass {
     // Collections is a utility class in java.util package which provides static methods
     // to operate on Collection objects, like sorting, searching, reversing.
    // its helper static methods : sort(), reverse(), min(), max(), shuffle(), BinarySearch()

    // Collection → data store karta hai
    //Collections → data pe operations karta hai
        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(30);
            list.add(10);
            list.add(20);

            Collections.sort(list); // sorting
            System.out.println(list);  // // [10, 20, 30]

            Collections.reverse(list); // reversing
            System.out.println(list);  // [30, 20, 10]
            System.out.println(Collections.binarySearch(list,20));   // works only on sorted Array
            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));
            Collections.shuffle(list);

        }
    }


// What happens if binarySearch is applied on unsorted list?
//✅ Result is undefined (wrong index)(its works only on sorted array)