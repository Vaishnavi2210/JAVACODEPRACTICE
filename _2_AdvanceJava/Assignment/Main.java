package _2_AdvanceJava.Assignment;

import _2_AdvanceJava.Assignment.dao.StudentDAO;
import _2_AdvanceJava.Assignment.model.Student;

import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Admission Form ===");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Get All Students");
            System.out.println("5. Get Student By ID");
            System.out.println("6. Search Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: // CREATE
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    studentDAO.createStudent(new Student(name, email, phone));
                    break;

                case 2: // UPDATE
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();

                    System.out.print("Enter new phone: ");
                    String newPhone = sc.nextLine();

                    studentDAO.updateStudent(new Student(uid, newName, newEmail, newPhone));
                    break;

                case 3: // DELETE
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    studentDAO.deleteStudent(did);
                    break;

                case 4: // GET ALL
                    List<Student> list = studentDAO.getAllStudents();
                    if (list.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        list.forEach(s ->
                                System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " | " + s.getPhone())
                        );
                    }
                    break;

                case 5: // GET BY ID
                    System.out.print("Enter ID: ");
                    int gid = sc.nextInt();
                    sc.nextLine();

                    Student s = studentDAO.getStudentById(gid);
                    if (s != null) {
                        System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " | " + s.getPhone());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6: // SEARCH
                    System.out.print("Enter keyword (name/email/phone): ");
                    String key = sc.nextLine();

                    List<Student> results = studentDAO.search(key);
                    if (results.isEmpty()) {
                        System.out.println("No matching records found.");
                    } else {
                        results.forEach(st ->
                                System.out.println(st.getId() + " | " + st.getName() + " | " + st.getEmail() + " | " + st.getPhone())
                        );
                    }
                    break;

                case 0:
                    System.out.println("Exiting... Bye 👋");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}