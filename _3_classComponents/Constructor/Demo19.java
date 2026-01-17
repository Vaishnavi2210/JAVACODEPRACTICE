package _3_classComponents.Constructor;

public class Demo19 {
    public static void main(String[] args) {
        class A {

            {
                System.out.println("instance block of A");
            }

            static {
                System.out.println("static block of A");
            }
        }

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
    }
}
