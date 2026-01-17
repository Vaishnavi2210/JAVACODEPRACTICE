package _5_oops.anonymous_class;

public interface Interface_AnonymousClass {

    void m1();

    default void m2() {
        System.out.println("m2()");
    }

    public static void main(String[] args) {
       Interface_AnonymousClass a = new Interface_AnonymousClass() {
           public void m1() {
               System.out.println("Hello World");
           }
       };
       a.m1();
    }
}
