package _5_oops.abstraction;

public class Demo3 {
    public static void main(String[] args) {

        abstract class A {
            abstract void m1();
        }

        abstract class B extends A {

            abstract void m2();
        }

        class C extends B {
            @Override
            void m1() {
                System.out.println("C::m1");
            }
            @Override
            void m2() {
                System.out.println("C::m2");
            }
        }

        C c = new C();
        c.m1();
        c.m2();


    }
}
