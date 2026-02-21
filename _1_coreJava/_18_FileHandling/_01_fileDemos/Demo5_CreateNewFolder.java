package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;

public class Demo5_CreateNewFolder {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\Admin\\IdeaProjects\\file-handling-temp");
        boolean isFolderCreated = folder.mkdir();
        System.out.println("folder created : "+ isFolderCreated);
    }
}