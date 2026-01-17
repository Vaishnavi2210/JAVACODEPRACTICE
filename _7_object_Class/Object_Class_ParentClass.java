package _7_object_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Object_Class_ParentClass {
    /* Object Class - it is a predifine concrete class present in java.lang package
                    - Object class is directly indirectly super/Parent class for all classes in java.
                    - This is also called as consmic class as it does not have further parent class.
                    - We don't need to specify the inheritance using extends Object explicitly.
                    - Every class needs certain method which is available in java -
                    - Object class contains 11 methods which are available to all classes in java
                    - Interfaces do not inherit from object class

    - defines several fundamental methods like toString(),
      equals(), hashCode(), clone(), getClass(), wait(), notify(), and notifyAll().
      Every class in Java inherits these methods.
    */

    public static void main(String[] args) {
        class A {
        }
        // A is child class of Object class
        A ref = new A();

        Object ref1 = new A();
        Class referenceToClassTypeObject = ref.getClass();
        String name = referenceToClassTypeObject.getName();

        Field[] fields = referenceToClassTypeObject.getFields();
        Method[] methods = referenceToClassTypeObject.getMethods();
        Constructor[] declaredConstructors = referenceToClassTypeObject.getDeclaredConstructors();

        System.out.println(name);
    }

    //  getClass() method - public final native Class<?>getClass();

    //public final native class getClass();



}
