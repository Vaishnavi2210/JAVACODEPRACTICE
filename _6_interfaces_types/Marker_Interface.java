package _6_interfaces_types;

import java.io.Serializable;

public class Marker_Interface {
    //No methods inside it.(Market Interface is a special purpose interface)
    // Used to mark a class so JVM provides special behaviour.
   //Eg. Serializable(java.io), Cloneable(java.lang), RandomAccess(java.util)

    /*
       1.Serializable Interface - (java.io) package
         // serializable interface - used to convert an object into a byte stream
        // so it can be :  saved to file. sent over network, stored in database
        // use case : File storage, Network Communication, Caching
        // if class does not implement Serializable -> NotSerializableException
     */
    class Students implements Serializable {
       int id;
       String name;
    }

    /*
         2. Clonabble Interface - (java.lang) package
         -  Used to create an exact copy of object.
         - Use - Object duplication ,  Avoid creating object again using constructor.
          // If a class does not implement Cloneable -> CloneNotSupportException
     */
   /* class Employee implements Cloneable{
        int idd;

        protected object clone() throws CloneNotSupportException, CloneNotSupportedException {
            return super.clone();
        }

        Employee e = new Employee();
    }
*/


}
