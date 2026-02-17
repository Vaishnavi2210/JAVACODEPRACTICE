package _1_coreJava._3_classComponents.Constructor;

public class Constructor_Overloading {

        Constructor_Overloading(){
            System.out.println("  Constructor ");
        }

        Constructor_Overloading(int a){
            System.out.println(" Parameterized Constructor 1 ");
        }

        Constructor_Overloading(int a, int b){
            System.out.println(" Parameterized constructor 2 ");
        }

    public static void main(String[] args) {
        Constructor_Overloading co = new Constructor_Overloading(10, 20);
    }
}
