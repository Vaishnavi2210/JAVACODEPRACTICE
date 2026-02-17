package _1_coreJava._16_multithreading;

public class Ddemo2 {
    public static void main(String[] args) {

        class Messanger implements  Runnable{

            String msg;

            public Messanger (String msg){
                this.msg = msg;
            }

            @Override
            public void run() {
               for(char c : msg.toCharArray()){
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e){
                      e.printStackTrace();
                  }
                 //  System.out.println(c);
                   System.out.print(c);
               }
            }
        }

        Messanger m = new Messanger("This is Vaishnavi Nerkar");
        Thread thread = new Thread(m);

        thread.start();
    }
}
