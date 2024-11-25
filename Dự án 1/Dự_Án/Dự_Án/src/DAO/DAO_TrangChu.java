package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.BanHang;
import model.TrangChu;

public class DAO_TrangChu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;

    public ArrayList<model.TrangChu> getall_sp() {
        ArrayList<model.TrangChu> list_sp = new ArrayList<>();
        sql = "SELECT    dbo.sanPham.IdSanPham, dbo.sanPham.TenSP, dbo.sanPham.Gia, dbo.sanPham.soLuong, dbo.color_SP.color, dbo.ChatLieu_SP.ChatLieu, dbo.NhanHang_SP.TenNhanHang\n"
                + "FROM         dbo.sanPham INNER JOIN\n"
                + "                      dbo.color_SP ON dbo.sanPham.Id_Color = dbo.color_SP.Id_Mau INNER JOIN\n"
                + "                      dbo.ChatLieu_SP ON dbo.sanPham.Id_ChatLieu = dbo.ChatLieu_SP.Id_Cl INNER JOIN\n"
                + "                      dbo.NhanHang_SP ON dbo.sanPham.Id_NhanHang = dbo.NhanHang_SP.Id_Nh where soLuong<20";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                float gia = rs.getFloat(3);
                int sl = rs.getInt(4);
                String tenNhanHang = rs.getString(7);
                String colorSP = rs.getString(5);;
                String chatlieuSP = rs.getString(6);;
                model.TrangChu sp = new TrangChu(id, ten, gia, sl, colorSP, chatlieuSP, tenNhanHang);
                list_sp.add(sp);

            }
            return list_sp;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int soLuongSanPhamDaBan() {
        int id = 0;
        sql = " select COUNT(Id_HDCT) from HoaDonChiTiet";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);

            }
            return id;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public float TongTien() {
        float i = 0;
        sql = "select sum(TongTienThanhToan) from HoaDon";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                i = rs.getFloat(1);

            }
            return i;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public int slSapHet() {
        int i = 0;
        sql = "select count(soLuong) from sanPham where soLuong < 20";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                i = rs.getInt(1);

            }
            return i;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public static void main(String[] args) {
        DAO_TrangChu a = new DAO_TrangChu();
        System.out.println(""+a.TongTien());
        System.out.println(""+a.soLuongSanPhamDaBan());
    }
}
