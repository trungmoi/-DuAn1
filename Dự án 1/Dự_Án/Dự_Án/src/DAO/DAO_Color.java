/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import ConnectDB.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.mauSac;
public class DAO_Color {
     private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    public List<mauSac> ListNhanHang() {
        List<mauSac> arrNH = new ArrayList<>();
        try {
            String sql = ("select * from nhanHang_SP");
            con = ConnectDB.getConN();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mauSac nH = new mauSac();
                nH.setIdcl(rs.getInt(1));
                nH.setMauSac(rs.getString(2).trim());
                arrNH.add(nH);
            }
        } catch (SQLException e) {
            System.out.println("Loi" + e);
        }
        return arrNH;
    }

    public ArrayList<Integer> idCl() {
        ArrayList<Integer> idNH = new ArrayList<>();
        for (mauSac ListNhanHang : ListNhanHang()) {
            int id = ListNhanHang.getIdcl();
            idNH.add(id);
        }
        System.out.println(idNH);
        return idNH;
    }
}
