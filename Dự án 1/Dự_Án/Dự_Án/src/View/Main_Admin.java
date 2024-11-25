package View;

import DAO.DAO_banHang;
import controller.ChuyenManHinh;
import controller.MenuBar;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main_Admin extends javax.swing.JFrame {

    private DAO.DAO_banHang rp = new DAO_banHang();
    private int i;

    Color colorDefault = new Color(42, 58, 73);

    public Main_Admin() {
        initComponents();
        cv();
        setLocationRelativeTo(null);
        ChuyenManHinh control = new ChuyenManHinh(jpnRoot);
        control.setView();

        List<MenuBar> listMenu = new ArrayList<>();
        listMenu.add(new MenuBar("NhanHang", jPanel6, jLabel5));
        listMenu.add(new MenuBar("SanPham", jPanel7, jLabel6));
        listMenu.add(new MenuBar("NhanVien", jPanel8, jLabel18));
        listMenu.add(new MenuBar("HoaDon", jPanel13, jLabel21));
        listMenu.add(new MenuBar("BanHang", jPanel16, jLabel20));
        listMenu.add(new MenuBar("TrangChu", jPanel5, jLabel4));
        listMenu.add(new MenuBar("KhuyenMai", jPanel12, jLabel8));
        control.setEvent(listMenu);
        

    }

    public Boolean checkrole() {

        return true;

    }

    public void cv() {
        int a = rp.layIdNv();
        i = rp.layId_role();
        if (i == 2) {
            lbl.setText("    Chức Vụ :  Nhân Viên ");
        } else if (i == 3) {
            lbl.setText("    Chức Vụ :  Nhân Viên Kho ");
        } else {
            lbl.setText("    Chức Vụ :  Quản Lý ");
        }
        ID.setText("ID Nhân Viên :  " + a);
        System.out.println(""+a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/support-regular-36.png"))); // NOI18N
        jLabel7.setText("Quản lí người dùng");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/detail-regular-36 (5).png"))); // NOI18N
        jLabel19.setText("Quản lí hóa đơn");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(42, 58, 73));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.pink);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/online-shopping.png"))); // NOI18N
        jLabel1.setText("    N5  Shop");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, 260, 58));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/log-out-regular-36.png"))); // NOI18N
        jLabel2.setText("Logout");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1804, 22, -1, -1));

        lbl.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user-regular-36.png"))); // NOI18N
        lbl.setText("admin@gmail.com");
        jPanel3.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 20, 410, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 70));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        jPanel4.setBackground(new java.awt.Color(42, 58, 73));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID.setFont(new java.awt.Font("Showcard Gothic", 2, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("jLabel3");
        jPanel4.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 970, 210, 40));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        jLabel4.setText("Trang Chủ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 50));

        jPanel6.setBackground(new java.awt.Color(42, 58, 73));
        jPanel6.setForeground(new java.awt.Color(255, 204, 153));
        jPanel6.setPreferredSize(new java.awt.Dimension(210, 60));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(42, 58, 73));
        jPanel9.setPreferredSize(new java.awt.Dimension(13, 60));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/receipt.png"))); // NOI18N
        jLabel5.setText("Quản lí nhãn hàng");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 192, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 60));

        jPanel7.setBackground(new java.awt.Color(42, 58, 73));
        jPanel7.setPreferredSize(new java.awt.Dimension(210, 60));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(42, 58, 73));
        jPanel10.setPreferredSize(new java.awt.Dimension(13, 60));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/brand.png"))); // NOI18N
        jLabel6.setText("Quản lí sản phẩm");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 183, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 60));

        jPanel8.setBackground(new java.awt.Color(42, 58, 73));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(42, 58, 73));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/project-manager.png"))); // NOI18N
        jLabel18.setText("Quản lí nhân viên");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 185, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 60));

        jPanel13.setBackground(new java.awt.Color(42, 58, 73));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(42, 58, 73));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 35, -1, -1));

        jPanel18.setBackground(new java.awt.Color(42, 58, 73));
        jPanel18.setPreferredSize(new java.awt.Dimension(13, 60));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 13, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill.png"))); // NOI18N
        jLabel21.setText("Quản lí hóa đơn");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, -1));

        jPanel16.setPreferredSize(new java.awt.Dimension(210, 60));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cashier.png"))); // NOI18N
        jLabel20.setText("  Bán hàng");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, 190, -1));

        jPanel17.setBackground(new java.awt.Color(42, 58, 73));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel16.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        jPanel4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 60));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(42, 58, 73));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/view/voucher.png"))); // NOI18N
        jLabel8.setText(" Khuyến mại");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jPanel12.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 210, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cocoaa Ice.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 1010));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 1010));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1710, Short.MAX_VALUE)
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );

        jPanel2.add(jpnRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 1710, 1010));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất", "Đăng xuất", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        jPanel6.setBackground(Color.DARK_GRAY);
        jPanel9.setBackground(Color.GREEN);
        jPanel7.setBackground(colorDefault);
        jPanel10.setBackground(colorDefault);
        jPanel8.setBackground(colorDefault);
        jPanel11.setBackground(colorDefault);
        jPanel16.setBackground(colorDefault);
        jPanel17.setBackground(colorDefault);
        jPanel13.setBackground(colorDefault);
        jPanel18.setBackground(colorDefault);
        jPanel12.setBackground(colorDefault);
        jPanel19.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:

        jPanel7.setBackground(Color.DARK_GRAY);
        jPanel10.setBackground(Color.GREEN);
        jPanel6.setBackground(colorDefault);
        jPanel9.setBackground(colorDefault);
        jPanel8.setBackground(colorDefault);
        jPanel11.setBackground(colorDefault);
        jPanel16.setBackground(colorDefault);
        jPanel17.setBackground(colorDefault);
        jPanel13.setBackground(colorDefault);
        jPanel18.setBackground(colorDefault);
        jPanel12.setBackground(colorDefault);
        jPanel19.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:

        jPanel8.setBackground(Color.DARK_GRAY);
        jPanel11.setBackground(Color.GREEN);
        jPanel6.setBackground(colorDefault);
        jPanel9.setBackground(colorDefault);
        jPanel7.setBackground(colorDefault);
        jPanel10.setBackground(colorDefault);
        jPanel16.setBackground(colorDefault);
        jPanel17.setBackground(colorDefault);
        jPanel13.setBackground(colorDefault);
        jPanel18.setBackground(colorDefault);
        jPanel12.setBackground(colorDefault);
        jPanel19.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:

        jPanel16.setBackground(Color.DARK_GRAY);
        jPanel17.setBackground(Color.GREEN);
        jPanel6.setBackground(colorDefault);
        jPanel9.setBackground(colorDefault);
        jPanel7.setBackground(colorDefault);
        jPanel10.setBackground(colorDefault);
        jPanel8.setBackground(colorDefault);
        jPanel11.setBackground(colorDefault);
        jPanel13.setBackground(colorDefault);
        jPanel18.setBackground(colorDefault);

        jPanel12.setBackground(colorDefault);
        jPanel19.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:

        jPanel13.setBackground(Color.DARK_GRAY);
        jPanel18.setBackground(Color.GREEN);
        jPanel16.setBackground(colorDefault);
        jPanel17.setBackground(colorDefault);
        jPanel8.setBackground(colorDefault);
        jPanel11.setBackground(colorDefault);
        jPanel7.setBackground(colorDefault);
        jPanel10.setBackground(colorDefault);
        jPanel6.setBackground(colorDefault);
        jPanel9.setBackground(colorDefault);
        jPanel12.setBackground(colorDefault);
        jPanel19.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        jPanel16.setBackground(colorDefault);
        jPanel17.setBackground(colorDefault);
        jPanel8.setBackground(colorDefault);
        jPanel11.setBackground(colorDefault);
        jPanel7.setBackground(colorDefault);
        jPanel10.setBackground(colorDefault);
        jPanel6.setBackground(colorDefault);
        jPanel9.setBackground(colorDefault);
        jPanel13.setBackground(colorDefault);
        jPanel18.setBackground(colorDefault);
        jPanel12.setBackground(colorDefault);
        jPanel19.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanel12.setBackground(Color.DARK_GRAY);
        jPanel19.setBackground(Color.GREEN);
        jPanel16.setBackground(colorDefault);
        jPanel17.setBackground(colorDefault);
        jPanel8.setBackground(colorDefault);
        jPanel11.setBackground(colorDefault);
        jPanel7.setBackground(colorDefault);
        jPanel10.setBackground(colorDefault);
        jPanel6.setBackground(colorDefault);
        jPanel9.setBackground(colorDefault);
        jPanel13.setBackground(colorDefault);
        jPanel18.setBackground(colorDefault);
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JPanel jPanel10 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel11 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel12 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel13 = new javax.swing.JPanel();
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    public static final javax.swing.JPanel jPanel16 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel17 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel18 = new javax.swing.JPanel();
    public static javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static final javax.swing.JPanel jPanel6 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel7 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel8 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel9 = new javax.swing.JPanel();
    private javax.swing.JSeparator jSeparator1;
    public static final javax.swing.JPanel jpnRoot = new javax.swing.JPanel();
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
