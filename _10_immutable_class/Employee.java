package _10_immutable_class;

import java.util.Date;

public final class Employee {

        private final String name;
        private final int id;
        private final Date joiningDate;  // mutable type

        // Constructor initializes all fields
        public Employee(String name, int id, Date joiningDate) {
            this.name = name;
            this.id = id;
            // Defensive copy for mutable object
            this.joiningDate = new Date(joiningDate.getTime());
        }

        // Getters (no setters!)
        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        // Return a copy, not the original
        public Date getJoiningDate() {
            return new Date(joiningDate.getTime());
        }

        // Example usage
        public static void main(String[] args) {
            Date date = new Date();
            Employee emp = new Employee("Alice", 101, date);

            System.out.println(emp.getName());        // Alice
            System.out.println(emp.getId());          // 101
            System.out.println(emp.getJoiningDate()); // current date

            // Trying to modify original date
            date.setTime(0);
            System.out.println(emp.getJoiningDate()); // still original value, not affected
        }
    }

