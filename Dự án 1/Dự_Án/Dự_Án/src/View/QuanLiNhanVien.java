/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import DAO.DAO_NhaVien;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class QuanLiNhanVien extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    private DAO.DAO_NhaVien repo = new DAO_NhaVien();
 private ArrayList<NhanVien> ds = new ArrayList<>();
private  int p;
    public QuanLiNhanVien() {
        initComponents();
        this.filltotable();
//        this.filltotableform(repo.getdata(txtSearch.getText()).size() - 1);

    }

    public void filltotable() {
        defaultTableModel = (DefaultTableModel) tblNhanVien.getModel();
        defaultTableModel.setRowCount(0);
        for (NhanVien nv : repo.getdata(txtSearch.getText())) {
            defaultTableModel.addRow(nv.form());
        }
    }

    public void filltotableform(int index) {

        NhanVien nv = repo.getdata(txtSearch.getText()).get(index);

        // Điền dữ liệu vào các trường văn bản từ đối tượng NhanVien
        txtID.setText(String.valueOf(nv.getId_Nvien()));
        txtten.setText(nv.getTen());
        txtEmail.setText(nv.getEmail());
        txtSDT.setText(nv.getSdt());
        txtDiachi.setText(nv.getDiachi());
        txttaikhoan.setText(nv.getTaikhoan());
        txtpass.setText(nv.getPasswords());

        // Xóa lựa chọn trước đó
        rdokho.setSelected(false);
        rdonvthungna.setSelected(false);
        rdoad.setSelected(false);

        // Đặt nút radio dựa trên giá trị từ bảng
        String tableValue = tblNhanVien.getValueAt(p, 1).toString();
        switch (tableValue) {
            case "3":
                rdokho.setSelected(true);
                break;
            case "2":
                rdonvthungna.setSelected(true);
                break;
            case "1":
                rdoad.setSelected(true);
                break;
            default:
                // Có thể xử lý các giá trị không mong muốn tại đây
                break;
        }
    }

    public NhanVien readform() {
        NhanVien nv = new NhanVien();
        nv.setId_Nvien(Integer.parseInt(txtID.getText()));
        if (rdokho.isSelected()) {
            nv.setId_role(3);
        }
        if (rdonvthungna.isSelected()) {
            nv.setId_role(2);
        }
        nv.setTen(txtten.getText());
        nv.setEmail(txtEmail.getText());
        nv.setSdt(txtSDT.getText());
        nv.setDiachi(txtDiachi.getText());
        nv.setTaikhoan(txttaikhoan.getText());
        nv.setPasswords(txtpass.getText());
        return nv;
    }

    public Boolean check1() {
        if (txtten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Tên ");
            txtten.requestFocus();
            return false;
        }

        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Số Email ");
            txtEmail.requestFocus();
            return false;
        }

        // Kiểm tra định dạng email trước khi tiếp tục
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!txtEmail.getText().matches(emailPattern)) {
            JOptionPane.showMessageDialog(this, "Định dạng Email không hợp lệ");
            txtEmail.requestFocus();
            return false;
        }

        if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống SĐT ");
            txtSDT.requestFocus();
            return false;
        }

        // Kiểm tra số điện thoại
        String str = txtSDT.getText();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số điện thoại sai");
            txtSDT.requestFocus();
            return false;
        }

        if (txtDiachi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Địa chỉ ");
            txtDiachi.requestFocus();
            return false;
        }

        if (txttaikhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống tài khoản ");
            txttaikhoan.requestFocus();
            return false;
        }

        if (txtpass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Mật Khẩu ");
            txtpass.requestFocus();
            return false;
        }
        ds= repo.getAll_TaiKhoan();
        String a= tblNhanVien.getValueAt(p, 6).toString();
        String b=txttaikhoan.getText().trim();
        for (NhanVien d : ds) {
            if (d.getTaikhoan().equals(b)&&!b.equals(a)) {
                JOptionPane.showMessageDialog(this, "Tài Khoản Đã Tồn Tại Vui Lòng Thử Lại", "Thông Báo", 2);
                return false;
            }
        }
        if (!rdokho.isSelected()&&!rdonvthungna.isSelected()) {
              JOptionPane.showMessageDialog(this, "Chưa Chọn chức vụ", "Thông Báo", 3);
            return false;
            
        }
        return true;
    }

    public void reset() {
        txtEmail.setText(null);
        txtDiachi.setText(null);
        txtID.setText(null);
        txtSDT.setText(null);
        txtSearch.setText(null);
        txtpass.setText(null);
        txttaikhoan.setText(null);
        txtten.setText(null);
        buttonGroup1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        refersh = new javax.swing.JButton();
        txttaikhoan = new javax.swing.JTextField();
        btnsua = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        rdonvthungna = new javax.swing.JRadioButton();
        rdoad = new javax.swing.JRadioButton();
        rdokho = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jpnRoot.setBackground(new java.awt.Color(204, 204, 255));
        jpnRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ID Nhân Viên");
        jpnRoot.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 166, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tên Nhân Viên");
        jpnRoot.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 244, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        jpnRoot.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 244, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Tài Khoản");
        jpnRoot.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 166, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Địa Chỉ");
        jpnRoot.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 322, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Số Điện Thoại");
        jpnRoot.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 322, -1, -1));

        txtSDT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jpnRoot.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 365, 329, -1));

        txtten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jpnRoot.add(txtten, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 277, 329, -1));

        refersh.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        refersh.setText("Refersh");
        refersh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refershActionPerformed(evt);
            }
        });
        jpnRoot.add(refersh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1352, 537, -1, -1));

        txttaikhoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jpnRoot.add(txttaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 199, 329, -1));

        btnsua.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnsua.setText("Update");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });
        jpnRoot.add(btnsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 537, -1, -1));

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jpnRoot.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 199, 329, -1));

        txtpass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jpnRoot.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 277, 329, -1));
        jpnRoot.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 588, 848, 10));

        tblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Nhân Viên", "ID Role", "Họ Và tên", "Email", "Số Điện Thoại", "Địa Chỉ", "Tài Khoản", "Mật Khẩu"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        jpnRoot.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 604, 1699, 350));

        txtSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearch.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        txtSearch.setMargin(new java.awt.Insets(0, 6, 0, 6));
        txtSearch.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jpnRoot.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 187, 521, 39));

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        jpnRoot.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 365, 329, 63));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Danh Sách Nhân Viên");
        jpnRoot.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 28, -1, -1));

        btnthem.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnthem.setText("Add");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });
        jpnRoot.add(btnthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 537, 80, -1));

        btnxoa.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnxoa.setText("Delete");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });
        jpnRoot.add(btnxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1162, 537, -1, -1));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jpnRoot.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1454, 537, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Email");
        jpnRoot.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 398, -1, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jpnRoot.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 440, 329, -1));

        buttonGroup1.add(rdonvthungna);
        rdonvthungna.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdonvthungna.setText("Nhân Viên Bán Hàng");
        jpnRoot.add(rdonvthungna, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 331, -1, -1));

        buttonGroup1.add(rdoad);
        rdoad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdoad.setText("Quản Lí");
        rdoad.setEnabled(false);
        rdoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoadActionPerformed(evt);
            }
        });
        jpnRoot.add(rdoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 444, 80, -1));

        buttonGroup1.add(rdokho);
        rdokho.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdokho.setText("Nhân  Viên Kho");
        rdokho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdokhoActionPerformed(evt);
            }
        });
        jpnRoot.add(rdokho, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 384, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Chức vụ");
        jpnRoot.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Tìm Kiếm Nhân Viên");
        jpnRoot.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 160, -1, -1));

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

    private void refershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refershActionPerformed
        // TODO add your handling code here:
        btnthem.setEnabled(true);
        btnsua.setEnabled(true);
        btnxoa.setEnabled(true);
        clear.setEnabled(true);
        tblNhanVien.clearSelection();
        this.reset();
    }//GEN-LAST:event_refershActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void rdokhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdokhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdokhoActionPerformed

    private void rdoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoadActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        btnthem.setEnabled(false);
        btnxoa.setEnabled(true);
        btnsua.setEnabled(true);
