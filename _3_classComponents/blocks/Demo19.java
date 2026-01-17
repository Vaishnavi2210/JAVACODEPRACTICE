package _3_classComponents.blocks;

public class Demo19 {
    public static void main(String[] args) {
        class A {

            // Instance block(non - static)
            {
                System.out.println("instance block of A");
            }

            // static block
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
