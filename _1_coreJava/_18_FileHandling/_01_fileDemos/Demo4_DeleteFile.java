package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo4_DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\HelloWorld.txt");
           boolean isFileCreated = file.createNewFile();
        System.out.println("file created : "+ isFileCreated);
          boolean isFileDeleted = file.delete();
        System.out.println("file deleted = "+ isFileDeleted);
    }
}
