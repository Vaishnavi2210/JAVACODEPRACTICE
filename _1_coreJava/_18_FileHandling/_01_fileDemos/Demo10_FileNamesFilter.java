package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;
import java.io.FilenameFilter;

public class Demo10_FileNamesFilter {
    public static void main(String[] args) {

        File folder = new File("D:\\VaishnavN\\JAVACODEPRACTICE\\_1_coreJava\\_16_multithreading\\Extends_Thread_Class");
        FilenameFilter filter = ((dir, name) -> name.startsWith("T"));

        String[] listOfFileName = folder.list(filter);

        for(String fileName : listOfFileName){
            System.out.println(fileName);
        }
    }
}
