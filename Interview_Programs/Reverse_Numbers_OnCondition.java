package Interview_Programs;

public class Reverse_Numbers_OnCondition {

    public static  int reverse(int number) {
        int result = 0;

        // 1. simple reverse
        while (number != 0) {
            int digit = number % 10;   // get the last digit
            number = number / 10;        // remove last digit

        /* agar value badhi ho to ye use krna

          // Check for overflow before multiplying by 10
        if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
            System.out.println("Overflow detected!");
            return 0;
        }
       */
        result = result * 10 + digit;

        }
        return result;
    }
    public static void main(String[] args) {

        int num1 = 123;
        int num2 = -456;
        int num3 = 120;

        System.out.println(reverse(num1));
        System.out.println(reverse(num2));
        System.out.println(reverse(num3));

        /*
             Last digit ghe (num % 10)

Last digit remove kar (num / 10)

Result = result * 10 + digit

Negative handle automatically hoil (-456 % 10 = -6)

- bs ye line extra krni hai
- Overflow check: result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10
       Overflow tab matter karta hai jab input ka number extreme ho
       (jaise 2147483647 ya -2147483648) aur reverse karne se int limit cross ho sakta hai.
         */
    }
}
