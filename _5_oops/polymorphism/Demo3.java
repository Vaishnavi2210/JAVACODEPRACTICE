package _5_oops.polymorphism;

public class Demo3 {
    public static void main(String[] args) {
        class Parent {
            void display() {
                System.out.println("Parent::display");
            }
        }
        class Child extends Parent {
            //method overloading and not overriding
            void display(int a) {
                System.out.println("Child::display");
            }
        }
        Child child = new Child();
        child.display(10);
        child.display();
    }
}
