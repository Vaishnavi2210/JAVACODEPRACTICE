package _4_access_specifier.p1;

public class A {

        private int x = 1;  // private variable
        int y = 2;          // default variable
        protected int z = 3; // protected variable
        public int w = 4;    // public variable

    public A(int i, int i1) {
    }

    public A() {

    }


    public static void main(String[] args) {
            //same class
            A a = new A();
            System.out.println("x=" + a.x);//x is private
            System.out.println("y=" + a.y); //y is default
            System.out.println("z=" + a.z);// z is protected
            System.out.println("w="+a.w);//w is public
        }
    }

