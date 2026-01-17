package _5_oops.inheritance;

public class OrderOf_Execution {
    public static void main(String[] args) {

            class A {
                static {
                    System.out.println("A::static block");
                }
                {
                    System.out.println("A::instance block");
                }
                A(){
                    super();
                    ///same class instance block
                    System.out.println("A::constructor");
                }
            }
            class B extends A {
                static {
                    System.out.println("B::static block");
                }
                {
                    System.out.println("B::instance block");
                }
                B(){
                    super();
                    //same class instance block
                    System.out.println("B::constructor");
                }
            }

            B b = new B();
            //01. static block of parent
            //02. static block of child
            //03. instance block of parent
            //04. constructor of parent class
            //05. instance block of child
            //06. constructor of child class


    }
}
