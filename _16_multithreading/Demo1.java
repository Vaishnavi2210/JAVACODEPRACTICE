package _16_multithreading;

public class Demo1 {

        public static void main(String[] args) throws InterruptedException {
            // create thread by extending Thread class
            //01. traditional way
            class Worker extends Thread {

                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i + " " + Thread.currentThread().getName());
                    }

                }
            }
            Worker worker = new Worker();
            worker.setName("worker");
            worker.start();

            Thread.sleep(5000);
            System.out.println("rest of the main");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }

        }


}
