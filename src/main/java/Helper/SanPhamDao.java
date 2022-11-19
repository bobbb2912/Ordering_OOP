/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import code.MenuClass;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import code.*;

/**
 *
 * @author Hien PC
 */
public class SanPhamDao {
    private SanPham createSanPham(final ResultSet rs) throws SQLException {
        SanPham menu = new SanPham();
        menu.setIDhang(rs.getInt("MASP"));
        menu.setTen(rs.getString("TENSP"));
        menu.setGia(rs.getFloat("GIA"));
        menu.setLoai(rs.getString("MALOAISP"));
        
        return menu;
    }
    public List<SanPham> findAll() throws Exception {
        String sql = "select*from SANPHAM";
     
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {


           try(ResultSet rs = pstmt.executeQuery();) {
               List<SanPham> list = new ArrayList<>();
               
               while(rs.next()) {
                   SanPham menu = createSanPham(rs);
                   list.add(menu);
               }
               return list;
           }
            
        }
       
    }
    
    public List<SanPham> findLoaiSP(String MaLoaiSP) throws Exception {
        String sql = "select * from SanPham where MaLoaiSP ='"+ MaLoaiSP+"'";
      //  sqlHelper.executeQuery(sql,"%"+MaLoaiSP+"%");
     
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {


           try(ResultSet rs = pstmt.executeQuery();) {
               List<SanPham> list = new ArrayList<>();
               
               while(rs.next()) {
                   SanPham menu = createSanPham(rs);
                   list.add(menu);
               }
               return list;
           }
            
        }
       
    }
    public List<SanPham> findSP(String tuKhoa) throws Exception {
        String sql = "select * from SANPHAM where TENSP like '"+ tuKhoa+"%'";
     
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {


           try(ResultSet rs = pstmt.executeQuery();) {
               List<SanPham> list = new ArrayList<>();
               
               while(rs.next()) {
                   SanPham menu = createSanPham(rs);
                   list.add(menu);
               }
               return list;
           }
            
        }
       
    }
     public List<SanPham> timSP(int masp) throws Exception {
        String sql = "select * from SANPHAM where MAsp = '"+ masp+"'";
     
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {


           try(ResultSet rs = pstmt.executeQuery();) {
               List<SanPham> list = new ArrayList<>();
               
               while(rs.next()) {
                   SanPham menu = createSanPham(rs);
                   list.add(menu);
               }
               return list;
           }
            
        }
       
    }
}
