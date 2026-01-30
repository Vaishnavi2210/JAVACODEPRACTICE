package _13_arrays.MEDIUM_LEVEL2;

public class Find_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};

        int n = arr.length + 1;    // because one number is missing

          int expectedSum = n*(n+1)/2;
          int actualSum = 0;

          for(int num : arr){
              actualSum += num;
          }

          int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is : "+ missingNumber);

    }
}