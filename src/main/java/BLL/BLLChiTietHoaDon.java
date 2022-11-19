/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import code.ChiTietHoaDon;
import code.HoaDon;
import javax.swing.JTable;
import Helper.*;

/**
 *
 * @author dell
 */
public class BLLChiTietHoaDon {
    public static void Them(JTable tbl, String SoHoaDon){
        HoaDon hd= BLLHoadon.LayHoaDonTheoSoHoaDon(SoHoaDon);
        //int MaHD = hd.getMaHD();
        
        for(int i = 0; i < tbl.getRowCount(); i++) {
            ChiTietHoaDon cthd = new ChiTietHoaDon();
            cthd.setMaSP(Integer.parseInt(tbl.getValueAt(i, 1).toString()));
            cthd.setMaHD(SoHoaDon);
            cthd.setSoLuong(Integer.parseInt(tbl.getValueAt(i, 3).toString()));
            cthd.setThanhTien(ChuyenDoi.SoDouble(tbl.getValueAt(i, 5).toString()));
            cthd.setGhiChu(tbl.getValueAt(i, 6).toString());
            DAL.DALChitiethoadon.Them(cthd);
        }
    }
    
}
