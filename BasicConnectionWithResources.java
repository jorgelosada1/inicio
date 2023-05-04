package co.edu.sena.project2687351.util;

import java.sql.*;

public class BasicConnectionWithResources
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/my_app?serve rTimezone=America/Bogota";
        String username = "myapp";
        String password = "d0Tio0jCk1365";
        String sql = "SELECT * FROM my_app.users_tbl";
        try (Connection conn = DriverManager.getConnection(url,
                             username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {

                System.out.println(rs.getString("user_fir stname"));

                        System.out.println(rs.getString("user_las tname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } // end try-catch
    } // main
}
