package _16_multithreading;

public class Demo8 {
    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        thread.start();

        try {
            Thread.sleep(10);   // main thread sleep
        } catch (Exception e) {
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(10 / 0);
    }
}