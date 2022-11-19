package BLL;

import DAL.DALHoaDon;
import code.*;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Helper.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BLLHoadon {

    public static void LoadDataChiTietHoaDon(JTable tbl, SanPham sp, String soluong, String ghichu) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        Object obj[] = new Object[7];
         
        obj[0] = tbModel.getRowCount() + 1;
        obj[1] = sp.getIDhang();
        obj[2] = sp.getTen();
        obj[3] = soluong;
        obj[4] = ChuyenDoi.SoString(sp.getGia());
        obj[5] = Integer.parseInt(soluong) * sp.getGia();
        obj[6] = ghichu;
        tbModel.addRow(obj);
//        tbl.setModel(tbModel);
        
    }

    public static String TinhTongTien(JTable tbl) {
        double TongTien = 0;
        for (int i = 0; i < tbl.getRowCount(); i++) {
            TongTien += ChuyenDoi.SoDouble(tbl.getValueAt(i, 5).toString());

        }
        return ChuyenDoi.SoString(TongTien);
    }

    public static HoaDon LayHoaDonTheoSoHoaDon(String SoHoaDon) {
        ResultSet rs = DALHoaDon.GetBySoHoaDon(SoHoaDon);
        try {
            if (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setGhiChu(rs.getString("GhiChu"));
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setUsernameKH(rs.getString("MaKhachHang"));
                hd.setSoHoaDon(SoHoaDon);
                hd.setTongTien(rs.getDouble("TongTien"));
                return hd;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static String TaoNgay() {
        String ngay = "";
        try {
            DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
            Date d = new Date();
            ngay = df.format(d);          
        } catch (Exception e) {
        }
        return ngay;
    }
     public static String TaoSOHD() {
        String soHoaDon = "";
        try {
            DateFormat df = new SimpleDateFormat("yyyyMMdd");
            Date d = new Date();
            soHoaDon = "HD"+ df.format(d);
            System.out.println("SoHoaDon: " + soHoaDon);
            ResultSet rs = DALHoaDon.COuntSoHoaDon(soHoaDon);
            int rowCount = 0;
            if (rs.next()) {
                rowCount = rs.getInt(1);
            }
            boolean dup = false;
            do {
                if (rowCount > 90) {
                    soHoaDon = soHoaDon + (rowCount + 1);
                } else if (rowCount > 8) {
                    soHoaDon = soHoaDon + "0" + (rowCount + 1);
                } else {
                    soHoaDon = soHoaDon + "00" + (rowCount + 1);
                }
                System.out.println("SoHoaDon: " + soHoaDon);
                ResultSet rs2 = DALHoaDon.GetBySoHoaDon(soHoaDon);
                if (rs2.next()) {
                    dup = true;
                    rowCount++;
                    soHoaDon = df.format(d);

                } else {
                    dup = false;
                }
            }while(dup);
            
        } catch (Exception e) {
        }
        return soHoaDon;
    }
     public static void ThemHD(HoaDon hd) {
         DALHoaDon.ThemHD(hd);
     }
}
