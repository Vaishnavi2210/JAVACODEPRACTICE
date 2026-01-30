package _13_arrays.MEDIUM_LEVEL2;

public class Move_All_0s_to_end {
    public static void main(String[] args){
     int[] arr = {1, 0, 0, 1, 0, 1, 0, 0, 0};

        int left = 0, right = arr.length - 1;
        while(left < right) {

            if (arr[left] == 1) {
                left++;
            }
            else if(arr[right] == 0){
                right--;
            }
            else{
                // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        for(int n: arr){
            System.out.print(n + " ");
        }


    }


}

