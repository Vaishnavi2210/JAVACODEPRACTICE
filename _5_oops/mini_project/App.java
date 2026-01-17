package _5_oops.mini_project;

import _5_oops.mini_project.controller.StudentController;
import _5_oops.mini_project.model.Student;

public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();



            Student student = new Student();
        student.setId(101);
        student.setFirstName("Vaishnavi");
        student.setLastName("Nerkar");
        student.setEmail("vaish123@gmail.com");
        student.setMo_no("9675442121");
        student.setAge(25);

        studentController.addStudent(student);
        studentController.updateStudent(student);
        studentController.deleteStudent(101);

    }

}