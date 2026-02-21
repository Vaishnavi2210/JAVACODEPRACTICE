package _1_coreJava._18_FileHandling._02_byteStreams;

import java.io.*;

public class Demo2ReadFromBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);

        int value = bis.read();
        while (value != -1) {
            System.out.println((char) value);
            value = bis.read();
        }
        bis.close();
        fis.close();

    }
}
