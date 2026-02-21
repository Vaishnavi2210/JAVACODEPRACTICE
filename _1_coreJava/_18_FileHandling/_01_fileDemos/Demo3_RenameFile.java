package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;

public class Demo3_RenameFile {
    public static void main(String[] args) {
        //file class object does not create the file
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\simple.txt");
        file.renameTo(new File("C:\\Users\\Admin\\IdeaProjects\\Advance.txt"));
        System.out.println("file renamed");
    }
}