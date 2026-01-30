package _13_arrays.MEDIUM_LEVEL2;

public class MergeTwo_Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {6, 7, 3, 8, 9, 10};

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;   //index++ moves to the next position after storing a value,
                         // so each element goes into a new place and nothing gets overwritten.
        //copy arr1
        for(int i = 0; i < arr1.length; i++){
            merged[index++] = arr1[i];
        }

        //copy arr2
        for(int i = 0; i < arr2.length; i++){
            merged[index++] = arr2[i];
        }
          //Print merged Array
        for(int n : merged){
            System.out.print(n + " ");
        }

    }
}
