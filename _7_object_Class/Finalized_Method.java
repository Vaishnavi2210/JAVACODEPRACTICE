package _7_object_Class;

public class Finalized_Method {
    public static void main(String[] args) {
        // finalize() is a method defined in Java’s Object class
        /*  - finalize() is not guaranteed to run every time an object is garbage collected.
            - The Garbage Collector decides when (or if) it runs.
            - Since Java 9, finalize() has been deprecated because it’s unreliable.
            - Modern Java recommends using try-with-resources or a finally block for cleanup instead

         */

    /*    class A {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize() will be called by GC before deleting the object");
            }
        }

        A ref1 = new A();
        ref1 = null;         // eligible for GC
        System.gc();     // request Garbage Collector (it's called by developer)


 */

    }
}