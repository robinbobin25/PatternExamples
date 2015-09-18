package patterns.Singleton;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Antonina_Mykhailenko on 16.09.2015.
 */
public final class DBConnection {
    private static Connection conn = null;
    private DBConnection(){}

    public static DBConnection getSafeConnection(){
        try {
            if(conn == null || conn.isClosed())
                return new DBConnection();
        } catch (SQLException e) {
            System.out.println("Connection already exists");
            e.printStackTrace();
        }
        return null;
    }
}
