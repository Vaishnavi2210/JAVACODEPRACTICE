package _5_oops.inheritance;

public class Demo1 {
    public static void main(String[] args) {

        // single level inheritance ---[non-private, non-static, non-final]
        class Parent {
            int a=1;
            int b=2;
            int c= 3;
            void m1(){
                System.out.println("Parent ::m1");
            }
        }

        class Child extends Parent{

        }

        Child child = new Child();

        System.out.println(child.a);
        System.out.println(child.b);
        System.out.println(child.c);

        child.m1();
    }
}
