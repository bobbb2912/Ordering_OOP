/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author dell
 */
public class HoaDon {
    int maHD;
    String SoHoaDon;
    Date NgayTaoHD;
    String usernameKH;
    double TongTien;
    String GhiChu;

   

    public String getSoHoaDon() {
        return SoHoaDon;
    }

    public HoaDon(int maHD, String SoHoaDon, Date NgayTaoHD, String usernameKH, double TongTien, String GhiChu) {
        this.maHD = maHD;
        this.SoHoaDon = SoHoaDon;
        this.NgayTaoHD = NgayTaoHD;
        this.usernameKH = usernameKH;
        this.TongTien = TongTien;
        this.GhiChu = GhiChu;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

   
    public HoaDon() {
    }

    public void setSoHoaDon(String SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public Date getNgayTaoHD() {
        return NgayTaoHD;
    }

    public void setNgayTaoHD(Date NgayTaoHD) {
        
        this.NgayTaoHD = NgayTaoHD;
    }

    public String getUsernameKH() {
        return usernameKH;
    }

    public void setUsernameKH(String usernameKH) {
        this.usernameKH = usernameKH;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
