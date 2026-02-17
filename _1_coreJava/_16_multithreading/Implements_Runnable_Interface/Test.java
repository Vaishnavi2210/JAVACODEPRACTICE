package _1_coreJava._16_multithreading.Implements_Runnable_Interface;

public class Test {
    public static void main(String[] args) {

        World world  = new World(); // NEW
        Thread t = new Thread(world);
        t.start(); //RUNNABLE

        for (int i = 1; i <= 100; i++){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }

        System.out.println(Thread.currentThread().getName());

    }
}
