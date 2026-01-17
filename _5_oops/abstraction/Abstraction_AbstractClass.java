package _5_oops.abstraction;

public class Abstraction_AbstractClass {
    // Abstraction means hiding implementation details and showing only essential features to the user.
    public static void main(String[] args) {
        // abstract class = 0 - 100% abstraction
        abstract class Vehicle {

             abstract void start();    // abstract method (no body)

            void fueltype(){         // Concrete method
                System.out.println("Vehicle uses Fuel ");
            }  // concrete method
        }

        class Car extends Vehicle {         // concrete class
            void start(){                  // concrete method
                System.out.println("Car starts with key ");
            }

            void seatbelt(){             // concrete method
                System.out.println("Car seats with belt ");
            }
        }

       // Design + abstraction focused ✅
        Vehicle v = new Car();    //  We use parent class reference to hide implementation details and to achieve abstraction and runtime polymorphism;
                                 //  method execution depends on the child object, not the reference type.
        v.start();
        v.fueltype();
       // v.seatbelt();    // ❌ not allowed

        System.out.println(" ------------------------------------ ");

        Car c = new Car();     // Implementation focused
        c.start();             // not use in abstraction
        c.fueltype();
        c.seatbelt();
    }
    // Using child class reference exposes implementation-specific methods, so abstraction is not achieved;
    // abstraction is achieved only when we use a parent abstract class reference.
}
