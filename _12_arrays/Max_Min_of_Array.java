package _12_arrays;

public class Max_Min_of_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Value" + max);
        System.out.println("Minimum Value" + min);
    }
}
