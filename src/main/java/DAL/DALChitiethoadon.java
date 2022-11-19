/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Helper.sqlHelper;
import code.ChiTietHoaDon;

/**
 *
 * @author dell
 */
public class DALChitiethoadon {
     // ham them
    public static void Them(ChiTietHoaDon cthd) {
        String sql = "insert into ChiTietHoaDon values (?, ?, ?, ?, ?)";
        sqlHelper.executeUpdate(sql, 
                cthd.getMaHD(),
                cthd.getMaSP(), 
                cthd.getSoLuong(),
                cthd.getThanhTien(),
                cthd.getGhiChu());
    }
}
