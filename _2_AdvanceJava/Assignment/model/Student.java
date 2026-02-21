package _2_AdvanceJava.Assignment.model;

import lombok.Data;
@Data
public class Student {
        private int id;
        private String name;
        private String email;
        private String phone;
        private String course;

        public Student() {}

        // For CREATE
        public Student(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        // For GET / UPDATE / SEARCH
        public Student(int id, String name, String email, String phone) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        // Optional if you use course later
        public Student(int id, String name, String email, String phone, String course) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.course = course;
        }

}
