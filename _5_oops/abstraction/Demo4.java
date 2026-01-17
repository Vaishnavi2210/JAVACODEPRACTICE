package _5_oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        interface A {
            //by default variables are public static final
            int variable = 100;//it is not instance variable
            public static final int b = 200;


            static void m1(){}
            default void m2(){}
            //void m3(){}//CTE
            void m3();
            public abstract void m4();
            //A(){}//CTE
            //{}//CTE

            //by default nested classes are public static
            class B {} //this is not an inner class
            public static class C {} //
        }
    }
}
