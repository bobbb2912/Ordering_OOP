/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import javax.swing.JSpinner;

/**
 *
 * @author Hien PC
 */
public class MenuClass {

    private String idSP;
    private String tenSP;

    public MenuClass(String idSP, String tenSP, float DonGia) {
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.DonGia = DonGia;
    }
    private float DonGia;

    public MenuClass() {
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }
    
    

}
