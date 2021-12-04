package package1;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public static Connection createConnection() throws Exception {
        String url ="jdbc:mysql://localhost:3306/project";
        String uname = "root";
        String password ="password";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,uname,password);
    }
}