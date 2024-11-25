/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import model.NhanVien;

import model.voucher;

public class Dao_GiamGia {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;

    public List<voucher> getallvoucher() {
        ArrayList<model.voucher> list_hd = new ArrayList<>();

        sql = "select Id_Voucher, TênVouvher, soTienGiam, DieuKien, NgayTao, SoLuong, NgayHetHan from voucher";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = (rs.getInt(1));
                String ten = (rs.getString(2));
                float sotiengiam = (rs.getFloat(3));
                float dieukiengiam = (rs.getFloat(4));
                Date ngaytao = (rs.getDate(5));
                int soluong = (rs.getInt(6));
                Date ngayhethan = (rs.getDate(7));
                model.voucher s = new voucher(id, ten, sotiengiam, dieukiengiam, soluong, ngaytao, ngayhethan);
                list_hd.add(s);
            }
            return list_hd;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public List<voucher> getdata(String search) {
        List<voucher> list = new ArrayList<>();
         sql = """
                       select Id_Voucher, TênVouvher, soTienGiam, DieuKien, NgayTao, SoLuong, NgayHetHan from voucher where CAST(Id_Voucher AS NVARCHAR) LIKE ? or TênVouvher like ?
                       """;
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = (rs.getInt(1));
                String ten = (rs.getString(2));
                float sotiengiam = (rs.getFloat(3));
                float dieukiengiam = (rs.getFloat(4));
                Date ngaytao = (rs.getDate(5));
                int soluong = (rs.getInt(6));
                Date ngayhethan = (rs.getDate(7));
                model.voucher s = new voucher(id, ten, sotiengiam, dieukiengiam, soluong, ngaytao, ngayhethan);
                list.add(s);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public int themvoucher(model.voucher st) {
        String sql = "insert into voucher (TênVouvher, soTienGiam, DieuKien, SoLuong,NgayHetHan) values(?,?,?,?,?)";
        try {
            Connection conn = ConnectDB.getConN();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, st.getTen());
            ps.setFloat(2, st.getTienGiam());
            ps.setFloat(3, st.getDieuKien());
            ps.setInt(4, st.getSoLuong());
            ps.setDate(5,java.sql.Date.valueOf( st.getNgayHetHan1()));
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int xoa(int id) {
        String sql = "delete from voucher where Id_Voucher=?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int updatevc(model.voucher st, String b) {
        String sql = " update voucher set TênVouvher = ?, soTienGiam = ? , DieuKien = ?,SoLuong=? , NgayHetHan=? where Id_Voucher =? ";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setString(1, st.getTen());
            ps.setFloat(2, st.getTienGiam());
            ps.setFloat(3, st.getDieuKien());
            ps.setInt(4, st.getSoLuong());
            ps.setObject(5, st.getNgayHetHan1());
            ps.setObject(6, b);
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }

    }

    public ArrayList<model.voucher> timHd(String Id) {
        ArrayList<model.voucher> list_hd = new ArrayList<>();

        sql = "select Id_Voucher,TênVouvher, soTienGiam, DieuKien, SoLuong, NgayTao, NgayHetHan from voucher where Id_Voucher =?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, Id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int a = (rs.getInt(1));
                String c = (rs.getString(2));
                float g = (rs.getFloat(3));
                float i = (rs.getFloat(4));
                int z = (rs.getInt(5));
                Date k = (rs.getDate(6));
//                Date l = (rs.getDate(7));
                model.voucher s = new voucher(a, c, g, i, z, k);
                list_hd.add(s);
            }
            return list_hd;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

//    public int layId_vc() {
//        int id = 0;
//        sql = "select top(1) Id_Voucher from voucher\n"
//                + "order by Id_Voucher desc ";
//        try {
//            con = ConnectDB.getConN();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                id = rs.getInt(1);
//
//            }
//            return id;
//        } catch (Exception e) {
//            System.out.println(e);
//            return 0;
//        }
//    }
//
//    public int them(String a, int b) {
//        String sql = " update voucher set NgayHetHan=? where Id_Voucher =? ";
//        try {
//            con = ConnectDB.getConN();
//            ps = con.prepareStatement(sql);
//
//            ps.setObject(1, a);
//            ps.setObject(2, b);
//            return ps.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println(e);
//            return 0;
//        }
//
//    }
}
