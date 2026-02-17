package Interview_Programs.practice;

public class Check_whether_a_string_is_palindrome {

    public static void main(String[] args) {

        String str = "Vaishnavi";
        String rev = "";
        boolean isPalindrome = true;

        for(int i = 0; i < str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        System.out.println("Reverse String : " + rev);

        if(str == rev) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
