package _16_multithreading;

public class Demo5 {
    public static void main(String[] args) {

        m1();
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
