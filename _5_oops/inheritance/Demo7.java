package _5_oops.inheritance;

public class Demo7 {
    public static void main(String[] args) {
        class Parent {
            int a = 10;
            int c = 99;

            void m1() {
                System.out.println("Parent ::m1()");
            }
            void m3(){
                System.out.println("Parent ::m3");
            }
        }
        class Child extends Parent {
            int b = 200;
            int c = 999;
            void m2() {
                System.out.println("Child ::m2()");
            }
            void m3(){
                System.out.println("Child ::m3");
            }
        }

        //02. Child child = new Child() --> parent, child, child

        //2.1 members only present in parent class ---> parent
        System.out.println("2.1 members only present in parent class ---> parent");
        Child child = new Child();
        System.out.println(child.a);
        child.m1();

        //2.2 members only present in child class ---> child
        System.out.println("2.2 members only present in child class ---> child");
        System.out.println(child.b);
        child.m2();

        //2.3 members present in both parent and  child class ---> child
        System.out.println("2.3 members present in both parent and  child class ---> child");
        System.out.println(child.c);//999
        child.m3();//Child m3
    }

}
