package _2_AdvanceJava.JDBC_Connection_CRUD._01_StatementDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4InsertIntoTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "root");
        Statement statement = con.createStatement();

        String sqlQuery = "INSERT INTO product(name, price) VALUES" +
                "           ('camera', 35000), "+
                           "('Mobile', 20000), "  +
                           "('Projector', 300000)";
        statement.execute(sqlQuery);

        System.out.println(" row inserted sucessfully ");

        con.close();
        statement.close();
    }
}
