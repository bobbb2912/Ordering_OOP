
package DAL;
import Helper.*;
import java.sql.*;

import java.sql.ResultSet;


public class DALSanPham {
    
    public static ResultSet GetAll(){
        String sql="select * from SanPham";
        return sqlHelper.executeQuery(sql);
    }
    public static ResultSet TimSP(String tukhoa){
        String sql=" {call spTimSanPham(?)}";
        return sqlHelper.executeQuery(sql, tukhoa);
    }
    public static ResultSet GetOne(int IDSanPham){
        String sql="select * from SanPham where MASP = '"+IDSanPham+"'";
        return sqlHelper.executeQuery(sql);
    }
}