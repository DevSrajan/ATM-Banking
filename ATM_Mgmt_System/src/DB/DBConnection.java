
package DB;
import java.sql.*;
/**
 *
 * @author Inshu
 */
public class DBConnection {
    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;
public DBConnection()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atmmgmt","root","8962");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
}
