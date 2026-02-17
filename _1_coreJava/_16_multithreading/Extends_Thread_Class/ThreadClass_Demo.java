package _1_coreJava._16_multithreading.Extends_Thread_Class;

public class ThreadClass_Demo {
    public static void main(String[] args) {

        Runnable hello = new Display_Message("hello");
        Thread thread1 = new Thread(hello);

        thread1.setDaemon(true);
    }
}
