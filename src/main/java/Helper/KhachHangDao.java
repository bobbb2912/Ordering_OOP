/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import code.KhachHang;
import code.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class KhachHangDao {

    public KhachHang checkLogin(String username, String password) throws Exception {
        String sql = "select name, diachi, email, tel from taikhoan2 where username = ? and pass = ?";

        try (
                 Connection con = DatabaseHelper.openConnection();  
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try ( ResultSet rs = pstmt.executeQuery();) {

                if (rs.next()) {
                    KhachHang kh = new KhachHang();
                    kh.setUsername(username);
                    kh.setName(rs.getString("name"));
                    kh.setDiaChi(rs.getString("diachi"));
                    kh.setEmail(rs.getString("email"));
                    kh.setTel(rs.getString("tel"));
                    return kh;
                }

            } 
        }
       return null;
    }
}