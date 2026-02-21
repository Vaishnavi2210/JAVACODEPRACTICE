package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {

        // 1. Download connector .jar file from MySQL connector maven repository add to (file -> project structure -> libraries - add downloded jar from that place)
        // jar files : collection of .class file
        //.class file : contain intermediate code byte code

                try {
                    System.out.println("1. Load and Register the Driver class");
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    System.out.println("2. Establish the connection");
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/youtubejdbc",
                            "root", "root"
                    );

                    System.out.println("3. Create statement object");
                    Statement st = conn.createStatement();

                    System.out.println("4. Execute query");

                    // ✅ Fixed SQL (added closing parenthesis)
                    String sql = "CREATE TABLE IF NOT EXISTS student(" +
                            "id INT PRIMARY KEY, " +
                            "name VARCHAR(50), " +
                            "marks DOUBLE)";

                    st.executeUpdate(sql);
                    System.out.println("Table created successfully");

                    // 5.Close resources
                    System.out.println("Close connection");
                    st.close();
                    conn.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }




    }
}

