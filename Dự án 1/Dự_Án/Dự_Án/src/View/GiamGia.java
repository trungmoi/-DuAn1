//                                 \d{4}-\d{2}-\d{2}
package View;

import DAO.Dao_GiamGia;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import model.voucher;

public class GiamGia extends javax.swing.JPanel {

    private DAO.Dao_GiamGia rp = new Dao_GiamGia();
    private DefaultTableModel model = new DefaultTableModel();
    private int i;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    private int y = rp.layId_role();
//    private int z = rp.layIdNv();
    private int x;
    int id;

    public GiamGia() {
        initComponents();
        fill_voucher((ArrayList<voucher>) rp.getallvoucher());
    }

    public void filltotable() {
        model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        for (voucher nv : rp.getdata(txttim.getText())) {
            model.addRow(nv.todata_vc());
        }
    }

    model.voucher readForm() {
        String tenvoucher = txtten.getText();
        float sotiengiam = Float.valueOf(txtsotiengiam.getText());
        float dieukien = Float.valueOf(txtdieukien.getText());
        int soluong = Integer.valueOf(txtsoluong.getText());
        Date selectedDate = date.getDate();
        String a = dateFormat.format(selectedDate);
        return new voucher(tenvoucher, sotiengiam, dieukien, soluong, a);
    }

    public Boolean check1() {
        String str = txtdieukien.getText();
        String st = txtsotiengiam.getText();
        Date selectedDate = date.getDate();
        if (txtten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Tên ");
            txtten.requestFocus();
            return false;
        }
        if (txtsotiengiam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Số Tiền Giảm ");
            return false;
        }
        if (txtdieukien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Điều Kiện ");
            txtdieukien.requestFocus();
            return false;
        }
        if (txtsoluong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trống Số Lượng ");
            txtsoluong.requestFocus();
            return false;
        }
        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Trống Ngày hết hạn ");
            date.requestFocus();
            return false;
        }
        try {
            float a = Float.parseFloat(st);
            if (a < 0) {
                JOptionPane.showMessageDialog(this, "Sai Định dạng Phải Số Không Thể Âm");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sai Định dạng Phải Là Số, Không Phải Kí Tự");
            txtsotiengiam.requestFocus();
            return false;
        }
        try {
            float b = Float.parseFloat(str);
            if (b < 0) {
                JOptionPane.showMessageDialog(this, "Sai Định dạng PhảiLà Số, Không Thể Âm");
                return false;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Sai Định dạng Phải Là Số, Không Phải Kí Tự");
            txtdieukien.requestFocus();
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        txtid = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txttim = new javax.swing.JTextField();
        txtsotiengiam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdieukien = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        Them = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        refersh = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtngaytao = new javax.swing.JTextField();
        txtsoluong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Voucher", "Tên Voucher", "Số Tiền Có thể Giảm", "Điều Kiện Hoá Đơn Để Giảm", "Số Lượng", "Ngày Tạo Voucher", "Ngày Hết Hạn"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMinWidth(100);
            Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 456, 1338, -1));

        txtid.setEnabled(false);
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 175, 250, 30));

        txtten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenActionPerformed(evt);
            }
        });
        jPanel1.add(txtten, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 175, 250, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kho Voucher");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 17, 220, 45));

        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimKeyReleased(evt);
            }
        });
        jPanel1.add(txttim, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 359, 361, 36));

        txtsotiengiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsotiengiamActionPerformed(evt);
            }
        });
        jPanel1.add(txtsotiengiam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 279, 250, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("ID Voucher");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 143, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Tên Voucher");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 143, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Số Tiền Giảm");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 247, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Điều Kiện Hoá Đơn ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 247, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Tìm Kiếm voucher");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 359, -1, 36));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Ngày Hết Hạn");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1187, 327, -1, -1));
        jPanel1.add(txtdieukien, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 279, 250, 30));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1409, 930, 109, 36));

        Them.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Them.setText("Thêm Voucher");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });
        jPanel1.add(Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 930, -1, 36));

        Sua.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Sua.setText("Sửa Voucher");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });
        jPanel1.add(Sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(1172, 930, -1, 36));

        Xoa.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Xoa.setText("Xoá Voucher");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });
        jPanel1.add(Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1037, 930, -1, 36));

        refersh.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        refersh.setText("Refersh");
        refersh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refershActionPerformed(evt);
            }
        });
        jPanel1.add(refersh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1307, 930, -1, 36));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Ngày Tạo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 327, -1, -1));

        txtngaytao.setEnabled(false);
        txtngaytao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaytaoActionPerformed(evt);
            }
        });
        jPanel1.add(txtngaytao, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 359, 250, 30));

        txtsoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoluongActionPerformed(evt);
            }
        });
        jPanel1.add(txtsoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 175, 250, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Số Lượng");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 143, -1, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 360, 260, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/MegaTron.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 1140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsotiengiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsotiengiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsotiengiamActionPerformed

    private void txttenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenActionPerformed

    private void refershActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refershActionPerformed
        // TODO add your handling code here:
        txttim.setText(null);
        Them.setEnabled(true);
        Sua.setEnabled(true);
        Xoa.setEnabled(true);
        refersh.setEnabled(true);
        clear.setEnabled(true);
        this.fill_voucher((ArrayList<voucher>) rp.getallvoucher());
    }//GEN-LAST:event_refershActionPerformed

    private void txtngaytaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaytaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaytaoActionPerformed

    private void txtsoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoluongActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
        // TODO add your handling code here:

        i = Table.getSelectedRow();
        if (check1()) {
            if (i < 0) {
                JOptionPane.showMessageDialog(this, "Vui Lòng chọn Voucher cần Sửa");

            } else {
//                String b = txtngayhethan.getText().trim();
                String a = (Table.getValueAt(i, 0).toString());
                if (rp.updatevc(readForm(), a) != 0) {
                    JOptionPane.showMessageDialog(this, "Sua thanh cong");
                    fill_voucher((ArrayList<voucher>) rp.getallvoucher());
                } else {
                    JOptionPane.showMessageDialog(this, "Sua that bai");
                }
            }
        }
    }//GEN-LAST:event_SuaActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        // TODO add your handling code here:
        i = Table.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(this, "Vui Lòng chọn Voucher cần Xoá");

        } else {
            int a = Integer.valueOf(Table.getValueAt(i, 0).toString());
            if (rp.xoa(a) != 0) {
                JOptionPane.showMessageDialog(this, "Xoá Thành Công");
                fill_voucher((ArrayList<voucher>) rp.getallvoucher());
            } else {
                JOptionPane.showMessageDialog(this, "Xoá Thát Bại");
            }
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        // TODO add your handling code here:

        if (check1()) {
            if (rp.themvoucher(readForm()) != 0) {
                JOptionPane.showMessageDialog(this, "Them thanh cong");
//                x = rp.layId_vc();
//                this.rp.them(txtngayhethan.getText().trim(), x);
                fill_voucher((ArrayList<voucher>) rp.getallvoucher());
            } else {
                JOptionPane.showMessageDialog(this, "Them that bai");
            }
        }

    }//GEN-LAST:event_ThemActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        Them.setEnabled(false);
        Sua.setEnabled(true);
        Xoa.setEnabled(true);
        refersh.setEnabled(true);
        clear.setEnabled(true);
        i = Table.getSelectedRow();
        this.show_vc(i);
    }//GEN-LAST:event_TableMouseClicked

    private void txttimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyReleased
        // TODO add your handling code here:
        filltotable();

    }//GEN-LAST:event_txttimKeyReleased

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        txtdieukien.setText(null);
        txtid.setText(null);
