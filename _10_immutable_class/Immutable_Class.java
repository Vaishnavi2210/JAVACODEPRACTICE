package _10_immutable_class;

public class Immutable_Class {
    //immutable class --> 1.final class, 2. private final fields, 3. no setters
    public static void main(String[] args) {


        final class Student {
            // make the class final, declare variable private final, initialized fields with constructor only
            // Return the copies of mutable class ()

            final private int id;
            final private String name;
            final private String address;

            // Constructor initializes all fields
            Student(int id, String name, String address) {
                this.id = id;
                this.name = name;
                this.address = address;
            }

            // Getters (no Setters!)
            public int getId() {
                return id;
            }

            public String getName(){
                return name;
            }
        }

        Student student = new Student(1, "Jay", "Pune");
    }
}
