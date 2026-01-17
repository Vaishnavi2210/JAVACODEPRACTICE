package _3_classComponents.Assignment1;

public class CourseController {

    CourseService courseService = new CourseService();

    public void create(){
        courseService.create();
    }

    public void update(){
        courseService.update();
    }

    public void delete(){
        courseService.delete();
    }

    public void get(){
        courseService.get();
    }
}
