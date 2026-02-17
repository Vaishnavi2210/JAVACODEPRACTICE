package _1_coreJava._3_classComponents.Constructor;

public class Constructor_Chaining_2 { // different class

    public static void main(String[] args) {

        class Parent {

            Parent() {
                System.out.println("Parent Constructor");
            }
        }

        class Child_1 extends Parent {

            Child_1() {
                             // here not call explicitly JVM will call super() implicitly.
                System.out.println("Child_1 Constructor");
            }
        }
            class Child_2 extends Parent {

                Child_2(int b) {
                    super();   // implicitly called by JVM if we don't call explicitely
                    System.out.println("Child_2  Constructor");

                }
            }

           Child_1 c1 = new Child_1();
           Child_2 c2 = new Child_2(10);




        }
    }

