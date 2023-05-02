package co.edu.sena.project2687351.util;

public class DBConnection {
    private static final String URL =
            "jdbc:mysql://127.0.0.1:3306/?user=root";
    private static final String USER = "my_app_user";
    private static final String PASS = "my_app_password";
    private static BasicDataSource pool;
    public static  BasicDataSource getInstance() throws SQLException {
        if (pool = null){
            pool = new BsicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }
    Public static connection getConnection() throws SQLException {
        Return getInstance(). getConnection ();
    }
}
