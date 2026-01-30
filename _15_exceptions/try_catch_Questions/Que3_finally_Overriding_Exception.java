package _15_exceptions.try_catch_Questions;

public class Que3_finally_Overriding_Exception {
    public static void main(String[] args) {


        try {
            throw new RuntimeException("Error");
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("Finally");
        }
    }
}