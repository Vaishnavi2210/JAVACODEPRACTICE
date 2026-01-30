package _15_exceptions.try_catch_Questions;

public class Que1_try_catch_finallyflow {

    public static void main(String[] args) {
        try {
            System.out.print("A");
            int x = 10 / 0;
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        } finally {
            System.out.print("D");
        }
    }

//output --> ACD




















    /*
    try {
        System.out.println("A");
        salaryChecker(9000);   // exception here
        System.out.println("B");
    } catch (InvalidSalaryException e) {
        System.out.println("C");
    }
    Output  --> AC




















     */

}
