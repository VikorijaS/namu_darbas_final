package vcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by cb-vice on 2016.10.26.
 */
public class VcsDbUtils {

    public static Connection connect(String dbName) throws SQLException {
        // url points to jdbc protocol : mysql subprotocol; localhost is the address
        // of the server where we installed our DBMS (i.e. on local machine) and
        // 3306 is the port on which we need to contact our DBMS
        String url = "jdbc:mysql://localhost:3306/";
        // String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url + dbName, userName, password);
        VcsUtils.println("prisijungiam prie " + url + dbName);
        return conn;
    }

    public static void disconnect (Connection conn) throws SQLException {

        conn.close();
        VcsUtils.println("Atsijungeme nuo Db");
    }

}
