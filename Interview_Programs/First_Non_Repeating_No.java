package Interview_Programs;

import java.util.HashSet;

public class First_Non_Repeating_No {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 8, 2, 1};

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("First Non-Repeating No :" + arr[i]);
                break;
            }


        }
    }
}