//        txtngayhethan.setText(null);
        txtngaytao.setText(null);
        txtsoluong.setText(null);
        txtsotiengiam.setText(null);
        txtten.setText(null);
        txttim.setText(null);
        Them.setEnabled(true);
        Sua.setEnabled(false);
        Xoa.setEnabled(false);
        refersh.setEnabled(false);
        clear.setEnabled(false);
    }//GEN-LAST:event_clearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sua;
    private javax.swing.JTable Table;
    private javax.swing.JButton Them;
    private javax.swing.JButton Xoa;
    private javax.swing.JButton clear;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refersh;
    private javax.swing.JTextField txtdieukien;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtngaytao;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txtsotiengiam;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
private void filltim(ArrayList<model.voucher> list) {
        DefaultTableModel DefaultTableModel = (DefaultTableModel) Table.getModel();
        DefaultTableModel.setRowCount(0);

        for (model.voucher model_voucher : list) {
            DefaultTableModel.addRow(model_voucher.todata());

        }

    }

    private void fill_voucher(ArrayList<model.voucher> all_vouCher) {
        model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        for (model.voucher a : all_vouCher) {
            model.addRow(a.todata_vc());
        }
    }

    private void show_vc(int i) {
        txtid.setText(Table.getValueAt(i, 0).toString());
        txtten.setText(Table.getValueAt(i, 1).toString());
        txtsotiengiam.setText(Table.getValueAt(i, 2).toString());
        txtdieukien.setText(Table.getValueAt(i, 3).toString());
        txtsoluong.setText(Table.getValueAt(i, 4).toString());
        txtngaytao.setText(Table.getValueAt(i, 5).toString());
        try {
            i = Table.getSelectedRow();
            Date a = new SimpleDateFormat("yyyy-MM-dd").parse((String)Table.getValueAt(i, 6).toString());
            date.setDate(a);
        } catch (Exception e) {
            System.out.println(e);
        }
//        String a = dateFormat.parse(i, dateFormat);
//        if (Table.getValueAt(i, 6) == null) {
//            txtngayhethan.setText("Error");
//        } else {
//            txtngayhethan.setText(Table.getValueAt(i, 6).toString());
//        }
    }
}
