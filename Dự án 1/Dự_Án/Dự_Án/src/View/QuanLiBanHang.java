/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import DAO.DAO_banHang;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.BanHang;
import model.HoaDon;
import model.hoaDonChiTiet;
import model.mauSac;
import model.size;
import model.voucher;

public class QuanLiBanHang extends javax.swing.JPanel {

    private DAO.DAO_banHang rp = new DAO_banHang();
    private DefaultTableModel model = new DefaultTableModel();
    private int i = -1;
    private int m;
    private int n;
    private int w;
    private int slsp;
    private int y = rp.layId_role();
    private int z = rp.layIdNv();

    private int x;
    int id;

    public QuanLiBanHang() {
        initComponents();
        cbb_sz.removeAllItems();
//        fill_sz(rp.getall_sz());
        fill_cl(rp.getall_sz());
        fill_sp(rp.getall_sp());
//        this.show_sp(i);
//        tbl_sp.setRowSelectionInterval(i, i);
        this.reset();
//        fill_hoaDon(rp.getall_HoaDon(rp.layIdHoaDon()));
//        txt_tongTien.setText(String.valueOf(rp.tinhTien(rp.layIdHoaDon())));
        txt_id.setEnabled(false);
        txt_ten.setEnabled(false);
        txt_gia.setEnabled(false);
        btn_them.setEnabled(false);
        btn_sua.setEnabled(false);
        btn_thanhToan.setEnabled(false);
        btn_xoa.setEnabled(false);
    }

    private void reset() {
        txt_id.setText(null);
        txt_ten.setText(null);
        txt_gia.setText(null);
        txt_soLuong.setText(null);

    }

