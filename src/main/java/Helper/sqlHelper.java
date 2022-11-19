package Helper;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class sqlHelper {
      private static String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
   private static String url="jdbc:sqlserver://DESKTOP-TAQ595G\\SQLEXPRESS2:1433;database=BTL_OOP2;";
   private static String user ="sa";
    private static String password="1234";
     public static PreparedStatement preparedStatement(String sql, Object...args) throws  SQLException{
    Statement st;
    ResultSet rs;
    Connection con =  DriverManager.getConnection(url, user, password);
    PreparedStatement pstmt=null;
    if(sql.trim().startsWith("|")){
        pstmt= con.prepareCall(sql);
    }
    else{
        pstmt=con.prepareStatement(sql);
        System.out.println(pstmt.toString());
    }
    for(int i=0; i<args.length; i++){
        pstmt.setObject(i+1, args[i]);
    }
    return pstmt;
     }
    public static ResultSet executeQuery(String sql, Object...args){
        try {
            PreparedStatement stmt= preparedStatement(sql, args);
            return stmt.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void executeUpdate(String sql, Object...args){
        try {
            PreparedStatement stmt= preparedStatement(sql, args);
            System.out.println(stmt.toString());
            try {
                stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
        }
    }
}