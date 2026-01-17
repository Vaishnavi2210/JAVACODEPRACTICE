package _12_arrays;

public class Found_Specific_No {
    // Write a Java program to test if an array contains a specific value
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;

        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] == target){
                System.out.println(arr[i]);

            }
        }


        // Using enhance loop
        boolean found = false;
        for(int n : arr){
            if(n == target){
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Array contains the value : " + target);
        } else{
            System.out.println("Array does not contain the value : " + target);

        }




        // -- Using stream
       //  boolean found = Arrays.stream(arr).anyMatch(n -> n == target);

        //  System.out.println(found ? "Array Contains "+ target :  "Array not contain" + target);
    }
}
