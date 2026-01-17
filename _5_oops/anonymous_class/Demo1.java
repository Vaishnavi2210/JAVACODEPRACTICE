package _5_oops.anonymous_class;

public class Demo1 {
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

        //create concreteSubclasses
        class AImpl extends A {
            @Override
            void m1() {
                System.out.println("AImpl : m1");
            }
        }
        class BImpl extends B {
            @Override
            void m1() {
                System.out.println("Bimpl : m1");
            }
        }

        class CImpl implements C {
            @Override
            public void m1() {
                System.out.println("Cimpl : m1");
            }
        }


        //creating the subclass objects
        A a = new AImpl();
        B b = new BImpl();
        C c = new CImpl();

        //call the methods
        a.m1();
        b.m1();
        c.m1();

    }

    }
