package model;

import java.util.Date;

public class voucher {

    private int id;
    private String ten;
    private float tienGiam;
    private float dieuKien;
    private int soLuong;
    private Date ngayTao;
    private Date NgayHetHan;
    private String NgayHetHan1;

    public String getNgayHetHan1() {
        return NgayHetHan1;
    }

    public voucher(String ten, float tienGiam, float dieuKien, int soLuong, Date NgayHetHan) {
        this.ten = ten;
        this.tienGiam = tienGiam;
        this.dieuKien = dieuKien;
        this.soLuong = soLuong;
        this.NgayHetHan = NgayHetHan;
    }


    

    public void setNgayHetHan1(String NgayHetHan1) {
        this.NgayHetHan1 = NgayHetHan1;
    }
    
    public voucher() {
    }

    public voucher(String ten, float tienGiam, float dieuKien, int soLuong, String NgayHetHan1) {
        this.ten = ten;
        this.tienGiam = tienGiam;
        this.dieuKien = dieuKien;
        this.soLuong = soLuong;
        this.NgayHetHan1 = NgayHetHan1;
    }
    public voucher(int id, String ten, float tienGiam, float dieuKien, int soLuong, Date NgayHetHan) {
        this.id = id;
        this.ten = ten;
        this.tienGiam = tienGiam;
        this.dieuKien = dieuKien;
        this.soLuong = soLuong;
        this.NgayHetHan = NgayHetHan;
    }
    
    public voucher(int id, String ten, float tienGiam, float dieuKien, int soLuong, Date ngayTao, Date NgayHetHan) {
        this.id = id;
        this.ten = ten;
        this.tienGiam = tienGiam;
        this.dieuKien = dieuKien;
        this.soLuong = soLuong;
        this.ngayTao = ngayTao;
        this.NgayHetHan = NgayHetHan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
    
    public voucher(int id, String ten, float tienGiam, float dieuKien, Date ngayTao) {
        this.id = id;
        this.ten = ten;
        this.tienGiam = tienGiam;
        this.dieuKien = dieuKien;
        this.ngayTao = ngayTao;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public float getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(float tienGiam) {
        this.tienGiam = tienGiam;
    }

    public float getDieuKien() {
        return dieuKien;
    }

    public void setDieuKien(float dieuKien) {
        this.dieuKien = dieuKien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Object[] todata() {
        return new Object[]{this.id, this.ten, this.tienGiam, this.dieuKien,this.soLuong,this.getNgayHetHan()};
    }

      public Object[] todata_vc() {
        return new Object[]{this.id, this.ten, this.tienGiam, this.dieuKien,this.soLuong,  this.getNgayTao(), this.getNgayHetHan()};
    }
}
