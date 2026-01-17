package _5_oops.inheritance;

public class Cyclic_Inheritance {

    //  A class cannot extend itself directly or indirectly
    // this is called cyclic inheritance and Java does not allow it.
    // because it creates ambiguity and makes object creation impossible.
    public static void main(String[] args){

        class Butterfly{
            public void fly(){
                System.out.println("Butterfly flying");
            }
        }

        /*class Butterfly extends Butterfly{      //Case 1: Direct self-inheritance
            public void (){}
        }
       */

        /*
        class A extends B {
            void showA() {
                System.out.println("Class A");   // Case 2: indirect self-inheritance
            }
        }

        class B extends A {
            void showB() {
                System.out.println("Class B");
            }
        }
        */


    }

}
