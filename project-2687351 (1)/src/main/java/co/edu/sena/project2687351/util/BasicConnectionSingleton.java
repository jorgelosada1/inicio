package co.edu.sena.project2687351.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectionSingleton {
    private static String url = "jdbc:mysql://localhost:3306/my_app?serverTimezone=America/Bogota";
    private static String user = "myapp";
    private static String pass = "d0Tio0jCk1365";
    private static Connection conn;
    public static Connection getInstance() throws SQLException {
        if (conn == null) {conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
}
