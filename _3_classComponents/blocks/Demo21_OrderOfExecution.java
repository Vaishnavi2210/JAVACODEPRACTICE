package _3_classComponents.blocks;

public class Demo21_OrderOfExecution {
    public static void main(String[] args) {
        class A {

            static {     // static block
                System.out.println("A::static block");
            }

            {     // instance block
                System.out.println("A::instance  block");
            }

            A() {
                //1. call to the super class constructor or same class
                //2. instance block of same class
                //3. rest of the code inside the constructor
                super();
                System.out.println("A::Constructor");
            }
        }
        A a = new A();
        //1. static block
        //2. instance block
        //3. constructor
    }
}
