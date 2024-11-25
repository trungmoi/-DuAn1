/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAO_banHang;
import View.DoiHang;
import View.GiamGia;
import View.Main_Admin;
import View.QuanLiBanHang;
import View.QuanLiHoaDon_pn;
import View.QuanLiNhanHang_pn;
import View.QuanLiNhanVien;
import View.QuanLiSanPham_pn;
import View.TrangChu_pn;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuyenManHinh {

    private JPanel jpnRoot;
    private JPanel jpnRoot2;
    private DAO.DAO_banHang rp = new DAO_banHang();
    private int i;
    private List<MenuBar> listMenu = null;

    public ChuyenManHinh(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }

    public void setEvent(List<MenuBar> listMenu) {
        this.listMenu = listMenu;
        for (MenuBar item : listMenu) {
            item.getJlb().addMouseListener(new labelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    public void setView() {
        jpnRoot.removeAll();
        jpnRoot.setLayout(new BorderLayout());
        jpnRoot.add(new TrangChu_pn());
        jpnRoot.validate();
        jpnRoot.repaint();
    }

    class labelEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JPanel jpn;
        private JLabel jlb;

        public labelEvent(String kind, JPanel jpn, JLabel jlb) {
            this.kind = kind;
            this.jpn = jpn;
            this.jlb = jlb;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            i = rp.layId_role();
            switch (kind) {
                case "NhanHang":
                    if (i != 2) {
                        node = new QuanLiNhanHang_pn();
                    } else {
                        JOptionPane.showMessageDialog(jpnRoot, "Không Có Quyền Truy Cập","Thông Báo",1);
                        return;
                    }

                    break;
                case "SanPham":
                    if (i != 2) {
                        node = new QuanLiSanPham_pn();
                    } else {
                        JOptionPane.showMessageDialog(jpnRoot, "Không Có Quyền Truy Cập","Thông Báo",1);
                        return;
                    }

                    break;
                case "NhanVien":
                    if (i != 2&&i!=3) {
                        node = new QuanLiNhanVien();
                    } else {
                        JOptionPane.showMessageDialog(jpnRoot, "Không Có Quyền Truy Cập","Thông Báo",1);
                        return;
                    }

                    break;
                case "HoaDon":
                    if (i!=3) {
                        node = new QuanLiHoaDon_pn();
                    } else {
                        JOptionPane.showMessageDialog(jpnRoot, "Không Có Quyền Truy Cập","Thông Báo",1);
                        return;
                    }

                    break;
                case "BanHang":
                    if (i!=3) {
                       node = new QuanLiBanHang();
                    } else {
                        JOptionPane.showMessageDialog(jpnRoot, "Không Có Quyền Truy Cập","Thông Báo",1);
                        return;
                    }
                    
                    break;
                case "TrangChu":
                    node = new TrangChu_pn();
                    break;
                case "KhuyenMai":
                    if (i != 2&&i!=3) {
                        node = new GiamGia();
                    } 
                    else {
                        JOptionPane.showMessageDialog(jpnRoot, "Xem Ăn CẶc à");
                        node = new DoiHang();
                        return;
                    }
                    break;

            }
            jpnRoot.removeAll();
            jpnRoot.setLayout(new BorderLayout());
            jpnRoot.add(node);
            jpnRoot.validate();
            jpnRoot.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }
}
