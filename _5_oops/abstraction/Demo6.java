package _5_oops.abstraction;

public class Demo6 {
    public static void main(String[] args) {
        interface A{
            void m1();
            //void m2();
            default void m2(){}//default method
        }
        //subclass or implementations of interface A
        class X implements A{
            @Override
            public void m1() {

            }
        }
        class Y implements A{
            @Override
            public void m1() {

            }
        }
        class Z implements A{
            @Override
            public void m1() {

            }
        }
        class W implements A{
            @Override
            public void m1() {

            }
        }
        //.......
    }
}
