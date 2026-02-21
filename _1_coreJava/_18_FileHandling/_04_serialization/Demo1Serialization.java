package _1_coreJava._18_FileHandling._04_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1Serialization {
    public static void main(String[] args) throws IOException {

        Student student = new Student();
        student.setId(101);
        student.setName("Vaishnavi");
        student.setUsername("admin");
        student.setPassword("admin");

        File file = new File("student-details.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);
        oos.close();
        fos.close();
        System.out.println("Student object saved.");

    }
}
