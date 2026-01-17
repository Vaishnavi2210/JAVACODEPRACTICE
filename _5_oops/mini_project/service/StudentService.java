package _5_oops.mini_project.service;

import _5_oops.mini_project.model.Student;

public interface StudentService {

     void addStudent(Student student);

     void updateStudent(Student student);

    void deleteStudent(int studentId);
}
