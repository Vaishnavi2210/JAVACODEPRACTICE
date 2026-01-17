package _3_classComponents.Methods;

public class Demo7 {

        public static void main(String[] args) {
            int number1 = 10;
            int number2 = 20;
            System.out.println(add(number1, number2));
            System.out.println("After addition");
            System.out.println("number1 = " + number1);
            System.out.println("number2 = " + number2);
        }

        public static int add(int number1, int number2) {
            number1 = 100;
            number2 = 200;
            return number1 + number2;
        }

    static class Student {
            int id;
            String name;

    }
}
