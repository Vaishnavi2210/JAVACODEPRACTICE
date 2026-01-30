package _13_arrays.EASY_LEVEL1;

public class Find_Sum_of_All_Elements {
    public static void main(String[] args){

        int[] arr = {1, 3, 5, 2, 4, 6, 7, 8};
        int sum = 0;
        for(int n : arr){
            sum += n;
        }

        System.out.println("Sum of array elements :" + sum);

    }
}
