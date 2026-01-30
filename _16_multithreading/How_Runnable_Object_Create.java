package _16_multithreading;

public class How_Runnable_Object_Create {
    public static void main(String[] args) {

        class MyClass implements Runnable {

           public void run(){
                System.out.println("Hello");
            }


            // 1. Lambda = anonymous class behind the scenes
            Runnable r = () -> System.out.println("Hello"); // Interface नाही

            /*   What JVM internally do? // imaginary hidden class (you cannot write this)
            class $$Lambda$1 implements Runnable {  //Interface implement करणाऱ्या hidden class चा object बनतो
                public void run() {
                    System.out.println("Hello");
                }
            }
            Runnable rr = new $$Lambda$1();
            */

             public static void task(){
                 System.out.println("Kartik");
             }

             // 2. Method Reference case
            Runnable runnable = MyClass::task;

            // Internally:
            // imaginary hidden class (you cannot write this)
            /*   class $$Lambda$2 implements Runnable {
                   public void run() {
                      MyClass.task();
                  }
            }

            Runnable r = new $$Lambda$2();
            /*
        }
/*
🔹 Why ONLY Functional Interfaces?

        Reason:
        Functional interface मध्ये एकच abstract method असतो
        JVM ला exact mapping समजते:
        run() → lambda body / method reference

        // Interface = contract
        //  Lambda = instant implementation
        // Object = implementation class चा instance

* Lambda expressions do not create objects of interfaces directly;
  they create instances of anonymous classes that implement the functional interface.

 */

        }
    }

}