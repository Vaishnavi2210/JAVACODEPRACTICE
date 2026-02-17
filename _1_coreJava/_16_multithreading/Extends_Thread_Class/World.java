package _1_coreJava._16_multithreading.Extends_Thread_Class;

public class World extends  Thread{

    @Override
    public void run() {
        for (int i = 1; i < 100000; i++){
            System.out.println("world");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
