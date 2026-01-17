package _4_access_specifier.p2;

import _4_access_specifier.p1.A;

public class B {

        public static void main(String[] args) {
            //A in p1 and B in P2
            A a = new A();
            // System.out.println("x="+a.x);//x is private
            //System.out.println("y="a.y); //y is default
            //System.out.println("z="+a.z);// z is protected
            System.out.println("w="+a.w);//w is public
        }
}
