package Interview_Programs.practice;

public class ReverseString_ifLetter_IfSymbol_Skip {
    public static void main(String[] args) {

        String str = "India$Is&Great";

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        for (int i = left; i <= right; i++){

            if(!Character.isLetter(arr[left])){
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                // Swap letter
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}
