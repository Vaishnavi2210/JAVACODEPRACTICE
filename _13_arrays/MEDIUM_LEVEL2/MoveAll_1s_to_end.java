package _13_arrays.MEDIUM_LEVEL2;

public class MoveAll_1s_to_end {
    public static void main(String[] args){

        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1, 0 ,1};

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
        System.out.println();

System.out.println(" Using two pointers ");

        // Without Swapping

        int count = 0;
        for(int j = 0; j < arr.length; j++){
           if( arr[j] == 0)
            count++;
        }

        for(int i = 0; i < count; i++){
            arr[i] = 0;
        }

        for(int i  = count; i < arr.length; i++){
            arr[i] =  1;
        }

        for(int x : arr){
            System.out.print(x);
        }
    }
}
