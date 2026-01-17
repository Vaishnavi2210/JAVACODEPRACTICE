package _3_classComponents.Methods;

public class Demo4 {

        void instanceMethod1() {
        }

        void instanceMethod2() {
        }

        void instanceMethod3() {
        }

        static void staticMethod1() {
        }

        static void staticMethod2() {
        }

        static void staticMethod3() {
        }

        //calling methods from static method
        static void staticMethod() {
            Demo4 reference = new Demo4();
            //1. call the static method of the same class
            Demo4.staticMethod1(); //using ClassName.staticMethodName
            staticMethod2();// we can directly call without using classname
            reference.staticMethod3(); // i can use reference also to call static method

            //2. call the instance method of the same class
            reference.instanceMethod1();
        }

        //calling methods from instance method
        void instanceMethod() {
            //1. call the static method of the same class
            Demo4.staticMethod1(); //using ClassName.staticMethodName
            staticMethod2();// we can directly call without using classname
            this.staticMethod2();// using reference

            //2. call the instance method of the same class
            this.instanceMethod1();
            instanceMethod1();
        }
}
