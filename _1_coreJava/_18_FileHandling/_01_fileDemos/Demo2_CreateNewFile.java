package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

// The File class(object) does not create the file. It only represents a file path.
//The actual file is created by the operating system when createNewFile() is called.
public class Demo2_CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\simple.txt");
        boolean isfileCreated = file.createNewFile();

        System.out.println("File Created : " + isfileCreated);
    }

}
