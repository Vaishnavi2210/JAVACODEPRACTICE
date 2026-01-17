package _5_oops.mini_project.controller;

import _5_oops.mini_project.model.Student;
import _5_oops.mini_project.service.StudentService;
import _5_oops.mini_project.service.StudentServiceImpl;

public class StudentController {

    StudentService studentService = new StudentServiceImpl();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void updateStudent(Student student){
        studentService.updateStudent(student);
    }
    public void deleteStudent(int studentId){
        studentService.deleteStudent(studentId);
    }
}
