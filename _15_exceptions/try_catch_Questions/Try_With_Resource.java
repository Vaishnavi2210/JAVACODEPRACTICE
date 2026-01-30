package _15_exceptions.try_catch_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resource {
    public static void main(String[] args) {
        /*
             👉 Read a file using try-with-resources.
             They check:
                 ✔ memory leak knowledge
                 ✔ clean code practices
                 ----->
                 Java 7 se aaya concept hai try-with-resources
Iska kaam:
➡ resource ko automatically close karna
Example resource:
           FileReader, BufferedReader, InputStream, DB Connection
         */

// Problem (OLD way – try-catch-finally)
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        finally {
            try {
                if (br != null) {
                    br.close();   // manual close
                }
            } catch (IOException e) {
                System.out.println("Close failed");
            }
        }

    //    Code (try-with-resources)
//try-with-resources = open + use + close (automatic)
        try (BufferedReader br1 =
                     new BufferedReader(new FileReader("test.txt"))) {

            String line = br1.readLine();
            System.out.println(line);

        } catch (IOException e) {
            System.out.println("File problem");
        }

//Q: finally kyun nahi likha?
//A: try-with-resources internally close() call karta hai










    }
}
