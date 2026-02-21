package _1_coreJava._18_FileHandling._03_charStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1ReadFromFile {
    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        int value = fileReader.read();

        while (value != -1){
            System.out.println((char) value);
            value = fileReader.read();
        }

        fileReader.close();
    }
}
