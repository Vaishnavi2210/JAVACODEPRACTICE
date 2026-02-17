package _1_coreJava._17_collection_Framework.Map_interface.HashMap;

import java.util.HashMap;

public class Occurance_of_Each_Word {

    public static void main(String[] args) {
        String str = "hello good morning hello";

        HashMap<String, Integer>  map = new HashMap<>();

        for (String string : str.split(" ")){
            if(map.containsKey(string)){
                map.put(string, map.get(string) + 1);
            }
            else {
                map.put(string, 1);
            }
        }
        System.out.println(map);
    }
}
