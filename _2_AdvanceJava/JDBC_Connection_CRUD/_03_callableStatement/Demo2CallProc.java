package _2_AdvanceJava.JDBC_Connection_CRUD._03_callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _2_AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos.MysqlConstants.*;

public class Demo2CallProc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

      Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String sqlQuery = "call store.bulk_insert";

        CallableStatement callableStatement = con.prepareCall(sqlQuery);
        callableStatement.execute();

        System.out.println("Procedure executed");

        con.close();
        callableStatement.close();
    }
}
