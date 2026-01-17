package _3_classComponents.Assignment1;

public class CourseService {

    CourseDao courseDao = new CourseDao();

    public void create(){
        courseDao.create();
    }

    public void update(){
        courseDao.update();
    }

    public void delete(){
        courseDao.delete();
    }

    public void get(){
        courseDao.get();
    }

}
