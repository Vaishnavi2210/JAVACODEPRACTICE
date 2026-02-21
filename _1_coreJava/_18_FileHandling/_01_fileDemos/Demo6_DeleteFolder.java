package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;

public class Demo6_DeleteFolder {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\Admin\\IdeaProjects\\document-handling");
        boolean isFolderCreated = folder.mkdir();
        System.out.println("Folder Created : "+isFolderCreated);

        boolean isFolderDeleted = folder.delete();
        System.out.println("Folder is deleted : "+ isFolderDeleted);



    }
}
