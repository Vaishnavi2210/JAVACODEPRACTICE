package _2.AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DDL_5_TRUNCATE {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

             Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr",
                                                           "root", "root");

             String sql = "TRUNCATE TABLE employees";
             PreparedStatement preparedStatement = con.prepareStatement(sql);

             preparedStatement.executeUpdate();

             con.close();
             preparedStatement.close();

            System.out.println("table truncated successfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
