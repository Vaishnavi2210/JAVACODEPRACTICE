package _16_multithreading;

public class Demo12 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnableEven = () -> {
            for (int i = 0; i <= 100; i = i + 2) {
                System.out.println(i + "=" + Thread.currentThread().getName());
            }
        };
        Runnable runnableOdd = () -> {
            for (int i = 1; i <= 100; i = i + 2) {
                System.out.println(i + "=" + Thread.currentThread().getName());
            }
        };

        Thread even = new Thread(runnableEven, "even");
        Thread odd = new Thread(runnableOdd, "odd");

        even.setPriority(10);
        even.start();
        odd.start();

        Thread.yield();    //main suggests scheduler to give chance to other threads
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "=" + Thread.currentThread().getName());
        }
  // mix output
    }
    /*
         yield() = maybe pause
         sleep() = definitely pause
         join() = definitely wait
         priority() = OS may ignore
     */
}
