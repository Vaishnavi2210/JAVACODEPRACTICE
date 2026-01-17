package _5_oops.polymorphism;

public class Demo1 {
    public static void main(String... args) {
        class Addition {
            //static method overloading
            private static int add(int number1, int number2) {
                return number1 + number2;
            }

            //Ellipsis operator
            private static int add(int... numbers) {
                int sum = 0;
                for (int temp : numbers) {
                    sum += temp;
                }
                return sum;
            }

            private static int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }

            private static float add(float number1, float number2) {
                return number1 + number2;
            }
        }
        System.out.println(Addition.add(10, 20));
        System.out.println(Addition.add(10, 20, 30, 40, 50));
        System.out.println(Addition.add(10, 20, 30));
        System.out.println(Addition.add(10.5f, 20.5f));
    }
}
