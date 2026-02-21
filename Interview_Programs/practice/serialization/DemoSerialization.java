package Interview_Programs.practice.serialization;

import java.io.*;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {

       Student student = new Student();
       student.setId(1);
       student.setName("Gayu");
       student.setUsername("Admin");
       student.setPassword("Admin");

       File file = new File("Serialized-File");
       file.createNewFile();
       FileOutputStream fos = new FileOutputStream(file);
       ObjectOutputStream oos = new ObjectOutputStream(fos);

       oos.writeObject(student);
       oos.close();
       fos.close();
        System.out.println("Student Object Saved");
    }
}
