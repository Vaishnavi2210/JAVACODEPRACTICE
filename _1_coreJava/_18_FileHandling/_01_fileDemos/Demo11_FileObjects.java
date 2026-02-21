package _1_coreJava._18_FileHandling._01_fileDemos;

import java.io.File;

public class Demo11_FileObjects {
    public static void main(String[] args) {
        File folder = new File("D:\\VaishnavN\\JAVACODEPRACTICE\\_1_coreJava\\_16_multithreading\\Extends_Thread_Class");
        File[] listOfFileObject = folder.listFiles();

        for(File file : listOfFileObject){
            System.out.println(file.getName()+"\t"+file.length());
        }
    }
}
