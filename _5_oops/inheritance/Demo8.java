package _5_oops.inheritance;

public class Demo8 {
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

        //03. Parent parent = new Child() --> parent, CTE, v=parent, method=child

        //3.1 members only present in parent class ---> parent
        System.out.println("3.1 members only present in parent class ---> parent");
        Parent parent = new Child();
        System.out.println(parent.a);
        parent.m1();

        //2.2 members only present in child class ---> CTE
        System.out.println("3.2 members only present in child class ---> CTE");
        /*System.out.println(parent.b);
        parent.m2();*/

        //2.3 members present in both parent and  child class ---> child
        System.out.println("3.3 members present in both parent and  child class ---> child");
        System.out.println(parent.c);   //99        // parent variable
        parent.m3();    //Child m3                  // child method


        //4. Child cp = new Parent()
//        Child cp = new Parent();//CTE
    }








}
