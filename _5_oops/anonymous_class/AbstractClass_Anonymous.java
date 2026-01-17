package _5_oops.anonymous_class;

abstract class AbstractClass_Anonymous {

    abstract void m1();

    public static void main(String[] args) {

        AbstractClass_Anonymous aa = new AbstractClass_Anonymous() {
            @Override
            void m1() {
                System.out.println("Hello");
            }

        };
        aa.m1();
    }
}

