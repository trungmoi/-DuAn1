package DAO;

import ConnectDB.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDon;

public class DAO_HoaDon {

    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public DAO_HoaDon() {
        con = ConnectDB.getConN();
    }

    public ArrayList<model.HoaDon> getAll() {
        ArrayList<model.HoaDon> List_HD = new ArrayList<>();

        sql = "select Id_HoaDon, TenSP, Size, Color, SoLuong, DonGia,Id_Voucher, TongTien,Id_NhanVien,NgayTao from HoaDonChiTiet";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idhd = rs.getInt(1);
//                int idsp = rs.getInt(2);
                String TenSP = rs.getString(2);
                String sz = rs.getString(3);
                String cl = rs.getString(4);
                int SoLuong = rs.getInt(5);
                float DonGia = rs.getFloat(6);
                int idvc = rs.getInt(7);
                float TongTien = rs.getFloat(8);
                int nv = rs.getInt(9);

                Date ngay = rs.getDate(10);
                model.HoaDon md = new HoaDon(idhd, TenSP, sz, cl, SoLuong, DonGia, idvc, TongTien, nv, ngay);
                List_HD.add(md);
            }
            return List_HD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<model.HoaDon> timHd(String Id) {
        ArrayList<model.HoaDon> list_hd = new ArrayList<>();

        sql = "select Id_HoaDon, TenSP, Size, Color, SoLuong, DonGia,Id_Voucher, TongTien,Id_NhanVien,NgayTao from HoaDonChiTiet where Id_HoaDon=?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, Id);
            rs = ps.executeQuery();

            while (rs.next()) {
                int a = (rs.getInt(1));
//                int b = (rs.getInt(2));
                String c = (rs.getString(2));
                String d = (rs.getString(3));
                String e = rs.getString(4);
                int f = (rs.getInt(5));
                float g = (rs.getFloat(6));
                int h = (rs.getInt(7));
                float i = (rs.getFloat(8));
                int nv = rs.getInt(9);
                Date k = (rs.getDate(10));
                model.HoaDon s = new HoaDon(a, c, d, e, f, g, h, i, nv, k);
                list_hd.add(s);
            }
            return list_hd;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public String tinhTien(int id) {
        String tien = null;
        sql = "select sum(TongTien) from HoaDonChiTiet where Id_HoaDon=?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                tien = rs.getString(1);
            }
            return tien;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int TongTien(String id) {
        int tien = 0;
        sql = "select TongTienThanhToan from HoaDon where Id_HoaDon=?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                tien = rs.getInt(1);
            }
            return tien;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

//    public ArrayList<HoaDon> search(String search) {
//        ArrayList<HoaDon> list = new ArrayList<>();
//        sql = """
// select Id_HoaDon, Id_SanPham, TenSP, Size, Color, SoLuong, DonGia,Id_Voucher, TongTien,Id_NhanVien,NgayTao from HoaDonChiTiet 
//              where CAST(Id_HoaDon AS NVARCHAR) LIKE ? or TenSP like ? 
//                       """;
//        try {
//            con = ConnectDB.getConN();
//            ps = con.prepareStatement(sql);
//            ps.setString(1, "%" + search + "%");
//            ps.setString(2, "%" + search + "%");
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int idhd = rs.getInt(1);
//                int idsp = rs.getInt(2);
//                String TenSP = rs.getString(3);
//                String sz = rs.getString(4);
//                String cl = rs.getString(5);
//                int SoLuong = rs.getInt(6);
//                float DonGia = rs.getFloat(7);
//                int idvc = rs.getInt(8);
//                float TongTien = rs.getFloat(9);
//                int nv = rs.getInt(10);
//
//                Date ngay = rs.getDate(11);
//                model.HoaDon md = new HoaDon(idhd, idsp, TenSP, sz, cl, SoLuong, DonGia, idvc, TongTien, nv, ngay);
//                list.add(md);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return list;
//    }
}
