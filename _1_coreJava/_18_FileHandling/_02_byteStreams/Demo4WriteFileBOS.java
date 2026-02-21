package _1_coreJava._18_FileHandling._02_byteStreams;

import java.io.*;

public class Demo4WriteFileBOS {
    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
BufferedOutputStream bos = new BufferedOutputStream(fos);

bos.write('A');
bos.close();
fos.close();
        System.out.println("Written to a file");


    }
}
