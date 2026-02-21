package _2_AdvanceJava.JDBC_Connection_CRUD._04_metadata;

import java.sql.*;

import static _2_AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos.MysqlConstants.*;

public class Demo2QueryMetaData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connected to the database");

       Statement statement = connection.createStatement();
       ResultSet resultSet = statement.executeQuery("select * from product");

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        System.out.println("column count = " + resultSetMetaData.getColumnCount());
        System.out.println("table name = " + resultSetMetaData.getTableName(1));
        System.out.println("column name = " + resultSetMetaData.getColumnName(2));


        connection.close();
        System.out.println("Database Connection closed.");
  }
}
