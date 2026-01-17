package _7_object_Class;

public class To_String_method {
    public static void main(String[] args) {
        // public String toString()  --> give output with -> pacakgename,classname and hexadecimal hashcode
        /* toString() - It returns a String value which is generated using
                        getClass().getName() & converting hashCode into hexadecimal

         It is always recommended to override the toString() method
         toString() gets called implicitly whenever we try to print a reference.
         */

        class A {
        }

        A ref =  new A();
        System.out.println(" toString() method output : "+ref.toString());
                                // output : object_Class.To_String_method$1A@5f184fc6

        System.out.println(ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode()));
        System.out.println(ref.toString());   // -- it is implicitly call
        System.out.println(ref);              // -- not required to call explicitly
        ref.equals(null);
    }
}

 /*

        public boolean equals(Object obj) {
                return this == obj;
         }

        * */