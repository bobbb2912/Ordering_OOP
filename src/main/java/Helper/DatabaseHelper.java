/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hien PC
 */
public class DatabaseHelper {
     public static Connection openConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://DESKTOP-TAQ595G\\SQLEXPRESS2:1433;database=BTL_OOP2;";
        String username = "sa";
        String password = "1234";
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        
        return con;
    }
}
