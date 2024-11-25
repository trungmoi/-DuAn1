package model;

import java.util.Date;

public class HoaDon {

    private int Id_HoaDon;
    private int Id_SanPham;
    private String TenSP;
    private String Size;
    private String Color;
    private int SoLuong;
    private float DonGia;
    private int Id_Voucher;
    private float TongTien;
    private int idNhanVien;
    private Date NgayTao;
    private float km;
    private float tongTienThanhToan;
    

    public HoaDon() {
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public HoaDon(float km, float tongTienThanhToan) {
        this.km = km;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(float tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public HoaDon(int Id_HoaDon, String TenSP, String Size, String Color, int SoLuong, float DonGia, int Id_Voucher, float TongTien, int idNhanVien, Date NgayTao) {
        this.Id_HoaDon = Id_HoaDon;
        
        this.TenSP = TenSP;
        this.Size = Size;
        this.Color = Color;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.Id_Voucher = Id_Voucher;
        this.TongTien = TongTien;
        this.idNhanVien = idNhanVien;
        this.NgayTao = NgayTao;
    }

    

    public int getId_HoaDon() {
        return Id_HoaDon;
    }

    public void setId_HoaDon(int Id_HoaDon) {
        this.Id_HoaDon = Id_HoaDon;
    }

    public int getId_SanPham() {
        return Id_SanPham;
    }

    public void setId_SanPham(int Id_SanPham) {
        this.Id_SanPham = Id_SanPham;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public int getId_Voucher() {
        return Id_Voucher;
    }

    public void setId_Voucher(int Id_Voucher) {
        this.Id_Voucher = Id_Voucher;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Object[] toRowTable() {
        return new Object[]{
            this.Id_HoaDon, this.TenSP, this.Size, this.Color, this.SoLuong, this.DonGia, this.Id_Voucher, this.TongTien, this.idNhanVien, this.getNgayTao()
        };

    }
}