    public boolean confirmDelete() {
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        return choice == JOptionPane.YES_OPTION;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        txt_soLuong = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sp = new javax.swing.JTable();
        txt_ten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_gioHang = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_tongTien = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_tim = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_sua = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_thanhToan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbb_sz = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txt_gia = new javax.swing.JTextField();
        btn_taoDon = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_vc = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btn_vc = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_color = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jpnRoot.setBackground(new java.awt.Color(204, 204, 255));
        jpnRoot.setPreferredSize(new java.awt.Dimension(1717, 1014));
        jpnRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Tên Sản Phẩm");
        jpnRoot.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 152, -1, -1));

        btn_xoa.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jpnRoot.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 869, 110, -1));

        txt_soLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jpnRoot.add(txt_soLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 510, 237, -1));

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jpnRoot.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 108, 237, -1));

        tbl_sp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Sản Phẩm", "Giá", "Màu Sắc", "Số Lượng Tồn", "Mô Tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_spMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sp);
        if (tbl_sp.getColumnModel().getColumnCount() > 0) {
            tbl_sp.getColumnModel().getColumn(0).setMinWidth(30);
            tbl_sp.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_sp.getColumnModel().getColumn(1).setMinWidth(250);
            tbl_sp.getColumnModel().getColumn(1).setMaxWidth(250);
            tbl_sp.getColumnModel().getColumn(2).setMinWidth(150);
            tbl_sp.getColumnModel().getColumn(2).setMaxWidth(150);
            tbl_sp.getColumnModel().getColumn(4).setMinWidth(100);
            tbl_sp.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jpnRoot.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 103, 800, 320));

        txt_ten.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jpnRoot.add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 190, 237, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Giỏ Hàng");
        jpnRoot.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 516, 112, -1));

        tbl_gioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID Sản Phẩm", "Tên Sản Phẩm", "SIze ", "Color", "Giá Sp", "Số Lượng", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_gioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gioHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_gioHang);
        if (tbl_gioHang.getColumnModel().getColumnCount() > 0) {
            tbl_gioHang.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_gioHang.getColumnModel().getColumn(0).setMaxWidth(50);
            tbl_gioHang.getColumnModel().getColumn(1).setMinWidth(80);
            tbl_gioHang.getColumnModel().getColumn(1).setMaxWidth(80);
            tbl_gioHang.getColumnModel().getColumn(3).setMinWidth(50);
            tbl_gioHang.getColumnModel().getColumn(3).setMaxWidth(50);
            tbl_gioHang.getColumnModel().getColumn(4).setMinWidth(80);
            tbl_gioHang.getColumnModel().getColumn(4).setMaxWidth(80);
            tbl_gioHang.getColumnModel().getColumn(6).setMinWidth(80);
            tbl_gioHang.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jpnRoot.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 585, 800, 220));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Menu Sản Phẩm");
        jpnRoot.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 62, -1, -1));

        txt_tongTien.setBackground(new java.awt.Color(204, 204, 255));
        txt_tongTien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_tongTien.setForeground(new java.awt.Color(255, 0, 0));
        txt_tongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_tongTien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_tongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tongTienActionPerformed(evt);
            }
        });
        jpnRoot.add(txt_tongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(1389, 853, 268, 55));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Tìm Sản Phẩm");
        jpnRoot.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 18, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tổng");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnRoot.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1221, 859, 150, 45));

        txt_tim.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_tim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timKeyReleased(evt);
            }
        });
        jpnRoot.add(txt_tim, new org.netbeans.lib.awtextra.AbsoluteConstraints(1248, 18, 279, -1));

        btn_them.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_them.setText("Thêm ");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jpnRoot.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 804, 111, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Id Sản Phẩm");
        jpnRoot.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 70, -1, -1));

        btn_sua.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jpnRoot.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 804, 109, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Số Lượng");
        jpnRoot.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 480, -1, -1));

        btn_thanhToan.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_thanhToan.setText("Thanh Toán");
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });
        jpnRoot.add(btn_thanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 869, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Size");
        jpnRoot.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 398, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Màu");
        jpnRoot.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 316, -1, -1));

        cbb_sz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbb_sz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_szActionPerformed(evt);
            }
        });
        jpnRoot.add(cbb_sz, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 436, 237, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Giá");
        jpnRoot.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 234, -1, -1));

        txt_gia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_gia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_giaActionPerformed(evt);
            }
        });
        jpnRoot.add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 272, 237, -1));

        btn_taoDon.setBackground(new java.awt.Color(153, 255, 255));
        btn_taoDon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_taoDon.setText("Tạo Hoá Đơn");
        btn_taoDon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 0, 51)));
        btn_taoDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoDonActionPerformed(evt);
            }
        });
        jpnRoot.add(btn_taoDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 566, 175, 52));

        tbl_vc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Voucher", "Số Tiền Giảm", "Điều Kiện Giảm", "Còn Lại", "Ngày Hết hạn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Long.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_vc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vcMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_vc);
        if (tbl_vc.getColumnModel().getColumnCount() > 0) {
            tbl_vc.getColumnModel().getColumn(0).setMinWidth(30);
            tbl_vc.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_vc.getColumnModel().getColumn(2).setMinWidth(100);
            tbl_vc.getColumnModel().getColumn(2).setMaxWidth(100);
            tbl_vc.getColumnModel().getColumn(4).setMinWidth(60);
            tbl_vc.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jpnRoot.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1221, 103, -1, 408));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpnRoot.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, -1, -1));

        btn_vc.setBackground(new java.awt.Color(255, 51, 51));
        btn_vc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_vc.setForeground(new java.awt.Color(255, 255, 255));
        btn_vc.setText("Áp Dụng Voucher");
        btn_vc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_vc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vcActionPerformed(evt);
            }
        });
        jpnRoot.add(btn_vc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1377, 523, -1, 38));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Voucher Có Thể Sử Dụng");
        jpnRoot.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1221, 82, -1, -1));

        txt_color.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_colorActionPerformed(evt);
            }
        });
        jpnRoot.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 354, 237, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Làm Mới Bảng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnRoot.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 435, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/MegaTron.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jpnRoot.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1750, 1020));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 1740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        i = tbl_gioHang.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn Sản Phẩm cần Sửa");

        } else {
            if (confirmDelete()) {
                int a = Integer.valueOf(tbl_gioHang.getValueAt(i, 0).toString());
                if (rp.xoa(a) != 0) {
//                m = Integer.valueOf(tbl_gioHang.getValueAt(i, 1).toString());
                    n = Integer.valueOf(txt_soLuong.getText());
                    w = slsp + n;
                    String id = tbl_gioHang.getValueAt(i, 1).toString();
                    rp.update_sl(w, id);
                    fill_sp(rp.getall_sp());

                    JOptionPane.showMessageDialog(this, "Xoá Thành Công");
                    fill_hoaDon(rp.getall_HoaDon(rp.layIdHoaDon()));
                    txt_tongTien.setText(String.valueOf(rp.tinhTien(rp.layIdHoaDon())));
                    fiil_vc(rp.tim_DieuKien(txt_tongTien.getText()));
                } else {
                    JOptionPane.showMessageDialog(this, "Xoá Thát Bại");
                }
            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
//        i = tbl_sp.getSelectedRow();
        btn_vc.setEnabled(true);

        if (check()) {
            if (i < 0) {
                JOptionPane.showMessageDialog(this, "Vui Lòng chọn Sản Phẩm ");
            } else {
                int check = Integer.valueOf(tbl_sp.getValueAt(i, 4).toString());
                if (check > 0) {
                    if (rp.thanhToan(readForm()) != 0) {
                        m = Integer.valueOf(tbl_sp.getValueAt(i, 4).toString());
                        n = Integer.valueOf(txt_soLuong.getText());
                        w = m - n;
                        String id = tbl_sp.getValueAt(i, 0).toString();
                        rp.update_sl(w, id);
                        fill_sp(rp.getall_sp());
                        JOptionPane.showMessageDialog(this, "Them thanh cong");
                        fill_hoaDon(rp.getall_HoaDon(rp.layIdHoaDon()));

                        txt_tongTien.setText(String.valueOf(rp.tinhTien(rp.layIdHoaDon())));
                        fiil_vc(rp.tim_DieuKien(txt_tongTien.getText()));
                        this.reset();
                        tbl_sp.clearSelection();
                    } else {
                        JOptionPane.showMessageDialog(this, "Them that bai");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Không Đủ Số Lượng Sản Phẩm !! Vui Lòng Chọn Lại Số Lượng", "lỗi", 2);
                    txt_soLuong.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        i = tbl_gioHang.getSelectedRow();
        if (check()) {
            if (i < 0) {
                JOptionPane.showMessageDialog(this, "Vui Lòng chọn Sản Phẩm cần Sửa");

            } else {
                int a = Integer.valueOf(tbl_gioHang.getValueAt(i, 0).toString());
                if (rp.update(read(), a) != 0) {
                    int slbang = Integer.valueOf(tbl_gioHang.getValueAt(i, 6).toString());
                    n = Integer.valueOf(txt_soLuong.getText());
                    w = slsp + (slbang - n);
                    String id = tbl_gioHang.getValueAt(i, 1).toString();
                    rp.update_sl(w, id);
                    fill_sp(rp.getall_sp());
                    JOptionPane.showMessageDialog(this, "Sua thanh cong");
                    fill_hoaDon(rp.getall_HoaDon(rp.layIdHoaDon()));
                    txt_tongTien.setText(String.valueOf(rp.tinhTien(rp.layIdHoaDon())));
                    fiil_vc(rp.tim_DieuKien(txt_tongTien.getText()));
                } else {
                    JOptionPane.showMessageDialog(this, "Sua that bai");
                }
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed

        int idnv = rp.layIdNv();
        String a = txt_tongTien.getText().trim();
        String ten = rp.getTenNv(idnv);
        String ngayTao = rp.getNgayTao(rp.layIdHoaDon());

        double num = Double.valueOf(a);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#,###", symbols);
        String b = formatter.format(num);
        try {

            MessageFormat header = new MessageFormat("Hoá Đơn Thanh Toán : Shop Áo N5"
            );
            MessageFormat footer = new MessageFormat("-Ngày Tạo : " + ngayTao + "              - Tổng Tiền Thanh Toán: " + b + " VNĐ -\n"
            );
            tbl_gioHang.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (Exception e) {
            System.out.println(e);
        }
        btn_sua.setEnabled(false);
        btn_thanhToan.setEnabled(false);
        btn_them.setEnabled(false);
        btn_xoa.setEnabled(false);
        model = (DefaultTableModel) tbl_gioHang.getModel();
        model.setRowCount(0);
        i = tbl_vc.getSelectedRow();
        if (i > 0) {

            this.rp.update_hoaDonChiTiet(read2(), rp.layIdHoaDon());
            this.rp.update_hoaDon(read3(), rp.layIdHoaDon());
            JOptionPane.showMessageDialog(this, "Thanh Toán Thành Công Hoá Đơn : " + b + "  VNĐ ");
            model = (DefaultTableModel) tbl_vc.getModel();
            model.setRowCount(0);

        } else {

            this.rp.update_hoaDon(read3(), rp.layIdHoaDon());
            model = (DefaultTableModel) tbl_vc.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Thanh Toán Thành Công Hoá Đơn : " + b + "  VNĐ ");
        }
    }//GEN-LAST:event_btn_thanhToanActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_tongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tongTienActionPerformed

    private void tbl_spMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_spMouseClicked
        // TODO add your handling code here:
        i = tbl_sp.getSelectedRow();
        this.show_sp(i);
//        fill_sz(rp.getall_sz());
        fill_cl(rp.getall_sz());
        tbl_gioHang.clearSelection();
        btn_sua.setEnabled(false);
        btn_xoa.setEnabled(false);
//        btn_them.setEnabled(true);
    }//GEN-LAST:event_tbl_spMouseClicked

    private void txt_giaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_giaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_giaActionPerformed

    private void btn_taoDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoDonActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tbl_gioHang.getModel();
        model.setRowCount(0);
//        rp.themHoaDon();
        id = rp.layIdHoaDon();
        btn_them.setEnabled(true);
        btn_sua.setEnabled(true);
        btn_thanhToan.setEnabled(true);
        btn_xoa.setEnabled(true);

//        txt_tongTien.setText("" + id);
    }//GEN-LAST:event_btn_taoDonActionPerformed

    private void tbl_gioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gioHangMouseClicked
        // TODO add your handling code here:
        i = tbl_gioHang.getSelectedRow();
        if (tbl_gioHang.getValueAt(i, 0) == null) {
            JOptionPane.showMessageDialog(this, "Bảng đang trống.", "Thông báo", 2);
            return;
        } else {
            tbl_sp.clearSelection();
            i = tbl_gioHang.getSelectedRow();
//        btn_them.setEnabled(false);
            txt_color.setText(tbl_gioHang.getValueAt(i, 3).toString());
            cbb_sz.setSelectedItem(tbl_gioHang.getValueAt(i, 4));
            txt_soLuong.setText(tbl_gioHang.getValueAt(i, 6).toString());
            txt_id.setText(tbl_gioHang.getValueAt(i, 1).toString());
            txt_ten.setText(tbl_gioHang.getValueAt(i, 2).toString());
            txt_gia.setText(tbl_gioHang.getValueAt(i, 5).toString());
            slsp = rp.sl_sp(txt_id.getText());
            btn_xoa.setEnabled(true);
            btn_sua.setEnabled(true);
        }

    }//GEN-LAST:event_tbl_gioHangMouseClicked

    private void cbb_szActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_szActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_szActionPerformed

    private void btn_vcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vcActionPerformed
        // TODO add your handling code here:
        i = tbl_vc.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn VouCher ");
        } else {

            if (check_sl()) {
                float a = Float.valueOf(tbl_vc.getValueAt(i, 2).toString());
                float b = Float.valueOf(txt_tongTien.getText().toString());
                int sl = (Integer.valueOf(tbl_vc.getValueAt(i, 4).toString()) - 1);
                txt_tongTien.setText(String.valueOf(b - a));
                btn_vc.setEnabled(false);
                rp.update_slVoucher(sl, tbl_vc.getValueAt(i, 0).toString());
            }
        }
//        int a = Integer.valueOf(tbl_vc.getValueAt(i, 3).toString());
//        int b = Integer.valueOf(txt_tongTien.getText().toString());
//        txt_tongTien.setText(String.valueOf(a - b));
    }//GEN-LAST:event_btn_vcActionPerformed

    private void tbl_vcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vcMouseClicked
        // TODO add your handling code here:
        x = tbl_vc.getSelectedRow();
    }//GEN-LAST:event_tbl_vcMouseClicked

    private void txt_timKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKeyReleased
        // TODO add your handling code here:
        this.fill_sp(rp.search(txt_tim.getText()));

    }//GEN-LAST:event_txt_timKeyReleased

    private void txt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_colorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fill_sp(rp.getall_sp());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_taoDon;
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_vc;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JComboBox<String> cbb_sz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static final javax.swing.JPanel jpnRoot = new javax.swing.JPanel();
    private javax.swing.JTable tbl_gioHang;
    private javax.swing.JTable tbl_sp;
    private javax.swing.JTable tbl_vc;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_soLuong;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tim;
    private javax.swing.JTextField txt_tongTien;
    // End of variables declaration//GEN-END:variables

    public Boolean check() {
        String str = txt_soLuong.getText();

        if (txt_soLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống số lượng", "Thông Báo", 2);
            txt_soLuong.requestFocus();
            return false;
        }
        int a = Integer.valueOf(txt_soLuong.getText().toString());
        if (i < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng Không Thể Nhỏ Hơn 0 ", "Thông Báo", 3);
            txt_soLuong.requestFocus();
            return false;
        }

        int b = Integer.valueOf(tbl_sp.getValueAt(i, 4).toString());
        if (b - a < 0) {
            JOptionPane.showMessageDialog(this, " Số lượng Trong Kho Không Đủ", "Thông Báo", 0);
            txt_soLuong.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " Số lượng Sai Định dạng", "Thông Báo", 0);
            txt_soLuong.requestFocus();
            return false;
        }

    }

