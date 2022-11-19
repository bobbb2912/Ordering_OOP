/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author dell
 */
public class ChuyenDoi {
    static DateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
    public static String LayNgayString(Date date){
        return dateFormat.format(date);
    }
    public static Date LayNgayDate(String ngay){
        try {
            return dateFormat.parse(ngay);
            
        } catch (Exception e) {
            System.out.println("Loi chuyen doi ngay");
            return null;
        }
    }
    public static String SoString(double so){
        return NumberFormat.getNumberInstance().format(so);
    }
    public static double SoDouble(String so){
        try {
            return NumberFormat.getNumberInstance().parse(so).doubleValue();
            
        } catch (Exception e) {
            System.out.println("Loi chuyen doi ");
            return 0;
        }
    }
}
