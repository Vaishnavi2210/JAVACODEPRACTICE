package _13_arrays.MEDIUM_LEVEL2;

public class Sort_A_Binary_Array_0sFirst_1sLater {

    public static void main(String[] args){

        int[] arr = {1, 0, 0, 1, 1, 0, 0, 1 };
        int left = 0, right = arr.length-1;
        while(left < right){
            if(arr[left] == 0){
                left++;
            }
            else if(arr[right] == 1){
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        for(int n : arr){
            System.out.print(n);
        }
    }
}

/*
      Time Complexity: O(n) (single pass)

      Space Complexity: O(1) (in-place, no extra memory)
 */
