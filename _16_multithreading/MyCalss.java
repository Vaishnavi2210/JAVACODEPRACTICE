package _16_multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class MyCalss implements Runnable {


    public void run(){
        System.out.println("Gayatri"+ Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        // Traditional Way
        MyCalss my = new MyCalss();
        Thread t = new Thread(my);
        t.start();

        // Anonymous Way

        MyCalss m = new MyCalss(){
            public void run(){
                System.out.println("Jay" + Thread.currentThread().getName());
            }
        };
        Thread th = new Thread(m);
        th.start();

        // Lambda Expression Way
        Runnable runnable = () -> System.out.println("Kunal" + Thread.currentThread().getName());
         Thread tc = new Thread(runnable);
         tc.start();

         // MethodReference Way
        Runnable r = MyCalss::task;
        Thread tl = new Thread(r);
        tl.start();
        }
        public static void task() {
            System.out.println("Anushka"+Thread.currentThread().getName());
        }
    }

