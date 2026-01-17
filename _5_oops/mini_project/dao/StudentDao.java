package _5_oops.mini_project.dao;

import _5_oops.mini_project.model.Student;

public class StudentDao {

    public void addStudent(Student student){
        System.out.println("Student added Successfully.");
    }

    public void updateStudent(Student student){
        System.out.println("Student updated Successfully.");
    }


    public void deleteStudent(int studentId){
        System.out.println("Student deleted Successfully.");
    }

}
