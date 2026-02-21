package com.itShaala.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import static constants.MyConstant.*;

public class ConnectionUtil {
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
        return connection;


    }
}
