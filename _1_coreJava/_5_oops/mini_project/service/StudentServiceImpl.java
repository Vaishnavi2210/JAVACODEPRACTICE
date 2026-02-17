package _1_coreJava._5_oops.mini_project.service;

import _1_coreJava._5_oops.mini_project.dao.StudentDao;
import _1_coreJava._5_oops.mini_project.model.Student;

public class StudentServiceImpl implements StudentService{

    StudentDao studentDao = new StudentDao();

    @Override
    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

   @Override
   public void updateStudent(Student student){
        studentDao.updateStudent(student);
   }

    @Override
    public void deleteStudent(int studentId){
        studentDao.deleteStudent(studentId);
    }
}
