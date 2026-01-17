package Interview_Programs;

public class Max_Of_Array {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 7, 8, 9};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

    }
}
