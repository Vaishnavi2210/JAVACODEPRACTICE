package _16_multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        //1. Traditional Way
        MyThread Mt = new MyThread();
        Mt.start();

        //2. Anonymous class
        MyThread w = new MyThread() {
            public void run() {
                System.out.println("Vaishnavi ");
            }
        };
        w.start();

        // Q. Runnable ka lambda method reference kyun yahan kaam kar raha hai jab class Thread extend kar rahi hai?
        //--> Because Thread class ka constructor Runnable accept karta hai.

        // 3. Lambda in Thread class using Constructor
         new Thread(() -> System.out.println("Snehal ")).start();   //  Tum Thread extend nahi kar rahe
                                                                    //  Tum Runnable pass kar rahe ho constructor me

        //4. Method reference in Thread class using constructor
        //MyThread myt = new MyThread(); - by creating subclass object also u can use
        Thread t = new Thread(MyThread::task);
        t.start();                                   //  extends Thread → Thread IS-A task
                                                     //new Thread(Runnable) → Thread HAS-A task
    }
    public static void task(){
        System.out.println("Bhushan ");
    }

}


