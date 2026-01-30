package _13_arrays.EASY_LEVEL1;

public class Count_Numbers_0s_and_1s {
    public static void main(String[] args){

        int[] arr = {1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0};

        int zeros = 0, ones = 0;
        int count = 0;
        for(int n : arr){
            if(n == 0)
                zeros++;
            else{
                ones++;
            }
        }

        System.out.println("0's " + zeros);
        System.out.println("1's " + ones);

    }
}
