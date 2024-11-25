
package DAO;

import ConnectDB.ConnectDB;
import java.sql.*;


public class DAO_Login {
    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public int getRole(String tk, String mk){
        int role=0;
        sql = "select Id_role from NhanVien where Taikhoan=? and Matkhau=?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setString(1, tk);
            ps.setString(2, mk);
            rs = ps.executeQuery();

            while (rs.next()) {
                role = rs.getInt(1);
            }
            return role;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public int getIdNv(String tk, String mk){
        int iDNv=0;
        sql = "select Id_NVien from NhanVien where Taikhoan=? and Matkhau=?";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setString(1, tk);
            ps.setString(2, mk);
            rs = ps.executeQuery();

            while (rs.next()) {
                iDNv = rs.getInt(1);
            }
            return iDNv;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public int Nv_Role(int nv,int role){
        sql = "insert into NVTT(iD_role,iD_nv) values (?,?)";
        try {
            con = ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, nv);
            ps.setInt(2, role);
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
//    public int idnV(int nv1){
//        sql = "insert into NVTT(iD_nv) values (?)";
//        try {
//            con = ConnectDB.getConN();
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, nv1);
//            return ps.executeUpdate();
//        } catch (Exception e) {
//            System.out.println(e);
//            return 0;
//        }
//    }
//    public static void main(String[] args) {
//        DAO.DAO_Login rp=new DAO_Login();
//        System.out.println(rp.getRole("nv2", "1"));
//        System.out.println(rp.getIdNv("nv2", "1"));
//    }
    }

