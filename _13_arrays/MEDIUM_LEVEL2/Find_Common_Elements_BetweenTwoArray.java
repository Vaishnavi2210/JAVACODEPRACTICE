package _13_arrays.MEDIUM_LEVEL2;

public class Find_Common_Elements_BetweenTwoArray {
    public static void main(String[] args) {

        int[] arr1 = {3, 5, 2, 4, 6, 8, 1};
        int[] arr2 = {2, 9, 6, 7, 0, 4};

        System.out.print("Common Elements : ");
        for (int i = 0; i < arr1.length; i++) {
            boolean isCommon = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isCommon = true;
                    break;
                }
            }

            if (isCommon) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}