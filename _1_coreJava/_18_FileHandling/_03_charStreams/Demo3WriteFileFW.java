package _1_coreJava._18_FileHandling._03_charStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3WriteFileFW {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("Written using FileWriter");
        fileWriter.close();
        System.out.println("written to a file");
    }
}
