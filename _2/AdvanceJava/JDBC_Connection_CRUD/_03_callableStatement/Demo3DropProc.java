package _2.AdvanceJava.JDBC_Connection_CRUD._03_callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static _2.AdvanceJava.JDBC_Connection_CRUD._02_preparedStatementDemos.MysqlConstants.*;

public class Demo3DropProc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        String sqlQuery = "drop procedure store.bulk_insert";
        CallableStatement callableStatement = con.prepareCall(sqlQuery);
        callableStatement.execute();

        con.close();
        System.out.println("procedure dropped");

    }
}
