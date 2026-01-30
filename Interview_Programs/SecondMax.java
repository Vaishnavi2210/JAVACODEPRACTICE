package Interview_Programs;

public class SecondMax {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 98, 100, 99, 105, 40, 102};

        int secondMax = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            // Max_SecondMax
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }

        System.out.println("SecondMax : "+ secondMax);
        System.out.println("Max : " + max);

    }
}
