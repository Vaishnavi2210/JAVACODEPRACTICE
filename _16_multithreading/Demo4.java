package _16_multithreading;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);   // here we ckeck where is exception
                                    // and when no thraed created always main thread is there
    }
}
