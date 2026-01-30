package _16_multithreading;

public class Demo2 {
    public static void main(String[] args) {

        class Worker extends Thread {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(5000);   //Worker thread each iteration ला pause loop madhe ahe mhnun
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
            }
        }

        Worker w = new Worker();
        w.setName("worker");
        w.start();

        for(int i =1; i <=10; i++){
            System.out.println(i + " "+ Thread.currentThread().getName());

          }
        }


    }
