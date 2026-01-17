package _3_classComponents.Methods;

public class Demo6 {
    public static void main(String[] args) {

        Demo6 ref = new Demo6();
        sm();
        Demo6.sm();
        ref.sm();

        ref.im1();
        //this.im1(); // CTE - this is not applicable for static
    }

    public static void sm() {
        System.out.println("Demo6::sm - static method");
    }

    public void im1() {
        System.out.println("Demo6::im1 - instance method");
        this.im2();
        im2();
    }

    public void im2() {
        System.out.println("Demo6::im2 - instance method");
    }

    public static class Demo8 {

            public static void main(String[] args) {
                Demo7.Student student = new Demo7.Student();
                student.id = 101;
                student.name = "bhushan";

                display(student);
                System.out.println("main method");
                System.out.println("student id = " + student.id);
                System.out.println("student name = " + student.name);
            }

            public static void display(Demo7.Student student) {
                student.id = 1;
                student.name = "Rushikesh";
                System.out.println("student id = " + student.id);
                System.out.println("student name = " + student.name);
            }
        }
}
