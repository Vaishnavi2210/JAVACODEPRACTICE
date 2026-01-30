package _13_arrays.EASY_LEVEL1;

public class   Check_array_Sorted {

    public static void main(String[] args){

        int[] arr = {1, 3, 2, 5, 4, 7, 6, 8};
        boolean sorted = true;

        for(int i = 0; i< arr.length - 1; i++){

                if(arr[i] > arr[i+1]){
                    sorted = false;
                    break;

            }
        }
        System.out.println(sorted ? "Sorted " : "Not Sorted");

    }
}
