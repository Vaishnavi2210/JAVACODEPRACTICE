package _1_coreJava._17_collection_Framework._3_Set_Interface.LinkedHashSet_Class;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class First_Repeating_Character {
    // Using LinkedHashSet for our problems

    public static void main(String[] args) {
       String str = "Ramayan";

        Set<Character> seen = new HashSet<>();
        Set<Character> repeated = new LinkedHashSet<>(); // preserves insertion order

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                repeated.add(c);
            }
        }

        if (!repeated.isEmpty()) {
            System.out.println("First repeating char: " + repeated.iterator().next());
        }
 /*
          seen tracks all characters we saw
          repeated tracks characters that repeated in order
          iterator().next() → first repeated character
  */
    }
}