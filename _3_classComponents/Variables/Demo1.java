package _3_classComponents.Variables;

public class Demo1 {

    public static void main(String[] args) {
        //args is also local variable
        int number;//local variable - declaration
        //System.out.println(number);//CTE : value must be provided to local variable before it is used.
        number = 100; //initialization
        System.out.println(number);//access it directly
        //
        display();
    }

    public static void display() {
        //System.out.println(number); //CTE : as number is defined in another method
        int number = 200;
        System.out.println(number);
    }
}
