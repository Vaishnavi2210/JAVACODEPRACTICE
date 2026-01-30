package _13_arrays;

public class SecondMax_and_Max {
    public static void main(String[] args) {

        int[] arr = {99, 120, 200, 76, 46, 86, 99};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int temp : arr) {
            if (temp > max) {
                secondMax = max;
                max = temp;


                if (temp > secondMax && temp < max) {
                    secondMax = temp;
                }
            }
        }
        System.out.println("SecondMax : " + secondMax);
        System.out.println("Max : " + max);
    }
}