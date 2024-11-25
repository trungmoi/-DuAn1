/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class NhanHang {
        private int idNhanHang;
    private String tenNhanHang;
//    private String moTa;

    public NhanHang() {
    }

    public NhanHang(int idNhanHang, String tenNhanHang) {
        this.idNhanHang = idNhanHang;
        this.tenNhanHang = tenNhanHang;
    }

    public int getIdNhanHang() {
        return idNhanHang;
    }

    public void setIdNhanHang(int idNhanHang) {
        this.idNhanHang = idNhanHang;
    }

    public String getTenNhanHang() {
        return tenNhanHang;
    }

    public void setTenNhanHang(String tenNhanHang) {
        this.tenNhanHang = tenNhanHang;
    }

    public Object[]nhanhang(){
        return new Object[]{
          this.idNhanHang,this.tenNhanHang
        };
    }
    
    
}
