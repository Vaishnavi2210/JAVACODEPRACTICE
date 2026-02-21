package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;

public class Demo9_FileNames {
    public static void main(String[] args) {

        File folder = new File("D:\\VaishnavN\\JAVACODEPRACTICE\\_1_coreJava\\_16_multithreading\\Extends_Thread_Class");
        String[] listOfFileNmaes = folder.list();

        for (String fileName : listOfFileNmaes){
            System.out.println(fileName);
        }

    }
}
