package _1_coreJava._18_FileHandling._04_serialization;

import java.io.*;

public class Demo2DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("student-details.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student student = (Student) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(student);
    }
}
