package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData_UsingPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            // load and register Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306:youtubejdbc",
                                                          "root", "root");

            // create Preparedstatement object
            String sql3 = "Insert into student(id, name, marks) values(?, ?, ?)";
            PreparedStatement pt = con.prepareStatement(sql3);

            // Insert first student
            pt.setInt(1, 1);
            pt.setString(2, "Kunal");
            pt.setDouble(3, 95);
            pt.executeUpdate();

            // Insert first student
            pt.setInt(1, 2);
            pt.setString(2, "Tejas");
            pt.setDouble(3, 80);
            pt.executeUpdate();

            System.out.println("Data inserted successfully using PreparedStatement");

            // close resources
            pt.close();
            con.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
