package Interview_Programs;

import java.util.HashSet;

public class First_Repeating_Character {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1, 4, 5, 6, 7, 2};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i ; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First Repeated No : " + arr[i]);
                    return;
                }

            }
        }

        // HashSet
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                System.out.println("First Repeating No : " + num);
                break;
            }
            set.add(num);
        }
    }

}