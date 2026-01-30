package _13_arrays;

public class Array_Index_Value {
    // 2. Write a Java program to find the index of an array element
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,2,4,6,9,7};

        int target = 8;  // element we want to find
        int index = -1;   // default if not found

        for(int i = 0;  i < arr.length; i++){
            if(arr[i] == target) {
                index = i;
                break;      // stop once we find the element
            }
        }

        if(index != -1){
            System.out.println("element " + target + " found at index "+ index);
        }
    }
}
