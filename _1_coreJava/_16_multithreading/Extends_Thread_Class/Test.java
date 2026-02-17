package _1_coreJava._16_multithreading.Extends_Thread_Class;

public class Test {
    public static void main(String[] args) {
       World world = new World();
       world.start();

        for (; ; ){
            System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
        //System.out.println(Thread.currentThread().getName());

    }
}
