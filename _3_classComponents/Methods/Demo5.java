package _3_classComponents.Methods;

public class Demo5 {

        static void staticMethod1() {
        }

        void instanceMethod1() {
        }

        //calling methods from static method
        static void staticMethod() {
            Demo5 reference = new Demo5();

            //calling sm from another sm
            staticMethod1();
            Demo5.staticMethod1();
            reference.staticMethod1();

            //calling im from another sm
            reference.instanceMethod1();

        }

        //calling methods from instance method
        void instanceMethod() {
            //calling sm from another im
            staticMethod1();
            Demo5.staticMethod1();
            this.staticMethod1();

            //calling im from another im
            this.instanceMethod1();
            instanceMethod1();
        }
}
