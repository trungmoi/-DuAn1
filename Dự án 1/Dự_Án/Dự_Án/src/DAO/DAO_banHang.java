package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.BanHang;
import model.hoaDonChiTiet;
import model.voucher;

public class DAO_banHang {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
//
    public ArrayList<model.size> getall_sz() {
        ArrayList<model.size> list_sz = new ArrayList<>();
        sql = "select Size from size_SP";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String sz = rs.getString(1);
                model.size kh = new model.size(sz);
                list_sz.add(kh);

            }
            return list_sz;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
//
    public ArrayList<model.mauSac> getall_color() {
        ArrayList<model.mauSac> list_cl = new ArrayList<>();
        sql = "select color from color_SP";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String cl = rs.getString(1);
                model.mauSac kh = new model.mauSac(cl);
                list_cl.add(kh);

            }
            return list_cl;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<model.BanHang> getall_sp() {
        ArrayList<model.BanHang> list_sp = new ArrayList<>();
        sql = "SELECT    dbo.sanPham.IdSanPham, dbo.sanPham.TenSP, dbo.sanPham.Gia, dbo.sanPham.soLuong, dbo.sanPham.MoTa,  dbo.color_SP.color\n" +
"FROM         dbo.sanPham INNER JOIN\n" +
"                      dbo.color_SP ON dbo.sanPham.Id_Color = dbo.color_SP.Id_Mau";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                float gia = rs.getFloat(3);
                int sl = rs.getInt(4);
                String moTa = rs.getString(5);
//                String hinh = rs.getString(6);
                String cl = rs.getString(6);
                model.BanHang sp = new BanHang(id, ten, gia, sl, moTa, cl);
                list_sp.add(sp);

            }
            return list_sp;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public ArrayList<model.BanHang> tim(String Id) {
        ArrayList<model.BanHang> list_sp = new ArrayList<>();
        model.BanHang s = new BanHang();
        sql = "select IdSanPham, TenSP,Gia,soLuong,MoTa,Hinh from sanPham where IdSanPham =?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, Id);
            rs = ps.executeQuery();

            while (rs.next()) {
                s.setIdSp(rs.getInt(1));
                s.setTenSp(rs.getString(2));
                s.setGia(rs.getFloat(3));
                s.setSlTon(rs.getInt(4));
                s.setMoTa(rs.getString(5));
                s.setHinh(rs.getString(6));
                list_sp.add(s);

            }
            return list_sp;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void themHoaDon() {
        int so = 1;
        sql = "insert into HoaDon(so) values(?)";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, so);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public int layIdHoaDon() {
        int id = 0;
        sql = "SELECT top(1)    Id_HoaDon\n"
                + "FROM         dbo.HoaDon\n"
                + "order by Id_HoaDon  desc";
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

    public int thanhToan(model.hoaDonChiTiet tt) {
        sql = "insert into HoaDonChiTiet(Id_SanPham,TenSP,SoLuong,Size,Color,DonGia,Id_HoaDon,TongTien,Id_NhanVien) values(?,?,?,?,?,?,?,?,?)";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, tt.getIdSanPham());
            ps.setString(2, tt.getTenSP());
            ps.setInt(3, tt.getSoLuong());
            ps.setString(4, tt.getSz());
            ps.setString(5, tt.getColor());
            ps.setFloat(6, tt.getGia());
            ps.setInt(7, tt.getIdHoaDon());
            ps.setFloat(8, tt.getTongTien());
            ps.setInt(9, tt.getIdNhanVien());
            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public ArrayList<model.hoaDonChiTiet> getall_HoaDon(int id) {
        ArrayList<model.hoaDonChiTiet> list_hd = new ArrayList<>();

        sql = "select Id_HDCT ,Id_SanPham, TenSP,size,color,DonGia,SoLuong,TongTien from HoaDonChiTiet where Id_HoaDon =?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                int idhdct = rs.getInt(1);
                int idsp = rs.getInt(2);
                String ten = rs.getString(3);
                String sz = rs.getString(4);
                String cl = rs.getString(5);
                float gia = rs.getFloat(6);
                int sl = rs.getInt(7);
                float tien = rs.getFloat(8);
                model.hoaDonChiTiet hd = new hoaDonChiTiet(idhdct, idsp, ten, sl, sz, cl, gia, tien);
                list_hd.add(hd);
            }
            return list_hd;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int update(model.hoaDonChiTiet st, int id) {
        sql = "update HoaDonChiTiet set Size=?,Color=?,SoLuong=? where Id_HDCT=?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setString(1, st.getSz());
            ps.setString(2, st.getColor());
            ps.setInt(3, st.getSoLuong());
            ps.setInt(4, id);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int xoa(int id) {
        sql = "delete from HoaDonChiTiet where Id_HDCT=?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int tinhTien(int id) {
        int tien = 0;
        sql = "select sum(TongTien) from HoaDonChiTiet where Id_HoaDon=?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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

    public ArrayList<model.voucher> tim_DieuKien(String a) {

        ArrayList<model.voucher> list_NguoiHoc = new ArrayList<>();

        sql = "select Id_Voucher,TênVouvher,soTienGiam,DieuKien,SoLuong,NgayHetHan from voucher where DieuKien<=? and NgayHetHan>=getdate()";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, a);

            rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt(1);
                String Ten = rs.getString(2);
                float dieukien = rs.getFloat(3);
                float dieu = rs.getFloat(4);
                int sl = rs.getInt(5);
                Date ngayHet = rs.getDate(6);

                model.voucher md = new voucher(id, Ten, dieukien, dieu, sl, ngayHet);
                list_NguoiHoc.add(md);
            }
            return list_NguoiHoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int update_hoaDonChiTiet(model.hoaDonChiTiet st, int id) {
        sql = "update HoaDonChiTiet \n"
                + "set iD_Voucher =? where Id_HoaDon=?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, st.getIdVoucher());
            ps.setObject(2, id);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int update_hoaDon(model.HoaDon a, int id) {
        sql = "update HoaDon \n"
                + "set SoTienGiam =?,TongTienThanhToan=? where Id_HoaDon=?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setFloat(1, a.getKm());
            ps.setFloat(2, a.getTongTienThanhToan());
            ps.setObject(3, id);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int layId_role() {
        int id = 0;
        sql = "select top(1)iD_role from NVTT\n"
                + "order by Id desc";
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

    public int layIdNv() {
        int id = 0;
        sql = "select top(1) iD_nv from NVTT\n"
                + "order by Id desc";
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

    public int update_sl(int a, String b) {
        sql = "update sanPham set soLuong = ? where IdSanPham = ?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, a);
            ps.setObject(2, b);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int update_sl2(int a, String b) {
        sql = "update sanPham set soLuong = ? where IdSanPham = ?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, a);
            ps.setObject(2, b);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int sl_sp(String idsp) {
        int sl = 0;
        sql = "select soLuong from sanPham where IdSanPham = ?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setString(1, idsp);
            rs = ps.executeQuery();

            while (rs.next()) {
                sl = rs.getInt(1);

            }
            return sl;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public int update_slVoucher(int a, String b) {
        sql = "update voucher set SoLuong =? where Id_Voucher=?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setObject(1, a);
            ps.setObject(2, b);

            return ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public ArrayList<BanHang> search(String search) {
        ArrayList<BanHang> list = new ArrayList<>();
        sql = """
                       select IdSanPham, TenSP,Gia,soLuong,MoTa,Hinh from sanPham where CAST(IdSanPham AS NVARCHAR) LIKE ? or TenSP like ?  
                       """;
        try {
            con = ConnectDB.DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + search + "%");
            ps.setString(2, "%" + search + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String ten = rs.getString(2);
                float gia = rs.getFloat(3);
                int sl = rs.getInt(4);
                String moTa = rs.getString(5);
                String hinh = rs.getString(6);
                model.BanHang sp = new BanHang(id, ten, gia, sl, moTa, hinh);
                list.add(sp);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    public String getTenNv(int ten) {
        String tien =null;
        sql = "select HoTen from NhanVien where Id_NVien =?";
        try {
            con = ConnectDB.ConnectDB.getConN();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ten);
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
    public String getNgayTao(int id) {
        String tien =null;
        sql = "select NgayTao from HoaDon where Id_HoaDon =?";
        try {
            con = ConnectDB.ConnectDB.getConN();
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
}
