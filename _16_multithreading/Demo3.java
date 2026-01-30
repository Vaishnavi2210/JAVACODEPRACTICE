package _16_multithreading;

public class Demo3 {
    public static void main(String[] args) {

        class Worker extends Thread {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);   //Worker thread ekda 5sec pause
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());
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
