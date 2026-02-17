package _1_coreJava._16_multithreading.Extends_Thread_Class;

public class MyThread extends Thread{

    @Override
    public void run() {     // t1 thread
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();    // NEW
        System.out.println(t1.getState());

        t1.start();                      // RUNNABLE
        System.out.println(t1.getState());

        Thread.currentThread().getState();  // main Thread
       // System.out.println(Thread.currentThread().getName());

        Thread.sleep(100);           // TIMED WAITING
       System.out.println(t1.getState());

        t1.join();                 // TERMINATED
       System.out.println(t1.getState());



    }
}
