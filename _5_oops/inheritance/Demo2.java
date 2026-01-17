package _5_oops.inheritance;

public class Demo2 {
    public static void main(String[] args) {

        // multi level inheritance ---[non-private, non-static, non-final]
        class A {
            int a = 1;
            int b = 2;
            int c = 3;

            void m1() {
                System.out.println("A ::m1");
            }
        }

        class B extends A {
            int d=10;
        }
        class C extends B {

        }

        C child = new C();

        System.out.println(child.a);
        System.out.println(child.b);
        System.out.println(child.c);
        System.out.println(child.d);

        child.m1();
    }
}
