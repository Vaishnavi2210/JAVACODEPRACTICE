package _5_oops.inheritance;

public class Constructor_Chaining {
    public static void main(String[] args) {

        class A {
            A() {
                super();
                System.out.println("A::constructor");
            }
        }
        class B extends A {
            B() {
                super();
                //super class constructor call
                System.out.println("B::constructor");
            }
        }
        class C extends B {
            C() {
                super();
                System.out.println("C::constructor");
            }
        }

        // A a = new A();   // only A class constructor will be called
        // B ref = new B(); // A class con --> B class con
        C ref = new C();    // A class con --> B class con --> C class
    }
}
