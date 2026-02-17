package _1_coreJava._17_collection_Framework._3_Set_Interface.LinkedHashSet_Class;

import java.util.LinkedHashSet;
import java.util.Set;

public class checkAllUnique {
    public static void main(String[] args) {

        String str = "Ram";

        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                System.out.println("Duplicates found");
                return;
            }
        }
        System.out.println("All unique");
        /*
              If add() returns false → character already exists
              Else → continue
              Works same as HashSet, but insertion order preserved
         */
    }
}