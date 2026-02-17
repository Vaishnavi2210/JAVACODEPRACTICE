package _1_coreJava._16_multithreading.Extends_Thread_Class;

public class Thread_Methods extends  Thread{

    // Constructor - to give name to Thread
    public  Thread_Methods(String name){
         super(name);
    }
    @Override
    public void run() {          // RUNING
        for (int i = 1; i <= 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

        // setPriority
        for (int j = 0; j <5; j++){
            System.out.println(Thread.currentThread().getName() + "- Priority: " + Thread.currentThread().getName() + "- Priority"+ Thread.currentThread().getPriority()+ "- count: "+ j);
            try{
                Thread.sleep(5000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread_Methods tm = new Thread_Methods("Vaishnavi");  // NEW -> Thread created and go to NEW state
        tm.start();   // 1. start() method -> change state of Thread NEW -> RUNNABLE

        tm.join();       // 2. join() - wait for thread which executing currently (here main thread waiting for methodclass thread)
        System.out.println("Hello");

        Thread_Methods tm1 = new Thread_Methods("Low Priority Thread");
        Thread_Methods tm2 = new Thread_Methods("Medium Priority Thread");
        Thread_Methods tm3 = new Thread_Methods("High Priority Thread");
        tm1.setPriority(Thread.MIN_PRIORITY);
        tm2.setPriority(Thread.NORM_PRIORITY);
        tm3.setPriority(Thread.MAX_PRIORITY);

        tm1.start();
        tm2.start();
        tm3.start();








    }
}
