package _15_exceptions.try_catch_Questions;

public class EXCEPTION_PROPAGATION {
    // methodA() → methodB() → methodC()

    //Exception occurs in methodC
    //Handled only in methodA

        public static int test() {
            try {
                return 10;
            } catch (Exception e) {
                return 20;
            } finally {              //❌ Never write return inside finally
                                    // ✔ It hides exceptions & overrides logic
                return 30;
            }
        }

        public static void main(String[] args) {
            System.out.println(test());
        }


}
