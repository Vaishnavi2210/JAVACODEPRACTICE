package _7_object_Class;

public class Clone_Method {
    public static void main(String[] args) {

        // Public native java.lang.Object clone()
        /*
            clone() method - The method used to create new object using existing object.
            Types - Shallow Copy ,  Deep Copy
         */
        //
        int a = 10;
        int b = a;

        class Student{
        }

        Student s1 = new Student();
        Student s2 = s1; //reference copy. s2 will point to an object where s1 is pointing
    }
}
