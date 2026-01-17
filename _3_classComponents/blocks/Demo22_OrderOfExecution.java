package _3_classComponents.blocks;

public class Demo22_OrderOfExecution {

    public static void main(String[] args) {
        class Parent {

            static {       // static block
                System.out.println("Parent::static block");
            }

            {       // instance block
                System.out.println("Parent::instance  block");
            }

            Parent() {
                //1. call to the super class constructor or same class
                //2. instance block of same class
                //3. rest of the code inside the constructor
                super();
                System.out.println("Parent::Constructor");
            }
        }
        class Child extends Parent {

            static {
                System.out.println("Child::static block");
            }

            {
                System.out.println("Child::instance  block");
            }

            Child() {
                //1. call to the super class constructor or same class
                //2. instance block of same class
                //3. rest of the code inside the constructor
                super();
                System.out.println("Child::Constructor");

                Child c = new Child();

            }


        }
    }
}