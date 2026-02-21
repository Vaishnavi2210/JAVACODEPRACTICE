package _1_coreJava._18_FileHandling._02_byteStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1ReadFromFile {

    public static void main(String[] args) throws IOException {
        File file = new File("VDN.txt");
       // file.createNewFile();
        FileInputStream fis = new FileInputStream(file);

        int value = fis.read();
        while (value != -1){
            System.out.println((char) value);
            value = fis.read();
        }
        fis.close();

    }
}
