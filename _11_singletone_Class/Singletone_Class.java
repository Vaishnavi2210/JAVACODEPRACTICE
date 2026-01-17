package _11_singletone_Class;

public class Singletone_Class {
    // step 1: Create private Constructor to prevent object creation outside class

    private Singletone_Class() {
    }

    // step 2: Create static instance variable to hold the single object
    private static final Singletone_Class INSTANCE = new Singletone_Class();

    // step 3: Provide static method which returns single and same instance
    public static synchronized Singletone_Class getInstance() {
        return INSTANCE;
    }
    }

 /*   public class Demo {
        public static void main(String[] args) {
            Singleton obj1 = Singleton.getInstance();
            Singleton obj2 = Singleton.getInstance();

            System.out.println(obj1 == obj2); // ✅ true (same instance)
        }
    }
*/

// How to break Singleton Class
//--> using Reflection - ConstruAccessible(true)
//--> Serialization Creates new object
//--> Clonning breaks singleton - override clone method


/*Why Use Singleton?

- Logging
- Configuration settings
- Database connections
- Caching
- Thread pools
*/