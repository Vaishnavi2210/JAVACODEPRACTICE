package _8_java_8_features;

public interface Static_Methods {
    default void show(){
        System.out.println("Hello Bhushan");
    }

    // Static method
    public static int add(int a, int b) {
        return a + b;
    }
}
class child implements Static_Methods {
    public static void main(String[] args) {
        Static_Methods sm = new child();
        sm.show();    // default method call using object reference

        Static_Methods.add(10, 20);   // static method call using classname




    }
}