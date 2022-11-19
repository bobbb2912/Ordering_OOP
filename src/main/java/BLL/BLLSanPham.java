/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAL.*;
import code.*;

/**
 *
 * @author Hien PC
 */
public class BLLSanPham {

    public static void TimSanPhamHoaDon(JTable tbl, String TuKhoa, String MaLoaiSP) {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0); //xoa cac dong dang co

        ResultSet rs = DALSanPham.TimSP(TuKhoa);
        Object obj[] = new Object[3];

        try {
            obj[0] = rs.getString("idD");
            obj[1] = rs.getString("nameD");
            obj[2] = rs.getFloat("priceD");

            tblModel.addRow(obj);
        } catch (Exception e) {
            System.out.println("Loi lay danh sach");
        }
    }

    public static SanPham GetSanPham(int IDSanPham) {
        SanPham sp = new SanPham();
        ResultSet rs = DALSanPham.GetOne(IDSanPham);

        try {
            if (rs.next()) {
                sp.setIDhang(rs.getInt("MASP"));
                sp.setTen(rs.getString("TENSP"));
                sp.setGia(rs.getFloat("GIA"));
                return sp;
            }
        } catch (Exception e) {
            System.out.println("Loi lay san pham!");
        }
        return null;
    }
    
}
