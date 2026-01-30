package _3_classComponents.NestedClasses;

public class Demo5 {
    class Inner {
       // A non-static inner class can have only instance members.
       // static members are not allowed except static final constants.

        /*
           static int a = 20;
           static void m1(){}    // ❌ NOT allowed
           static{}
           static class A{}
         */
        int instanceVariable = 100;

        static final int MAX = 100;   // ✅ allowed   (primitive) bcoz constant value
        // static final Integer X = 10;  // ❌ NOT allowed   (Wrapper class)
        static final String S = "Java";    // only static final constant fields

        void instanceMethod(){
            System.out.println("Inner :: instance method");
        }
    }

    public static void main(String[] args) {
        Demo5 outer = new Demo5();
        Inner inner = outer.new Inner();   // Type 1 creating object

        Demo5.Inner inner2 = outer .new Inner();  // Type 2

        System.out.println("instance variable = " + inner.instanceVariable);
        inner.instanceMethod();

        System.out.println("instance variable = " + inner2.instanceVariable);
        inner2.instanceMethod();

        //System.out.println(Demo5.Inner.a);
    }
}
