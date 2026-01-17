package _7_object_Class;

public class Demo_HashCode {
    public static void main(String[] args) {

        class A{
        }

        A ref1 = new A();
        System.out.println(ref1.hashCode()); //1595428806 ----> object address

        System.out.println(Integer.toHexString(ref1.hashCode()));
    }
}
