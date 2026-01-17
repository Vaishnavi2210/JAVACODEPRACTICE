package _7_object_Class;

public class Get_Class_Method {
    public static void main(String[] args) {
        // getClass() is a method defined in the Object class (the root of all classes in Java).
        // - It returns the runtime class of the object — i.e., the actual class type of the object instance.
        String str = "Hello";   // String object
        Integer num = 42;   // Integer object

        // getClass() returns the runtime class
        System.out.println(str.getClass());  // class java.lang.String
        System.out.println(num.getClass()); // class java.lang.Integer

        // You can also compare classes
        if(str.getClass() == String.class){
            System.out.println("str is a String");
        }

        Object obj = new java.util.Date();   // - Here we are creating a new Date object from the java.util package.

        // getClass() gives the runtime class of the object
        Class<?> clazz = obj.getClass();  // Class<?> means “a reference to some class type, but we don’t know exactly which one at compile time.”

        System.out.println("Class name: " + clazz.getName()); // java.util.Date
        // - clazz.getName() returns the fully qualified name of the class (package + class name).

    }
}
