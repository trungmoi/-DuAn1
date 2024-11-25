/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private int id_Nvien;
    private int id_role;
    private String ten;
    private String email;
    private String sdt;
    private String diachi;
    private String taikhoan;
    private String passwords;

    public NhanVien() {
    }

    public NhanVien(int id_Nvien, int id_role, String ten, String email, String sdt, String diachi, String taikhoan, String passwords) {
        this.id_Nvien = id_Nvien;
        this.id_role = id_role;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
        this.taikhoan = taikhoan;
        this.passwords = passwords;
    }

  
    public int getId_Nvien() {
        return id_Nvien;
    }

    public void setId_Nvien(int id_Nvien) {
        this.id_Nvien = id_Nvien;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    
        public Object[] form(){
        return new Object[]{
            id_Nvien,id_role,ten,email,sdt,diachi,taikhoan,passwords
        };
}
    
}
