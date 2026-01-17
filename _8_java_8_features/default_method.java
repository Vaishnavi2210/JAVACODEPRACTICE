package _8_java_8_features;

public interface default_method {

    // Default methods - In Java, default methods are methods in an interface that have a default implementation.
    // They were introduced in Java 8 to allow interfaces to evolve without breaking existing implementations.

    default void show(){
        System.out.println("Hello World");
    }

    default void display(){
        System.out.println("Hello Sanskriti");
    }

}
//@FunctionalInterface

    interface default_child{
    void sleep();
     default void show(){
            System.out.println("Hello Bhushan");
     }

     default void display(){
         System.out.println("Hello Sakshi");
     }
    }

class Notify_Method1 implements default_method, default_child{

    public void sleep(){
        System.out.println("Hello Gayatri");
    }

    @Override
    public void display(){
        System.out.println("Hello Snehal");
    }
     public void show() {
       default_method.super.show();
       // default_child.super.show();      // If i want only one method call then i call directly
    }
    public static void main(String[] args) {

        default_method d1 = new Notify_Method1();
        Notify_Method1 obj = new Notify_Method1();
        obj.show();
        d1.show();

    }
}

