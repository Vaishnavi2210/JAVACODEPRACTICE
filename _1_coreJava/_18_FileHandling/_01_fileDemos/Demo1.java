package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //file class object does not create the file
        File file = new File("abc.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println("file is created, =" + isFileCreated);
    }
}
