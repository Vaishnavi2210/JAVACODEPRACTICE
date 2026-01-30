package _16_multithreading;

public class MainThread implements  Runnable{

    @Override
    public void run() {
        System.out.println("Main Thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MainThread mt = new MainThread();
        Thread t = new Thread(mt);
        t.start();
    }
}
