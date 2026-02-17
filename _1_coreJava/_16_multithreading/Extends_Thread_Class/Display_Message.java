package _1_coreJava._16_multithreading.Extends_Thread_Class;

public class Display_Message implements Runnable{

    private String message;

    public Display_Message(String message){
        this.message = message;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(message);
        }
    }
}
