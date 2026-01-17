package _5_oops.inheritance;

public class Demo6 {
    public static void main(String[] args) {
        //Hybrid --multiple inheritance + any other inheritance
        interface I1{}
        interface I2{}

        interface I3 extends I1, I2{}
        class A implements I1, I2{}

        class B extends A{}
        class C extends A{}
        class D extends A{}
        class E extends A{}

        //01. one class can extend only one another class
        //02. one interface can extend any number of interfaces
        //03. one class can implement any number of interfaces.

    }
}
