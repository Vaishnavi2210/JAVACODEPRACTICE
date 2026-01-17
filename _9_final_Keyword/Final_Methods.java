package _9_final_Keyword;

public class Final_Methods {
    //If a method is final, then it cannot be overridden.
    public static void main(String[] args) {
        class Parent {
            final void m1() {
                System.out.println("Parent :: m1");
            }
        }
        class Child extends Parent {
            /*      //final methods cannot be overridden --> CTE
               @Override
                void m1() {
                System.out.println("Child :: m2");
            }
            */

            final void run() {
                System.out.println("Child :: m2");
            }
        }
            Parent p1 = new Child();
            p1.m1();
            // p1.run();  -- it's child method its can not call from parent object.
        }
    }

