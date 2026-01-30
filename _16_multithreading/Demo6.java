package _16_multithreading;

public class Demo6 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread() {
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());
                m1();
            }
        };
       thread.start();
       thread.setName("woker");
       thread.sleep(2000);    // because of this after 2 second main thread execute
       m1();    // here we call m1() exicute by main thread
    }
    public static void m1(){
        System.out.println("m1 " + Thread.currentThread().getName());
        m2();
    }

    public static void m2(){
        System.out.println("m2 " + Thread.currentThread().getName());
        m3();
    }

    public static void m3(){
        System.out.println("m3 " + Thread.currentThread().getName());
    }


}
