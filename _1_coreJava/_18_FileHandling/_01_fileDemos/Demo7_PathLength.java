package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;

public class Demo7_PathLength {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Loan.txt");
        file.delete();
        System.out.println("file path = " + file.getAbsolutePath());
        System.out.println("file size = " + file.length());  // no of character
    }
}
