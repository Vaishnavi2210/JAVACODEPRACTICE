package _7_object_Class;

public class Equals_Method {
    public static void main(String[] args) {

   /*  equals() method - public boolean equals(java.lang.Object)
                         It does reference check and not the object content.
                         If two references are pointing to the same object, then equals method returns true.

                         Equals and hashCode contract
                         If two references are equal by equals method, then there hashCode must be same and vice-versa
                         It is recommended to override both equals and hashCode or none.


       public boolean equals(Object obj){
         return this == obj;              // reference check
       }
     */

        class A {
        }

        A ref1 = new A();
        A ref2 = new A();

         // 1. Primitive comparison (==)  - it checks values
        System.out.println(10 == 10); //true
        System.out.println(10 == 20); //false

        // 2. Object comparison (==)  - it checks reference(Memory address)compare
        System.out.println(ref1 == ref2); // false

        // 3.equals() method (default in Object class)
        System.out.println(ref1.equals(ref2));  // false -- - Class A is not override .equals()
                                                // Default implementation also doing reference comparison. (same as ==)

        // 4. Reference assignment
        ref1 = ref2;                        // now ref1 and ref2 point to same object means both memory object is same.
        System.out.println(ref1.equals(ref2));   // true   -- returns true
    }
}