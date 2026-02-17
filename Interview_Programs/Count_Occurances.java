package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurances {
    public static void main(String[] args) {

        String s = "ABACDAB";

        Map<Character, Integer>  occurance = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(occurance.containsKey(ch)) {
                occurance.put(ch, occurance.get(ch) + 1);
            } else {
                occurance.put(ch, 1);
            }
        }

        System.out.println(occurance);
    }
}
