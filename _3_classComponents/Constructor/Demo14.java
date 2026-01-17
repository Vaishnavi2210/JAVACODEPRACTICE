package _3_classComponents.Constructor;

public class Demo14 {
    public static void main(String[] args) {
        class A {
            int x;
            int y;

            A() {
                //constructor chaining
                this(10, 20);//CTE - call to the constructor must be the first line
                System.out.println("zero param");
                //this(10);//CTE - we can call only one constructor
            }

            A(int a) {
                x = a;
            }

            A(int a, int b) {
                this(100);
                x = a;
                y = b;
            }

            A a = new A();

        }
    }
}
