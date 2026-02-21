package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_data_UsingStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            // Load and register Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // establish Connection - // Connect to database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtubejdbc",
                    "root", "root");

            // create statement object
            Statement st = con.createStatement();

            // execute query ->  // Insert data into student table
            String sql1 = "INSERT INTO student(Id, name, marks) VALUES(1, 'Jay', 99.99)";
            String sql2 = "insert into student(Id, name, marks) values(2, 'Gayatri', 99.90)";

            st.executeUpdate(sql1);
            st.executeUpdate(sql2);

            System.out.println("Data inserted successfully");

            // close resources connection
            st.close();
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
