package _1_coreJava._18_FileHandling._03_charStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4WriteFileBW {
    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter  bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("written using bufferedWriter");
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Written to a file");
    }
}
