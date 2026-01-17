package _5_oops.anonymous_class;

public class Demo2 {
    public static void main(String[] args) {
        //01. concrete class
        class A {
            void m1() {
            }
        }
        //02. abstract class
        abstract class B {
            abstract void m1();
        }
        //03. interface
        interface C {
            void m1();
        }

        //create concreteSubclasses definition +  creating the subclass objects
        A a = new A() {
            @Override
            void m1() {
                System.out.println("AImpl : m1");
            }
        };

        B b = new B() {
            @Override
            void m1() {
                System.out.println("Bimpl : m1");
            }
        };

        C c = new C() {
            @Override
            public void m1() {
                System.out.println("Cimpl : m1");
            }
        };

        //call the methods
        a.m1();
        b.m1();
        c.m1();

    }
}
