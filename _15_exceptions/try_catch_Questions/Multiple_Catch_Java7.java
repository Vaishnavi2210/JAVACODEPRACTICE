package _15_exceptions.try_catch_Questions;

public class Multiple_Catch_Java7 {
    public static void main(String[] args) {


        try {
            int x = Integer.parseInt("abc");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Exception");
        }

    }
}