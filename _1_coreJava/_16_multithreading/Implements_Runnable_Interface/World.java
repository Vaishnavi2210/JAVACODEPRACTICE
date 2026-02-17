package _1_coreJava._16_multithreading.Implements_Runnable_Interface;

public class World implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100 ; i++) {
            System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
