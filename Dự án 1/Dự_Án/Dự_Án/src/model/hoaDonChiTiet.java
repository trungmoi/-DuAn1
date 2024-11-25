
package model;


public class hoaDonChiTiet {
    private int idHDCT;
    private int idSanPham;
    private String tenSP;
    private int soLuong;
    private String sz;
    private String color;
    private float gia;
    private float khuyenmai;
    private int idNhanVien;
    private int idHoaDon;
    private float tongTien;
    private int idVoucher;
    public hoaDonChiTiet() {
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public hoaDonChiTiet(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public hoaDonChiTiet(int idHDCT, int idSanPham, String tenSP, int soLuong, String sz, String color, float gia, float tongTien) {
        this.idHDCT = idHDCT;
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.sz = sz;
        this.color = color;
        this.gia = gia;
        this.tongTien = tongTien;
    }

    public hoaDonChiTiet(int idSanPham, String tenSP, int soLuong, String sz, String color, float gia, int idNhanVien, int idHoaDon, float tongTien) {
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.sz = sz;
        this.color = color;
        this.gia = gia;
        this.idNhanVien = idNhanVien;
        this.idHoaDon = idHoaDon;
        this.tongTien = tongTien;
    }

    public hoaDonChiTiet(int idHDCT, int idSanPham, String tenSP, int soLuong, String sz, String color, float gia, float khuyenmai, int idNhanVien, int idHoaDon, float tongTien) {
        this.idHDCT = idHDCT;
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.sz = sz;
        this.color = color;
        this.gia = gia;
        this.khuyenmai = khuyenmai;
        this.idNhanVien = idNhanVien;
        this.idHoaDon = idHoaDon;
        this.tongTien = tongTien;
    }

    public hoaDonChiTiet(int idHDCT, String tenSP, int soLuong, String sz, String color, float gia, float tongTien) {
        this.idHDCT = idHDCT;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.sz = sz;
        this.color = color;
        this.gia = gia;
        this.tongTien = tongTien;
    }

    public hoaDonChiTiet(int idHDCT, int soLuong, String sz, String color) {
        this.idHDCT = idHDCT;
        this.soLuong = soLuong;
        this.sz = sz;
        this.color = color;
    }

  

    public hoaDonChiTiet(int idSanPham, String tenSP, int soLuong, String sz, String color, float gia, int idHoaDon, float tongTien) {
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.sz = sz;
        this.color = color;
        this.gia = gia;
        this.idHoaDon = idHoaDon;
        this.tongTien = tongTien;
    }

    public int getIdHDCT() {
        return idHDCT;
    }

    public void setIdHDCT(int idHDCT) {
        this.idHDCT = idHDCT;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public float getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(float khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    
   public Object[] datahd() {
        return new Object[]{
            this.idHDCT,this.idSanPham,this.tenSP,this.sz,this.color,this.gia,this.soLuong,this.tongTien
        };
    }
//    public Object[] dataHD(){
//        return new Object[]{
//            tenSP,sz,color,gia,soLuong,tongTien
//        };
//    }
}