//        btnthem.setEnabled(false);
         p = tblNhanVien.getSelectedRow();
        filltotableform(p);
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        int i;
        i = tblNhanVien.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn nhân viên cần sửa");
            return;
        }
        if (check1()) {
             try {
            repo.update(readform());
            filltotable();
            JOptionPane.showMessageDialog(this, "Sửa Thành Công");
            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // In lỗi ra để giúp chẩn đoán
        }
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        int i;
        i = tblNhanVien.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn nhân viên cần xoá");
            return;
        }

        try {
            repo.xoa(readform());
            filltotable();
            JOptionPane.showMessageDialog(this, "Xóa Thành Công");
            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        filltotable();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        int i;
        i = tblNhanVien.getSelectedRow();
//        if (i < 0) {
//            JOptionPane.showMessageDialog(this, "Vui Lòng chọn nhân viên cần thêm");
//            return;
//        }
        if (check1()) {
            if (repo.themnv(readform()) != 0) {
                JOptionPane.showMessageDialog(this, "Them thanh cong");
                  reset();
                filltotable();
            } else {
                JOptionPane.showMessageDialog(this, "Them that bai");
            }
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        btnthem.setEnabled(true);
        btnsua.setEnabled(false);
        btnxoa.setEnabled(false);
        clear.setEnabled(false);
        reset();

    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
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
    private javax.swing.JSeparator jSeparator1;
    public static final javax.swing.JPanel jpnRoot = new javax.swing.JPanel();
    private javax.swing.JRadioButton rdoad;
    private javax.swing.JRadioButton rdokho;
    private javax.swing.JRadioButton rdonvthungna;
    private javax.swing.JButton refersh;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txttaikhoan;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
