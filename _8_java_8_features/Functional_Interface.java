package _8_java_8_features;

public interface Functional_Interface {

// The interface contain only single/one abstract method. this rule only for abstract method.(allow any no. of default and static method)
    // To achieve Functional Programming  //- Marked with @FunctionalInterface (optional but recommended).
    // Java define 34 predefine functional interfaces
    //eg: Consumer, BiConsumer, Predicate, BiPredicate, Supplier, BiSupplier, Function, BiFunction, Comparator,Runnable, Callable

    void display();         // single abstract method
    default void run() {
        System.out.println("Running FunctionalInterface");
    }

    static int multiply(int n1, int n2) {
        int c = n1 * n2;
        return c;

    }

}
    @FunctionalInterface
    interface I1{
        // single abstract method
        void run();   //single abstract method
        default void start(){System.out.println();}    // default method

        default void stop(){ System.out.println(); }   //  default method

    }

    class Child implements Functional_Interface, I1{

       @Override
       public void display(){
           System.out.println("Child display");
       }
        @Override
        public void run() {
          System.out.println("Running Child" );
     }

     public static void main(String[] args) {
         Functional_Interface f = new Child();
         I1 i = new Child();

         f.display();
         f.run();               // child's run
         Functional_Interface.multiply(1, 2);

         i.run();               // child's run
         i.start();
         i.stop();

     }

    }
/*
Why overriding run() is required?

Functional_Interface has a default run()

I1 has an abstract run()

👉 Abstract method has higher priority than default method
👉 So Child must implement run()
*/





