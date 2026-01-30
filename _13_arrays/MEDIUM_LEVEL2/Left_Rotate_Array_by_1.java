package _13_arrays.MEDIUM_LEVEL2;

public class Left_Rotate_Array_by_1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int first= arr[0];

        for(int i =0; i < arr.length-1; i++){
           arr[i] = arr[i + 1];
        }

        arr[arr.length-1] = first;

        for(int n : arr){
            System.out.print(n + " ");
        }
    }
}
