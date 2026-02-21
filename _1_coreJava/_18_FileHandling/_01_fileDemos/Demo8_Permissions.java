package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo8_Permissions {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Snake.txt");
        file.createNewFile();
        boolean setWritable = file.setWritable(true);
        System.out.println("File is now read only = "+ setWritable );

    }
}
