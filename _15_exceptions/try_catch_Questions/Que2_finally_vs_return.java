package _15_exceptions.try_catch_Questions;

public class Que2_finally_vs_return {

        public static void main(String[] args) {
            try {
                return;
            } finally {
                System.out.print("Finally");
            }
        }
}


