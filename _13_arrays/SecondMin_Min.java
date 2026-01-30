package _13_arrays;

public class SecondMin_Min {
    public static void main(String[] args){
        int[] arr = {2, 4, 3, 7, 9, 5, 99, 80, 1};

        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;

        for(int n : arr){
            if(n < min){
                secondMin = min;
                min = n;
            }

            if(n < secondMin && n > min){
                secondMin = n;
            }
        }
        System.out.println("Min :" + min);
        System.out.println("secondMin : " + secondMin);






    }

}
