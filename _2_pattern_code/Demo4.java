package _2_pattern_code;

public class Demo4 {
    public static void main(String[] args) {
        /*
                 * * * * *
                   * * * *
                     * * *
                       * *
                         *
         */

        for (int i = 5; i >= 1; i--) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}