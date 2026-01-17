package _5_oops.inheritance;

public class Demo3 {
    public static void main(String[] args) {

        // multiple inheritance ---[non-private, non-static, non-final]
        class A {
            int a = 1;
            int b = 2;
            int c = 3;

            void m1() {
                System.out.println("A ::m1");
            }
        }

        class B  {
            int a = 11;
            int b = 22;
            int c = 33;
            void m1() {
                System.out.println("B ::m1");
            }
        }
        // class C extends A, B { }

        interface I1{
            //instance members are not allowed in interface
            //so there won't be any confusion for the child class

        }
        interface I2{}
        class C implements I1,I2{}
        C ref = new C();


    }
}
