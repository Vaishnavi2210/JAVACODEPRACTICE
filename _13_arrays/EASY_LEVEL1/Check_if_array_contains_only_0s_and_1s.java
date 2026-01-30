package _13_arrays.EASY_LEVEL1;

public class Check_if_array_contains_only_0s_and_1s {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 0, 6, 1, 0, 5, 1, 0, 1, 0};

        int[] arr1 = {1, 0, 0, 1, 0, 0, 0, 1};
        boolean check = true;

        for (int n : arr1) {
            if (n != 0 && n != 1) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Contains only 0's and 1's " : "Does not Contains only 0's and 1's ");

}

}

