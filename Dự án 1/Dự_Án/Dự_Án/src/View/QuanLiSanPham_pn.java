package View;

import DAO.DAO_Color;
import DAO.DAO_NhanHang;
import DAO.DAO_SanPham;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanHang;
import model.SanPham;

public class QuanLiSanPham_pn extends javax.swing.JPanel {

    private static Connection conn;
    List<SanPham> arrSP = new ArrayList<>();
    DAO_SanPham sp = new DAO_SanPham();
    DAO_NhanHang nh = new DAO_NhanHang();
    DAO.DAO_Color cl = new DAO_Color();
    ArrayList<Integer> idNh = new ArrayList();
    ArrayList<Integer> idSP = new ArrayList();
    ArrayList<Integer> idCl = new ArrayList();
    private String anh = "D/...";

    public QuanLiSanPham_pn() {
        initComponents();
        conn = ConnectDB.ConnectDB.getConN();
        this.fillToTbl();
        this.fillToCBB();
        txtIdSP.setEnabled(false);
        idNh = nh.idNH();
        idSP = sp.idSP();
        idCl = cl.idCl();
    }

    public void fillToCBB() {
        ArrayList arrChatLieu = new ArrayList();
        ArrayList arrNH = new ArrayList();
        ArrayList arrCl = new ArrayList();
        try {
            String sql = ("select ChatLieu from ChatLieu_sp");
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                arrChatLieu.add(rs.getString(1));
            }

            String sql3 = ("select TenNhanHang from NhanHang_SP");
            ps = conn.prepareStatement(sql3);
            rs = ps.executeQuery();
            while (rs.next()) {
                arrNH.add(rs.getString(1));
            }
            String sql2 = ("select color from color_SP");
            ps = conn.prepareStatement(sql2);
            rs = ps.executeQuery();
            while (rs.next()) {
                arrCl.add(rs.getString(1));
            }

            String[] ChatLieu = new String[arrChatLieu.size()];
            arrChatLieu.toArray(ChatLieu);

            String[] NH = new String[arrNH.size()];
            arrNH.toArray(NH);
            
            String[] color = new String[arrCl.size()];
            arrCl.toArray(color);

            CBBChatLieu.setModel(new DefaultComboBoxModel(ChatLieu));
            CBNhanHang.setModel(new DefaultComboBoxModel(NH));
            CBBColor.setModel(new DefaultComboBoxModel(color));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void fillToTbl() {
        String[] title = {"ID", "Tên sản phẩm", "Tên nhãn hàng", "Hàng tồn", "Giá","Màu Sắc", "Mô tả", "Chất liệu", "Hình Ảnh"};
        DefaultTableModel model = new DefaultTableModel(title, 0);
        arrSP = sp.arrSP();
        for (SanPham o : arrSP) {
            Object[] rows = {o.getIdSP(), o.getTenSP(), o.getNhanHang(), o.getSoLuong(), o.getGia(),o.getColor(), o.getMoTa(), o.getChatLieu(), o.getHinh()};
            model.addRow(rows);
        }
        tblSanPham.setModel(model);
    }

    public void fillToTbl2() {
        String[] title = {"ID", "Tên sản phẩm", "Tên nhãn hàng", "Hàng tồn", "Giá","Màu Sắc", "Mô tả", "Chất liệu", "Hình Ảnh"};
        DefaultTableModel model = new DefaultTableModel(title, 0);
        for (SanPham o : arrSP) {
            Object[] rows = {o.getIdSP(), o.getTenSP(), o.getNhanHang(), o.getSoLuong(), o.getGia(),o.getColor(), o.getMoTa(), o.getChatLieu(), o.getHinh()};
            model.addRow(rows);
        }
        tblSanPham.setModel(model);
    }

    public boolean checkNull() {
        if (txtTenSP.getText().isEmpty() || txtSoLuong.getText().isEmpty() || txtGia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
            return false;
        } else {
            return true;
        }

    }

    public boolean checkId() {
        for (int i = 0; i < idSP.size(); i++) {
            if (idSP.get(i) == Integer.parseInt(txtIdSP.getText())) {
                JOptionPane.showMessageDialog(this, "Mã đã bị trùng");
                return false;
            }
        }
        return true;
    }

    public boolean checkSo() {
        try {
            int soluong = 0;
            double gia = 0;
            soluong = Integer.parseInt(txtSoLuong.getText());
            gia = Double.parseDouble(txtGia.getText());
            if (soluong > 0 && gia > 0) {
                return true;
            } else if (soluong <= 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng lớn hơn 0", "Lỗi ", 1);
                return false;
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập Giá tiền lớn hơn 0", "Lỗi ", 1);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá trị số lượng hoặc tiền nhập vào không hợp lệ", "Lỗi ", 1);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        txtFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdSP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        CBNhanHang = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CBBChatLieu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnew = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        lbl_anh = new javax.swing.JLabel();
        CBBColor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jpnRoot.setBackground(new java.awt.Color(232, 211, 222));
        jpnRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        jpnRoot.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 276, 1216, 693));

        txtFind.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtFind.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        txtFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFindMouseReleased(evt);
            }
        });
        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });
        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindKeyReleased(evt);
            }
        });
        jpnRoot.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(1122, 242, 306, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Tìm Kiếm");
        jpnRoot.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 245, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Danh Sách Sản Phẩm");
        jpnRoot.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 6, 261, -1));

        txtIdSP.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtIdSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSPActionPerformed(evt);
            }
        });
        jpnRoot.add(txtIdSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 153, 300, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Tên Sản Phẩm");
        jpnRoot.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 203, -1, -1));

        txtTenSP.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });
        jpnRoot.add(txtTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, 300, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Nhãn Hàng");
        jpnRoot.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 279, -1, -1));

        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });
        jpnRoot.add(txtSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 539, 300, -1));

        CBNhanHang.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CBNhanHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBNhanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNhanHangActionPerformed(evt);
            }
        });
        jpnRoot.add(CBNhanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 311, 300, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Chât Liệu");
        jpnRoot.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 355, -1, -1));

        CBBChatLieu.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CBBChatLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpnRoot.add(CBBChatLieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 387, 300, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Hàng tồn");
        jpnRoot.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 507, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Giá");
        jpnRoot.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 577, -1, -1));

        txtGia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaActionPerformed(evt);
            }
        });
        jpnRoot.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 609, 300, -1));

        btAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btAdd.setText("Add");
        btAdd.setBorderPainted(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        jpnRoot.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 834, 100, -1));

        btDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btDelete.setText("Delete");
        btDelete.setBorderPainted(false);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        jpnRoot.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 910, 100, -1));

        btUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btUpdate.setText("Update");
        btUpdate.setBorderPainted(false);
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        jpnRoot.add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 834, 100, -1));

        btClear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btClear.setText("Clear");
        btClear.setBorderPainted(false);
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        jpnRoot.add(btClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 910, 100, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("ID Sản Phẩm");
        jpnRoot.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 121, -1, -1));

        btnew.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnew.setText("Refersh");
        btnew.setBorderPainted(false);
        btnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewActionPerformed(evt);
            }
        });
        jpnRoot.add(btnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(1563, 242, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Mô Tả");
        jpnRoot.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 653, -1, -1));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        jpnRoot.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 685, 300, 100));

        lbl_anh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_anh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_anhMouseClicked(evt);
            }
        });
        jpnRoot.add(lbl_anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1434, 6, 222, 218));

        CBBColor.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        CBBColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpnRoot.add(CBBColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 463, 300, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Màu Sắc");
        jpnRoot.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 431, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/MegaTron.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jpnRoot.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 1010));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSPActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        int i = tblSanPham.getSelectedRow();
        if (i > 0) {
            int choose = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không", "Comfirm", JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                try {
                    String sql = ("delete from sanPham where idSanPham=?");
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setInt(1, Integer.parseInt(txtIdSP.getText()));
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillToTbl();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn Nhãn hàng cần Xoá", "Thông Báo", 2);
            return;
        }

    }//GEN-LAST:event_btDeleteActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int row = tblSanPham.getSelectedRow();
        SanPham sp = arrSP.get(row);
        txtIdSP.setText(String.valueOf(sp.getIdSP()));
        txtTenSP.setText(sp.getTenSP());
        txtSoLuong.setText(String.valueOf(sp.getSoLuong()));
        txtGia.setText(String.valueOf(sp.getGia()));
        CBNhanHang.setSelectedItem(sp.getNhanHang());
        txtMoTa.setText(sp.getMoTa());
        CBBChatLieu.setSelectedItem(sp.getChatLieu());
        ImageIcon a = new ImageIcon(tblSanPham.getValueAt(row, 8).toString());
        lbl_anh.setIcon(a);
        btClear.setEnabled(true);
        btDelete.setEnabled(true);
        btUpdate.setEnabled(true);
        btAdd.setEnabled(false);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if (checkNull()) {
//            if (checkId()) {
            if (checkSo()) {
                try {
//                    String hinh = anh;
// , ?
                    String sql = ("insert into sanPham values(?,?,?,?,?,?,?,?,?)");
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, txtTenSP.getText());
                    ps.setFloat(2, Float.valueOf(txtGia.getText()));
                    ps.setString(3, txtMoTa.getText());
                    ps.setInt(4, Integer.valueOf(txtSoLuong.getText()));
                    int idChoose = CBNhanHang.getSelectedIndex();
                    switch (idChoose) {
                        case 0:
                            ps.setInt(5, idNh.get(0));
                            break;
                        case 1:
                            ps.setInt(5, idNh.get(1));
                            break;
                        case 2:
                            ps.setInt(5, idNh.get(2));
                            break;
                        case 3:
                            ps.setInt(5, idNh.get(3));
                            break;
                        case 4:
                            ps.setInt(5, idNh.get(4));
                            break;
                        case 5:
                            ps.setInt(5, idNh.get(5));
                            break;
                        case 6:
                            ps.setInt(5, idNh.get(6));
                            break;
                        case 7:
                            ps.setInt(5, idNh.get(7));
                            break;
                        case 8:
                            ps.setInt(5, idNh.get(8));
                            break;
                        case 9:
                            ps.setInt(5, idNh.get(9));
                            break;
                    }

                    ps.setInt(6, CBBChatLieu.getSelectedIndex() + 1);
                    ps.setInt(7, 1);
//                    ps.setInt(8, 1);
                    ps.setInt(8, CBBColor.getSelectedIndex()+1);
                    ps.setString(9, anh);
                    ps.executeUpdate();
                    fillToTbl();
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
//            }
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        txtGia.setText(null);
        txtFind.setText(null);
        txtSoLuong.setText(null);
        txtTenSP.setText(null);
        txtMoTa.setText(null);
        txtIdSP.setText(null);
        btClear.setEnabled(false);
        btDelete.setEnabled(false);
        btUpdate.setEnabled(false);
        btAdd.setEnabled(true);
//        ArrayList listId = new ArrayList<>();
//        for (SanPham sp : arrSP) {
//            listId.add(sp.getIdSP());
//        }
//        int id = 0;
//
//        id = (int) Collections.max(listId) + 1;
//
//        txtIdSP.setText(String.valueOf(id));
//        fillToTbl();
//        txtMoTa.setText(null);

    }//GEN-LAST:event_btClearActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        int i = tblSanPham.getSelectedRow();
        if (i > 0) {
            if (checkNull()) {
                if (checkSo()) {
                    try {
                        String sql = ("Update sanPham set tenSP = ?, gia = ?, id_NhanHang = ?, soLuong = ?, moTa =?, Id_ChatLieu = ? where IdSanPham = ?");
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, txtTenSP.getText());
                        ps.setFloat(2, Float.valueOf(txtGia.getText()));
                        int idChoose = CBNhanHang.getSelectedIndex();
                        switch (idChoose) {
                            case 0:
                                ps.setInt(3, idNh.get(0));
                                break;
                            case 1:
                                ps.setInt(3, idNh.get(1));
                                break;
                            case 2:
                                ps.setInt(3, idNh.get(2));
                                break;
                            case 3:
                                ps.setInt(3, idNh.get(3));
                                break;
                            case 4:
                                ps.setInt(3, idNh.get(4));
                                break;
                            case 5:
                                ps.setInt(3, idNh.get(5));
                                break;
                            case 6:
                                ps.setInt(3, idNh.get(6));
                                break;
                            case 7:
                                ps.setInt(3, idNh.get(7));
                                break;
                            case 8:
                                ps.setInt(3, idNh.get(8));
                                break;
                            case 9:
                                ps.setInt(3, idNh.get(9));
                                break;
                        }
                        ps.setInt(4, Integer.parseInt(txtSoLuong.getText()));
                        ps.setString(5, txtMoTa.getText());
                        ps.setInt(6, CBBChatLieu.getSelectedIndex() + 1);
                        ps.setInt(7, Integer.valueOf(txtIdSP.getText()));
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                        fillToTbl();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn Nhãn hàng cần Sửa");
            return;
        }

    }//GEN-LAST:event_btUpdateActionPerformed

    private void txtFindMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFindMouseReleased

    }//GEN-LAST:event_txtFindMouseReleased

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void txtFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyReleased
        arrSP.clear();
        try {
            String sql = (" select idSanPham, TenSP, TenNhanHang,SoLuong, Gia,moTa, ChatLieu from sanPham \n"
                    + "join NhanHang_Sp on sanPham.Id_NhanHang = NhanHang_Sp.id_Nh \n"
                    + "join ChatLieu_Sp on sanPham.Id_ChatLieu=ChatLieu_SP.Id_Cl\n"
                    + "where CAST(Id_Nh AS NVARCHAR) LIKE '%" + txtFind.getText().trim() + "%' or TenSP like N'%" + txtFind.getText().trim() + "'or TenNhanHang LIKE '%" + txtFind.getText().trim() + "%' ");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                SanPham sP = new SanPham();
                sP.setIdSP(rs.getInt(1));
                sP.setTenSP(rs.getString(2));
                sP.setNhanHang(rs.getString(3));
                sP.setSoLuong(rs.getInt(4));
                sP.setGia(rs.getFloat(5));
                sP.setMoTa(rs.getString(6));
                sP.setChatLieu(rs.getString(7));
                arrSP.add(sP);
            }
            fillToTbl2();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtFindKeyReleased

    private void CBNhanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNhanHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBNhanHangActionPerformed

    private void btnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewActionPerformed
        // TODO add your handling code here:
        fillToTbl();
        txtFind.setText(null);
        btClear.setEnabled(true);
        btDelete.setEnabled(true);
        btUpdate.setEnabled(true);
        btAdd.setEnabled(true);

    }//GEN-LAST:event_btnewActionPerformed

    private void lbl_anhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_anhMouseClicked
        // TODO add your handling code here:
        JFileChooser ch = new JFileChooser();
        int kq = ch.showOpenDialog(null);
        if (kq == JFileChooser.APPROVE_OPTION) {
            anh = ch.getSelectedFile().getPath();
            ImageIcon a = new ImageIcon(anh);
            lbl_anh.setIcon(a);
        }
    }//GEN-LAST:event_lbl_anhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBBChatLieu;
    private javax.swing.JComboBox<String> CBBColor;
    private javax.swing.JComboBox<String> CBNhanHang;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btUpdate;
    private javax.swing.JButton btnew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    public static final javax.swing.JPanel jpnRoot = new javax.swing.JPanel();
    private javax.swing.JLabel lbl_anh;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtIdSP;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
