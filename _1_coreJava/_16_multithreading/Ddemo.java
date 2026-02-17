package _1_coreJava._16_multithreading;

public class Ddemo {
    public static void main(String[] args) {

        class MyThread implements Runnable {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                       e.printStackTrace();
                    }
                    System.out.println("Ascending : " + i);
                }
            }
        }

        class Test implements Runnable {

                @Override
                public void run() {
                    for (int i = 10; i >= 1; i--) {
                        try{
                            Thread.sleep(2000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        System.out.println("Descending : " + i);
                    }
                }
            }


            MyThread mt = new MyThread();
            Test t = new Test();
            Thread thread1 = new Thread(mt);
            Thread thread2 = new Thread(t);

            thread1.start();
            thread2.start();


    }
}