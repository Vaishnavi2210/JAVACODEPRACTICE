package _16_multithreading;

public class Demo11 {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnableEven = () -> {
            for(int i = 0; i <=100; i = i+2){
                System.out.println(i + " = " + Thread.currentThread().getName());
            }
        };

        Runnable runnableOdd = () -> {
            for (int i = 1; i <= 100; i = i+2){
                System.out.println(i + " = "+ Thread.currentThread().getName());
            }
        };

        Thread even = new Thread(runnableEven, "even");
        Thread odd = new Thread(runnableOdd, "odd");

        even.setPriority(10);  // max = 10  min = 1, default = 5
        even.start();          // when set priority scheduler try priority but not guarantee its suggestion only
        odd.start();

        Thread.sleep(10000);   //main sleep for 10sec
        for (int i = 1; i <= 100; i++){
            System.out.println(i + " = " +Thread.currentThread().getName());
        }
    }
}
