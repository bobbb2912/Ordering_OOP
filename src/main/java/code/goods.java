/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.ArrayList;
import javax.swing.JSpinner;

/**
 *
 * @author dell
 */
public class goods {
    private String hang;
    private double gia;
    private JSpinner spn;
    private int sl;
//    ArrayList<goods> gDrink=new ArrayList();
//    ArrayList<goods> gFood = new ArrayList<>();

    
    
    
//    public void initDrink(ArrayList<goods> gDrink) {
//        
//    }
//    
//    public void initFood(ArrayList<goods> gFood) {
//        gFood.add(new goods("Tiramisu", 45000));
//        gFood.add(new goods("Straw - Cup", 30000));
//        gFood.add(new goods("Choco - Cup", 30000));
//        gFood.add(new goods("Mousse Cake", 35000));
//        gFood.add(new goods("Cheese-bur", 45000));
//        gFood.add(new goods("Chicken-bur", 45000));
//        
//    }

    public goods(String hang, double gia, JSpinner spn, int sl) {
        this.hang = hang;
        this.gia = gia;
        this.spn = spn;
        this.sl = sl;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    
    public goods(String hang, double gia, JSpinner spn) {
        this.hang = hang;
        this.gia = gia;
        this.spn = spn;
    }
    
    public goods(){
        
    }
    public goods(ArrayList g){
        g= new ArrayList<>();
    }
    public goods(String hang, double gia) {
        this.hang = hang;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public JSpinner getSpn() {
        return spn;
    }

    public void setSpn(JSpinner spn) {
        this.spn = spn;
    }
    
    
}
