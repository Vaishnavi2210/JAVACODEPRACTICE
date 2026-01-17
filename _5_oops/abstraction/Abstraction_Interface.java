package _5_oops.abstraction;

public class Abstraction_Interface {
    // Abstraction means hiding implementation details
    // and showing only essential features to the user.

    public static void main(String[] args) {
        // Interface = 100% abstraction
        interface Vehicle {
            /*     int car_no;        // ❌ error
                   String color;      // not allowed because in interface variables are public static final comnstant
                   String name;       // so, it must be initialized

             */


            public static final int CAR_NO = 101;
            String COLOR = "Red";         // variable are public static final by java 8 allows it
            String NAME = "Swift";


            // abstract method (by default public & abstract)
         public abstract void start();              // public abstract

            void fuelType();           // public abstract

            default void electricCar(){      // only present in interface // default method - we have default keyword and methood body in this method
                System.out.println(" This is a Electric Car ");         // provide backword compability - jisko ye nhi pasand wo ovveride karega baki same inherit karenge
            }
        }

        // Concrete class implementing interface
        class Car implements Vehicle {

            // implementing interface methods (mandatory)
            public void start() {
                System.out.println("Car starts with key");
            }

            public void fuelType() {
                System.out.println("Car uses petrol or diesel");
            }

            // implementation-specific method
            void musicSystem() {
                System.out.println("Car has music system");
            }
        }

        // -------------------------------------------------
        // Design + abstraction focused ✅
        Vehicle v = new Car();
        // We use interface (parent) reference to hide implementation details
        // and to achieve abstraction and runtime polymorphism.
        // Method execution depends on the object, not on reference type.

        v.start();
        v.fuelType();
        // v.musicSystem();   // ❌ not allowed (hidden) // sirf parent me jo hai wahi execute hogi child ki nhi means yahi hide kiya

        System.out.println(" ------------------------------------ ");

        // Implementation focused ❌
        Car c = new Car();
        c.start();
        c.fuelType();
        c.musicSystem();  // accessible → abstraction break


        // Using child class reference exposes implementation-specific methods,
        // so abstraction is not achieved;
        // abstraction is achieved only when we use a parent (interface) reference.
    }
}




