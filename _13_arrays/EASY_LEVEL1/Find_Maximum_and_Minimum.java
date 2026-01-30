package _13_arrays.EASY_LEVEL1;

import java.util.Arrays;

public class Find_Maximum_and_Minimum {
    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 1, 2, 7, 9, 11, 4, 0};

        int max = arr[0];
        int min = arr[0];

        for(int n : arr){
            if(n > max)
                max = n;
            if(n < min)
                min = n;
        }

        System.out.println("Maximum No : " + max );
        System.out.println("Minimum No : " + min );

        System.out.println("______________________________");

        Arrays.sort(arr);
        System.out.println("Maximum :" +  arr[arr.length - 1]);
        System.out.println("Minimum : " + (arr[0]));


    }
}


