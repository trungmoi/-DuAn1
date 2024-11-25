/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;
public class DAO_SanPham {
    private static Connection conn;
    public static List<SanPham> arrSP(){
        List<SanPham> arrSP = new ArrayList<>();
        try {
            conn = ConnectDB.ConnectDB.getConN();
            String sql = (" select idSanPham, TenSP, Gia, sanPham.MoTa, SoLuong, TenNhanHang, ChatLieu ,Hinh,color from sanPham left join NhanHang_SP on sanPham.Id_NhanHang = NhanHang_Sp.Id_Nh left join ChatLieu_Sp on sanPham.Id_ChatLieu=ChatLieu_SP.Id_Cl left join color_SP on sanPham.Id_Color=color_SP.Id_Mau");
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs  =ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setIdSP(rs.getInt(1));
                sp.setTenSP(rs.getString(2));
                sp.setGia(rs.getFloat(3));
                sp.setMoTa(rs.getString(4));
                sp.setSoLuong(rs.getInt(5));
                sp.setNhanHang(rs.getString(6));
                sp.setChatLieu(rs.getString(7));
                sp.setHinh(rs.getString(8));
                sp.setColor(rs.getString(9));
                arrSP.add(sp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arrSP;
    }
    public ArrayList<Integer> idSP(){
        ArrayList idSP = new ArrayList();
        for (SanPham sanPham : arrSP()) {
            int id = sanPham.getIdSP();
            idSP.add(id);
        }
        return idSP;
    }
    
}
