package _4_access_specifier.p1;

public class Demo {
    public static void main(String[] args) {
        // different class
        // both A and Demo1 are in package p1
        A a = new A();
        //System.out.println("x=" + a.x);//x is private
        System.out.println("y=" + a.y); //y is default
        System.out.println("z=" + a.z);// z is protected
        System.out.println("w="+a.w);//w is public
    }
}
