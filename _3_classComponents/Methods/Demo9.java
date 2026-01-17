package _3_classComponents.Methods;

public class Demo9 {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "bhushan";

        display(student);
        System.out.println("main method");
        System.out.println("student id = " + student.id);
        System.out.println("student name = " + student.name);
    }

    public static void display(Student student) {
        student.id = 1;
        student.name = "Rushikesh";
        System.out.println("student id = " + student.id);
        System.out.println("student name = " + student.name);
    }
}

class Student {
    int id;
    String name;
}
