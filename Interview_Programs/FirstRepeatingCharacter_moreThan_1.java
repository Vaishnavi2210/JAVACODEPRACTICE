package Interview_Programs;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter_moreThan_1 {
    public static void main(String[] args) {

        System.out.println("First Repeating Character :" + firstRepeatingChar("swiss"));
    }
        public static Character firstRepeatingChar(String s){
            // optional
//            if(s == null ||  s.isEmpty()){
//                return null;
//            }
            Set<Character> set = new HashSet<>();

            // enhance for-loop
            for (char ch : s.toCharArray()) {
                if (set.contains(ch)) {
                   return  ch;
                }
                set.add(ch);
            }
            return null;

        }



}
