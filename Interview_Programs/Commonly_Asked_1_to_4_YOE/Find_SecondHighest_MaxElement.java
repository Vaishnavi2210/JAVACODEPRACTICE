package Interview_Programs.Commonly_Asked_1_to_4_YOE;

public class Find_SecondHighest_MaxElement {
    // 3️⃣ Find Second Highest / Max Element
    // Question: Find second largest number in an array without sorting.
    // Concept tested: Loops Edge cases Integer.MIN_VALUE handling

    public static void main(String[] args) {
        int [] arr = {2, 1, 4, 9, 6, 7, 3};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int n : arr){
            if(n > max){
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) {
                 secondMax = n;
            }
        }
        System.out.println(secondMax);
    }

}
