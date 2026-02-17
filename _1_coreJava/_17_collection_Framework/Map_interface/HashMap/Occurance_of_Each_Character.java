package _1_coreJava._17_collection_Framework.Map_interface.HashMap;

import java.util.HashMap;

public class Occurance_of_Each_Character {

    public static void main(String[] args) {

        String str = "hello good morning";

        HashMap<Character, Integer>  map = new HashMap<>();

        for (Character ch : str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
