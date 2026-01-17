package _3_classComponents.Constructor;

public class Demo12 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            //zero parameterized constructor
            Student() {
                id = 101;
                name = "sample name";
            }

            //normal java method and not a constructor
            void Student() {

            }

        }
        //2. zero constructor
        Student s1 = new Student();//call to the zero constructor
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println("Student 1{" + "id=" + s1.id + ", name='" + s1.name + '\'' + '}');
        System.out.println("Student 2{" + "id=" + s2.id + ", name='" + s2.name + '\'' + '}');
        System.out.println("Student 3{" + "id=" + s3.id + ", name='" + s3.name + '\'' + '}');
        System.out.println("Student 4{" + "id=" + s4.id + ", name='" + s4.name + '\'' + '}');
        System.out.println("Student 5{" + "id=" + s5.id + ", name='" + s5.name + '\'' + '}');


    }
}