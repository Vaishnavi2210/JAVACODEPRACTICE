package Interview_Programs;

import java.util.Scanner;

public class Specified_Character_Count {
    public static void main(String[] args) {

        String str = "Hello World";
        char target = 'l';
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        System.out.println("l occurs " + count + " times.");


        // using for enhanced loop
        for(char n : str.toCharArray()){
            if(n == target){
                count++;
            }
        }
        System.out.println("l occurs " + count + " times.");


    }

}
