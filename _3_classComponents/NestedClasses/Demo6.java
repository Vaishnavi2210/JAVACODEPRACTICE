package _3_classComponents.NestedClasses;

public class Demo6 {
    public static void main(String[] args){

        // A local inner class can have only instance members;
        // static members are not allowed except static final compile-time constants
        class LocalInnerClass{
            int instanceVariable;        // instance variable ✔
            static final int Y = 20;    // constant ✔

            void instanceMethod(){       // // instance method ✔
                System.out.println("LocalInnerClass :: instance method");
            }
        }

        LocalInnerClass ref = new LocalInnerClass();
        System.out.println("LocalInnerClass instanceVariable = " + ref.instanceVariable);
        ref.instanceMethod();
    }
}
