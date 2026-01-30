package _13_arrays.MEDIUM_LEVEL2;

public class SecondMax_Elements {

    public static void main(String[] args){

        int[] arr = {1, 2, 4, 7, 98, 100, 99};

        int secondMax = Integer.MIN_VALUE;
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }

            if( arr[i] > secondMax  && arr[i] < max){
                secondMax = arr[i];
            }
        }

        System.out.println("Max of Array :"+ max);
        System.out.println("SecondMax of Array :"+ secondMax);


    }





}
