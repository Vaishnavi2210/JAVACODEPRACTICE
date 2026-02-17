package _2.AdvanceJava.JDBC_Connection_CRUD._03_callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos.MysqlConstants.*;

public class Demo1CreateProc {
/*
        A CallableStatement in Java is a type of JDBC statement
        used to execute stored procedures in a database.
        Unlike Statement or PreparedStatement, which run SQL queries directly,
        CallableStatement specifically interacts with predefined procedures stored in the database.
Purpose:
To call stored procedures from Java code.
Can handle input parameters, output parameters, or both.

Syntax to create a CallableStatement:
CallableStatement cs = connection.prepareCall("{call procedure_name(?, ?)}");
 */
public static void main(String[] args) throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

    String sqlQuery = "create procedure bulk_insert()\n" +
            "begin\n"+
            "insert into product(name, price) values('dumm1', 100);"+
            "insert into product(name, price) values('dumm2', 100);"+
            "insert into product(name, price) values('dumm3', 100);"+
            "insert into product(name, price) values('dumm4', 100);"+
            "end";

    CallableStatement callableStatement = con.prepareCall(sqlQuery);
    callableStatement.execute();

    con.close();
    System.out.println("procedure created");

}

}
