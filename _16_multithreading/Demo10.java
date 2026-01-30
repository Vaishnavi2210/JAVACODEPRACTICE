package _16_multithreading;

public class Demo10 {
    public static void main(String[] args) {
        //01. create the subclass of type Runnable
        //02. create the subclass object
        //03. create the Thread class object and pass the reference of subclass
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " = " + Thread.currentThread().getName());
            }
        }, "worker");

        //04. call the start method
        thread.start();
    }
}
