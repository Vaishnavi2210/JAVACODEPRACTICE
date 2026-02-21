package Interview_Programs.practice.serialization;

import java.io.*;

public class DemoDeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("Serialized-File");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(student);
    }
}
