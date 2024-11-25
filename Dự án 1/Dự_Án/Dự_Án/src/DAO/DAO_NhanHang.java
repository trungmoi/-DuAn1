/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.NhanHang;
import model.NhanVien;

public class DAO_NhanHang {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;

    public List<NhanHang> ListNhanHang() {
        List<NhanHang> arrNH = new ArrayList<>();
        try {
            String sql = ("select * from nhanHang_SP");
            con = ConnectDB.getConN();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanHang nH = new NhanHang();
                nH.setIdNhanHang(rs.getInt(1));
                nH.setTenNhanHang(rs.getString(2).trim());
                arrNH.add(nH);
            }
        } catch (SQLException e) {
            System.out.println("Loi" + e);
        }
        return arrNH;
    }

    public ArrayList<Integer> idNH() {
        ArrayList<Integer> idNH = new ArrayList<>();
        for (NhanHang ListNhanHang : ListNhanHang()) {
            int id = ListNhanHang.getIdNhanHang();
            idNH.add(id);
        }
        System.out.println(idNH);
        return idNH;
    }

    public ArrayList<model.NhanHang> tim_nh(String search) {
        ArrayList<model.NhanHang> list = new ArrayList<>();
        String sql = "select Id_Nh,TenNhanHang from NhanHang_SP where Id_Nh=? or TenNhanHang like ? ";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            

            ps.setString(1,  search);
            ps.setString(2, "'%" + search + "%'");

            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                model.NhanHang e = new NhanHang(id, ten);
                list.add(e);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
}
