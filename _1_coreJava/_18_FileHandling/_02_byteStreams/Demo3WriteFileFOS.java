package _1_coreJava._18_FileHandling._02_byteStreams;

import java.io.*;

public class Demo3WriteFileFOS {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileOutputStream fos = new FileOutputStream(file, true);

        fos.write('A');
        fos.close();
        System.out.println("Written to a file");
    }
}