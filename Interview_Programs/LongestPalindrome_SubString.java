package Interview_Programs;

import java.util.Scanner;

public class LongestPalindrome_SubString {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return "";

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String odd = expand(s, i, i);

            // Even length palindrome
            String even = expand(s, i, i + 1);

        // Update result if longer palindrome found
          if (odd.length() > result.length())
                 result = odd;
          if (even.length() > result.length())
                 result = even;

       }
       return result;
    }

    // expand
    private static String expand(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return  s.substring(left+1, right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();

        String longest = longestPalindrome(input);

        System.out.println("longest Palindromic Substring: " + longest);
    }
}
