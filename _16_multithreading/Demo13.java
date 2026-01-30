package _16_multithreading;

public class Demo13 {
    public static void main(String[] args) throws  InterruptedException {
        Runnable runnableEven = () -> {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            for (int i = 0 ; i <= 100; i = i + 2){
                System.out.println(i + " = " + Thread.currentThread().getName());
            }
        };

        Runnable runnableOdd = () -> {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 1; i <= 100; i = i+2){
                System.out.println(i + " = "+ Thread.currentThread().getName());
            }
        };

        Thread even = new Thread(runnableEven, "even");
        Thread odd = new Thread(runnableOdd, "odd");

        even.setPriority(10);
        even.start();
        odd.start();

        //main thread will wait for even and odd thread to complete the execution.
        even.join(50000);
        odd.join(50000);

        for (int i = 1; i <= 100; i++){
            System.out.println(i + " = " + Thread.currentThread().getName());
        }
    }
}
