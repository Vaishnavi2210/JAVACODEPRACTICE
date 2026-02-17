package Interview_Programs.practice;

public class Find_factorial_using_recursion {
   // public static void main(String[] args) {
    /*
       // without Recursion
        int fact = 1;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of N : " + fact);
    }
    */
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;   // Base condition
            }
            return n * factorial(n - 1);
        }

        public static void main(String[] args) {

            int n = 10;
            int result = factorial(n);

            System.out.println("Factorial of N : " + result);

}
}