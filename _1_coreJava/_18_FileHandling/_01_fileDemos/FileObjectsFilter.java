package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;
import java.io.FileFilter;

public class FileObjectsFilter {
    public static void main(String[] args) {

        File folder = new File("D:\\VaishnavN\\JAVACODEPRACTICE\\_1_coreJava\\_16_multithreading\\Extends_Thread_Class");
        FileFilter filter = x -> x.length() > 500;

        File[] listOfFileObject = folder.listFiles(filter);
        for (File file : listOfFileObject){
            System.out.println(file.getName() + "\t" + file.length());
        }
    }
}
