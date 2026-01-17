package _5_oops.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        abstract class P{
            int a=10;
        }
        abstract class Q{
            int a=100;
        }
        //class Child extends P,Q {}//CTE


        abstract class A {
            int instanceVariable=100;
            void instanceMethod(){
                System.out.println("A instance method");
            }
            A(){
                System.out.println("A::constructor");
            }
            //abstract void m1();
        }
        //A ref = new A(); //class is declared abstract so can't create object

        class Child extends A{
            Child(){
                super();
            }
        }

        A a = new Child();

    }

}
