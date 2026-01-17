package _3_classComponents.Assignment1;

public class CourseApp {

    public static void main(String[] args) {
        //call the CourseController methods

        CourseController courseController = new CourseController();

        courseController.create();
        courseController.update();
        courseController.delete();
        courseController.get();

    }
}
