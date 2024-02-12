package jm.task.core.jdbc.util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Util {

    private final static String USER_NAME = "root";
    private final static String USER_PASS = "8661";
    private final static String CONNECTION_URL = "jdbc:mysql://localhost:3306/katapp";


    public static Connection getSQLConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_URL, USER_NAME, USER_PASS);
    }
}

