package _3_classComponents.Constructor;

public class Demo {

     static class Student {
        int id;       // instance variable
        String name;  // instance variable
        static String SchoolName;

        Student(int id, String name, String schoolName) {
            this.id = id;
            this.name = name;
            Student.SchoolName = schoolName;
        }
    }
    public static void main(String[] args) {
        int exam_id = 111;
          Student s = new Student(1, "Vaish", "Infosys");

          System.out.println(s.id);          // Instance Variable
          System.out.println(s.name);        // Instance Variable
          System.out.println(Student.SchoolName);    // static variable
            System.out.println(exam_id);
        }
    }

    /*
     1. JVM memory me new object create karta hai

     2. Heap me space allocate hoti hai for id and name

     3. Constructor call hota hai: Student(101, "Vaishnavi")

     4. Local variables id = 101, name = "Vaishnavi"

     5. Constructor code execute hota hai:

      this.id = id;       // s.id = 101
      this.name = name;   // s.name = "Vaishnavi"
     **  this.id = object variable, id = stack variable

     6. Constructor finish → local variables id & name destroy ho jaate hain

     7. Object s ab ready, instance variables initialized

   Q) What happens if you don’t use this?
   => id = id; // only assigns local variable to itself

     */

