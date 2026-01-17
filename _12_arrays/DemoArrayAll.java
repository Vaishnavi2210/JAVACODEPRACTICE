package _12_arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayAll {

        // Student class
        static class Student {
            String name;
            int age;

            // Constructor
            Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Override toString for meaningful output
            @Override
            public String toString() {
                return "Student{name='" + name + "', age=" + age + "}";
            }
        }

        public static void main(String[] args) {
            // -------------------------------
            // 1. Arrays
            // -------------------------------
            int[] arr = {10, 20, 30, 40, 50};

            // Access values
            System.out.println("First element: " + arr[0]);
            System.out.println("Third element: " + arr[2]);
            System.out.println("Last element: " + arr[arr.length - 1]);

            // Print entire array
            System.out.println("Array contents: " + Arrays.toString(arr));

            // Loop through array
            System.out.println("Looping through array:");
            for (int num : arr) {
                System.out.println(num);
            }

            // -------------------------------
            // 2. Student Object
            // -------------------------------
            Student s1 = new Student("Alice", 20);
            Student s2 = new Student("Bob", 22);

            System.out.println("Single student object:");
            System.out.println(s1); // calls toString()

            // -------------------------------
            // 3. ArrayList of Students
            // -------------------------------
            ArrayList<Student> students = new ArrayList<>();
            students.add(s1);
            students.add(s2);
            students.add(new Student("Charlie", 19));

            System.out.println("ArrayList of students:");
            for (Student s : students) {
                System.out.println(s); // prints each student
            }
        }
    }