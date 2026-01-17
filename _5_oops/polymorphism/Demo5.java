package _5_oops.polymorphism;

public class Demo5 {
    public static void main(String[] args) {
        class A {
            int a = 10;
            static int b = 20;
        }
        class B extends A {
            int a = 100;
            static int b = 200;

            void display() {
                int a = 1000;
                int b = 2000;

                System.out.println("A class instance variable a = "+super.a);//10
                System.out.println("A class static variable b = " + A.b);//20
                System.out.println("B class instance variable a = "+this.a);//100
                System.out.println("B class static variable b = " + B.b);//200
                System.out.println("display() method variable a = " + a);//1000
                System.out.println("display() method  variable b = " + b);//2000
            }
        }

        B b = new B();
        b.display();
    }
}