//    private void fill_sz(ArrayList<model.size> sz) {
//        for (model.size s : sz) {
//            cbb_color.addItem(s.getSz().toString());
//        }
//    }
    private void fill_cl(ArrayList<model.size> color) {
        for (model.size cl : color) {
            cbb_sz.addItem(cl.getSz().toString());
        }
    }

    private void fill_sp(ArrayList<model.BanHang> all_sp) {
        model = (DefaultTableModel) tbl_sp.getModel();
        model.setRowCount(0);
        for (model.BanHang object : all_sp) {
            model.addRow(object.data());
        }
    }

    void show_sp(int i) {

        txt_id.setText(tbl_sp.getValueAt(i, 0).toString());
        txt_ten.setText(tbl_sp.getValueAt(i, 1).toString());
        txt_gia.setText(tbl_sp.getValueAt(i, 2).toString());
        txt_color.setText(tbl_sp.getValueAt(i, 3).toString());

    }

    model.hoaDonChiTiet readForm() {
        int idSanPham = Integer.valueOf(txt_id.getText());
        String tenSP = txt_ten.getText();
        int soLuong = Integer.valueOf(txt_soLuong.getText());
        String sz = txt_color.getText().toString();
        String color = cbb_sz.getSelectedItem().toString();
        float gia = Float.valueOf(txt_gia.getText());
        float khuyenmai;
        int idNhanVien;
        int idHoaDon = rp.layIdHoaDon();
        float tongTien = soLuong * gia;

        return new hoaDonChiTiet(idSanPham, tenSP, soLuong, sz, color, gia, z, idHoaDon, tongTien);
    }

    private void fill_hoaDon(ArrayList<model.hoaDonChiTiet> all_HoaDon) {
        model = (DefaultTableModel) tbl_gioHang.getModel();
        model.setRowCount(0);
        for (model.hoaDonChiTiet a : all_HoaDon) {
            model.addRow(a.datahd());
        }
    }

    model.hoaDonChiTiet read() {
        String sz = txt_color.getText().toString();
        String color = cbb_sz.getSelectedItem().toString();
        int soLuong = Integer.valueOf(txt_soLuong.getText());

        return new hoaDonChiTiet(id, soLuong, sz, color);
    }

    private void fiil_vc(ArrayList<model.voucher> all_vouCher) {

        model = (DefaultTableModel) tbl_vc.getModel();
        model.setRowCount(0);
        for (model.voucher a : all_vouCher) {
            model.addRow(a.todata());
        }
    }

    model.hoaDonChiTiet read2() {
        int a = Integer.valueOf(tbl_vc.getValueAt(x, 0).toString());
        return new hoaDonChiTiet(a);
    }

    model.HoaDon read3() {
        float a = Float.valueOf(tbl_vc.getValueAt(x, 2).toString());
        float b = Float.valueOf(txt_tongTien.getText().trim());
        return new HoaDon(a, b);
    }

    public Boolean check_sl() {
        int sl = Integer.valueOf(tbl_vc.getValueAt(i, 4).toString());
        if (sl < 1) {
            JOptionPane.showMessageDialog(this, "Số Lượng VouCher Đang Hết", "Thông Báo", 2);
            return false;
        }
        return true;
    }
}
