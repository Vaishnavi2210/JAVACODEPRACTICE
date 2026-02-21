package _1_coreJava._18_FileHandling._03_charStreams;

import java.io.*;

public class Demo2ReadFromBuffer {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int value = bufferedReader.read();
        while (value != -1){
            System.out.println((char) value);
            value = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();

    }
}
