/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Helper.sqlHelper;
import code.HoaDon;
import java.sql.ResultSet;

/**
 *
 * @author dell
 */
public class DALHoaDon {
    public static ResultSet COuntSoHoaDon(String SoHoaDon) {
        String sql = "select count(*) from hoadon where soHoaDon like ?";
        return sqlHelper.executeQuery(sql, "%" + SoHoaDon + "%");
    }
    public static ResultSet GetBySoHoaDon(String SoHoaDon) {
        String sql = "select * from hoadon where SoHoaDon = ?";
        return sqlHelper.executeQuery(sql, SoHoaDon);
    }
    //ham them hoa don
    public static void ThemHD(HoaDon hd) {
        String sql = "set dateformat DMY insert into hoadon values (?, ?, ?, ?,?)";
        sqlHelper.executeUpdate(sql, 
                hd.getSoHoaDon(), 
                hd.getNgayTaoHD(), 
                hd.getUsernameKH(), 
                hd.getTongTien(), 
                hd.getGhiChu());
        
    }
}

