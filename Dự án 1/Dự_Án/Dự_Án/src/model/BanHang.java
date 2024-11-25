/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class BanHang {

    private int idSp;
    private String tenSp;
    private float gia;
    private int slTon;
    private String moTa;
    private String hinh;
    private String color;
    public BanHang() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public BanHang(int idSp, String tenSp, float gia, int slTon, String moTa, String hinh, String color) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.slTon = slTon;
        this.moTa = moTa;
        this.hinh = hinh;
        this.color = color;
    }

    public BanHang(int idSp, String tenSp, float gia, int slTon, String moTa, String color) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.gia = gia;
        this.slTon = slTon;
        this.moTa = moTa;
        this.color = color;
    }

//    public BanHang(int idSp, String tenSp, float gia, int slTon, String moTa, String hinh) {
//        this.idSp = idSp;
//        this.tenSp = tenSp;
//        this.gia = gia;
//        this.slTon = slTon;
//        this.moTa = moTa;
//        this.hinh = hinh;
//    }

    public int getIdSp() {
        return idSp;
    }

    public void setIdSp(int idSp) {
        this.idSp = idSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public Object[] data() {
        return new Object[]{
         this.getIdSp(),this.getTenSp(),this.getGia(),this.getColor(),this.getSlTon(),this.getMoTa()
        };
    }
}
