/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB_NV;
import ConnectDB.DBConnect;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class DAO_NhaVien {
   private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    public List<model.NhanVien> getdata(String search) {
        List<model.NhanVien> list = new ArrayList<>();
        String query = """
                       Select Id_NVien,Id_role,HoTen,Email,SDT,DiaChi,Taikhoan,Matkhau from NhanVien
                       WHERE Id_Nvien like ? or HoTen like ? or Email  like ? or sdt like ? or diachi like ?
                       """;
        try (Connection conn = DBConnect.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            ps.setString(3, "%" + search + "%");
            ps.setString(4, "" + search + "%");
            ps.setString(5, "%" + search + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId_Nvien(rs.getInt(1));
                nv.setId_role(rs.getInt(2));
                nv.setTen(rs.getString(3));
                nv.setEmail(rs.getString(4));
                nv.setSdt(rs.getString(5));
                nv.setDiachi(rs.getString(6));
                nv.setTaikhoan(rs.getString(7));
                nv.setPasswords(rs.getString(8));
                list.add(nv);
            }
return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
//    public List<NhanVien> getCDByTen(String ten) {
//        List<NhanVien> list = new ArrayList<>();
//        String query = "Select IdNhanVien,TenNV,email,Phone,DiaChi,Passwords from NhanVien where TenNV like ?";
//        try (Connection conn = ConnectDB.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
//            ps.setString(1, '%' + ten + '%');
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                NhanVien nv = new NhanVien();
//                nv.setId(rs.getInt(1));
//                nv.setTen(rs.getString(2));
//                nv.setEmail(rs.getString(3));
//                nv.setSdt(rs.getString(4));
//                nv.setDiachi(rs.getString(5));
//                nv.setPasswords(rs.getString(6));
//                
//                list.add(nv);
//
//            }
//            return list;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public void update(NhanVien nv) {
        String query = "UPDATE NhanVien SET Id_role = ?, HoTen=? , Email=?, SDT=?, DiaChi=?,Taikhoan=? ,Matkhau=? WHERE Id_NVien =?";
        try (Connection con = ConnectDB_NV.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, nv.getId_role());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getEmail());
            ps.setString(4, nv.getSdt());
            ps.setString(5, nv.getDiachi());
            ps.setString(6, nv.getTaikhoan());
            ps.setString(7, nv.getPasswords());
            ps.setInt(8, nv.getId_Nvien());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void xoa(NhanVien nv) {
        String query = "Delete from NhanVien where Id_NVien=?";
        try (Connection con = ConnectDB_NV.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, nv.getId_Nvien());
            ps.execute();
        } catch (Exception e) {
        }
    }

    public int themnv(model.NhanVien st) {
        String sql = "insert into NhanVien (Id_role,HoTen, Email, SDT, DiaChi , Taikhoan, Matkhau) values (?,?,?,?,?,?,?)";
        try {
            Connection conn = ConnectDB_NV.getConnection();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1,st.getId_role() );
            ps.setString(2, st.getTen());
            ps.setString(3, st.getEmail());
            ps.setString(4, st.getSdt());
            ps.setString(5, st.getDiachi());
            ps.setString(6, st.getTaikhoan());
            ps.setString(7, st.getPasswords());

            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    
    public ArrayList<NhanVien> getAll_TaiKhoan(){
         ArrayList<NhanVien> list = new ArrayList<>();
         sql = "select Taikhoan from NhanVien";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                 NhanVien nv = new NhanVien();
                nv.setTaikhoan(rs.getString(1));
                list.add(nv);

            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
