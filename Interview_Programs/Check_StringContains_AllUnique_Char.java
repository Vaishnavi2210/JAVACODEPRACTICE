package Interview_Programs;

import java.util.HashSet;
import java.util.Set;

public class Check_StringContains_AllUnique_Char {
    //Check if the string contains all unique characters (no duplicates).

    public static void main(String[] args) {

        System.out.println("UniqueCheck :" + uniqueCheck("ABCD"));
    }

    public static boolean uniqueCheck(String str) {

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return false;    // unique nhi hai
            }
            set.add(ch);

        }
        return true;
    }
}
