package Interview_Programs;

public class FindMissingNo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};

        int n = arr.length + 1;

        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }
        int missingNo = expectedSum - actualSum;
        System.out.println("Missing No : " + missingNo);
    }
}
