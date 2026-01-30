package _16_multithreading;
public class Demo14 {

    public static void main(String[] args) {
         class  Shared{
             int data;
             boolean available = false;

             synchronized void produce(int value) throws InterruptedException {
                 while (available){
                     wait();
                 }
                 data = value;
                 available = true;
                 System.out.println("produced : " + data);
                 notify();
             }

             synchronized void  consume() throws InterruptedException {
                 while (! available){
                     wait();
                 }
                 System.out.println("Consumed : " + data);
                 available = false;
                 notify();
             }
         }

         Shared sharedObject = new Shared();

         Thread produced = new Thread( () -> {
             for (int i = 1; i <= 100; i++){
                 try {
                     sharedObject.produce(i);
                 }catch (InterruptedException e){
                     throw new RuntimeException(e);
                 }
             }
         }, "produce");

         Thread consumed = new Thread (() -> {
             for (int i = 1; i<= 100; i++){
                 try{
                     sharedObject.consume();
                 }catch (InterruptedException e){
                     throw  new RuntimeException();
                 }
             }
         }, "consumer");

    produced.start();
    consumed.start();
}
}