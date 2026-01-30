package _13_arrays.MEDIUM_LEVEL2;

public class Right_Rotate_Array_by_1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};

        int last = arr[arr.length-1];   // store last element

        for (int i = arr.length -1; i > 0; i--) {

            arr[i] = arr[i - 1];   // shift right
        }

            arr[0] = last;  // place last at first

        for(int n : arr){
            System.out.print(n + " ");
        }
    }

}

