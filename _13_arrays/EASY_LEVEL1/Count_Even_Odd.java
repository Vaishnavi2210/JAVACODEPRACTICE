package _13_arrays.EASY_LEVEL1;

public class Count_Even_Odd {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 32, 19, 28, 22, 3, 2};

        int even=0, odd = 0;

        for(int n : arr){
            if(n % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even No. "+ even);
        System.out.println("Odd No. "+ odd);

    }
}
