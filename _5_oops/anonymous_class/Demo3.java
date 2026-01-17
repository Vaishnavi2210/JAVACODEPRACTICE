package _5_oops.anonymous_class;

public class Demo3 {
    public static void main(String[] args) {

        class Parent {
            void m1() {
                System.out.println("Parent :: m1");
            }
        }

        class Child extends Parent {
            void m2() {
                System.out.println("Child::m2");
            }
        }

        Parent parent = new Child();

        parent.m1();
        //parent.m2();//CTE m2 is only present in child class
        System.out.println("using anonymous class");

        Parent parent1 = new Parent() {
            void m2() {
                System.out.println("anonymous::m2");
            }
        };
        parent1.m1();


    }
}
