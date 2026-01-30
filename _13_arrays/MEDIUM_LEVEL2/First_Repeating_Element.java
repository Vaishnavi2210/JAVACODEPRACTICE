package _13_arrays.MEDIUM_LEVEL2;

public class First_Repeating_Element {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 1, 3, 8};

        for(int i= 0; i < arr.length; i++){

            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}
