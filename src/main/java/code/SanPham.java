
package code;

/**
 *
 * @author dell
 */
public class SanPham {
    private int IDhang;
    private String ten;
    private float gia;
    private String loai;
  private int soluong;
  private String GhiChu;

    public SanPham(int IDhang, String ten, float gia, String loai, int soluong, String GhiChu) {
        this.IDhang = IDhang;
        this.ten = ten;
        this.gia = gia;
        this.loai = loai;
        this.soluong = soluong;
        this.GhiChu = GhiChu;
    }

    
    public SanPham() {
    }

    public SanPham(int IDhang, int soluong, float gia) {
        this.IDhang = IDhang;
        this.soluong = soluong;
        this.gia = gia;
    }

    public int getIDhang() {
        return IDhang;
    }

    public void setIDhang(int IDhang) {
        this.IDhang = IDhang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
   
}