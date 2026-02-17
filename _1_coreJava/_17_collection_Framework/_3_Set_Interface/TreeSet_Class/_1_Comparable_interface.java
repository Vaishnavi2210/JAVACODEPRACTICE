package _1_coreJava._17_collection_Framework._3_Set_Interface.TreeSet_Class;

import java.util.*;

public class _1_Comparable_interface {
    public static void main(String[] args) {

        // The Comparable interface in Java is used to define the natural ordering of objects.
        // java.lang.Comparable<T>

    /*
      Why do we use Comparable?
     -->  When you want to sort objects of a custom class (like Employee, Student, Product), Java must know how to compare them.
          The Comparable interface allows a class to compare its own objects.

      Method in Comparable
           public int compareTo(T obj);

      How compareTo() works
  It returns:
      Negative number → current object is smaller
      Zero → both objects are equal
      Positive number → current object is greater

  Real Example:
     String class implements Comparable (sorted alphabetically)
     Integer implements Comparable (sorted numerically)

    Comparable vs Comparator
      Comparable	       Comparator
     Inside class	     Outside class
  Single sorting logic	 Multiple sorting logics
     compareTo()	       compare()

     */

        class Employee implements Comparable<Employee> {
            int id;
            String name;

            Employee(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int compareTo(Employee e) {
                return this.id - e.id;    // sorting by id
               // return Integer.compare(this.id, e.id);
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
            Set<Employee> treeSet = new TreeSet<>();

            Employee employee1 = new Employee(1, "Vaishnavi");
            Employee employee2 = new Employee(2, "Gayatri");
            Employee employee3 = new Employee(3, "Jaydeep");

        System.out.println(treeSet.add(employee1));
        System.out.println(treeSet.add(employee2));
        System.out.println(treeSet.add(employee3));

        System.out.println(treeSet);


    }
}