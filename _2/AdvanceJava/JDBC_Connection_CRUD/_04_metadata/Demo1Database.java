package _2.AdvanceJava.JDBC_Connection_CRUD._04_metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos.MysqlConstants.*;

public class Demo1Database {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        System.out.println("Connected to the database");

        DatabaseMetaData databaseMetaData = con.getMetaData();
        System.out.println(databaseMetaData.getDriverName());
        System.out.println(databaseMetaData.getMaxConnections());
        System.out.println(databaseMetaData.getUserName());

        con.close();
        System.out.println("Database connection close");


    }
}
