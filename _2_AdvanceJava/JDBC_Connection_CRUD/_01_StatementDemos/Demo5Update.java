package _2_AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");

        Statement statement = con.createStatement();

        String Query = "UPDATE product SET name = 'Camera 369' WHERE id = 1";

        System.out.println(" row updated successfully ");

        statement.executeUpdate(Query);

        con.close();
        statement.close();
    }
}
