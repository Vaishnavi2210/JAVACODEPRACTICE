package _13_arrays.MEDIUM_LEVEL2;

public class First_Non_Repeating_Number {
           // Input: {2, 3, 4, 2, 3, 5}
           //Output: 4
    public static void main(String[] args) {

        int[] arr ={2, 3, 4, 2, 3, 5};

        for(int i = 0; i < arr.length; i++){
            boolean isUnique =true;

            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){  // If the same number is found at another index, then it is a duplicate.
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                System.out.print(arr[i] + " ");
                break;
            }
        }




           }
}
