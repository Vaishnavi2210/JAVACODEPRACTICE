package Interview_Programs.practice;

public class Swap_two_numbers_without_using_third_variable {
    public static void main(String[] args) {

        int a = 10, b = 5;

        a = a+b;
        b = a - b;
        a = a - b;

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        int x = 15,  y = 20;

        x = x^y;
        y = x^y;
        x = y^x;

        System.out.println("x : "+ x);
        System.out.println("y : "+ y);
    }
}
