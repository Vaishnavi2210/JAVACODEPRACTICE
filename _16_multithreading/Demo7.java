package _16_multithreading;

public class Demo7 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + "=" + Thread.currentThread().getName());
                }
            }
        };
        thread.setName("worker");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(10 / 0);
    }
}
