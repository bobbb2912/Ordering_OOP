package form;

import BLL.BLLChiTietHoaDon;
import Helper.DatabaseHelper;
import Helper.SanPhamDao;
import BLL.BLLSanPham;
import code.MenuClass;
import code.SanPham;
import BLL.BLLHoadon;
import Helper.ChuyenDoi;
import Helper.ShareData;
import Helper.sqlHelper;
import code.HoaDon;
import code.Mycombobox;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Hien PC
 */
public class HoaDonform extends javax.swing.JFrame {
//    ArrayList<MenuClass> listMenu = new ArrayList<>();
    private String user;
    private DefaultTableModel tblModel;
    private DefaultTableModel tblModel1;

    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String Url = "jdbc:sqlserver://DESKTOP-TAQ595G\\SQLEXPRESS2:1433;database=BTL_OOP2;";
    String username = "sa";
    String password = "1234";
    Statement st;

    public HoaDonform() {
        initComponents();
        setLocationRelativeTo(null);
        initTable();
        loaddataSanPham();
        loadCbb();
        initTableCTHD();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID", "Name", "Price"});
        tblSanPham.setModel(tblModel);

    }

    private void initTableCTHD() {
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{"Ordinal", "ID", "Name", "Quantity", "Unit Price", "Total", "Note"});
        tblChiTietHoaDon.setModel(tblModel1);

    }

    private void loaddataSanPham() {
       
        try {

            SanPhamDao dao = new SanPhamDao();

            List<SanPham> list = dao.findAll();
            tblModel.setRowCount(0);

            for (SanPham menu : list) {
                tblModel.addRow(new Object[]{menu.getIDhang(), menu.getTen(), menu.getGia()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            //e.printStackTrace();
        }

    }

    public void loadCbb() {

        String sql = "select distinct MALOAISP from SANPHAM";
        ResultSet rs = sqlHelper.executeQuery(sql);
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) CbbLoaiSP.getModel();
        cbbModel.removeAllElements();
        try {
            while (rs.next()) {
                String LoaiSp = rs.getString("MALOAISP");
                // Mycombobox mycbb = new Mycombobox(LoaiSp);
                cbbModel.addElement(LoaiSp);
            }
            // CbbLoaiSP.setModel(cbbModel);
        } catch (Exception e) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmnChiTietHoaDon = new javax.swing.JPopupMenu();
        mniXoaSp = new javax.swing.JMenuItem();
        mniSuaSP = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CbbLoaiSP = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblChiTietHoaDon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        lblSoHoaDon = new javax.swing.JLabel();
        lblNgay = new javax.swing.JLabel();
        txtten = new javax.swing.JLabel();
        txtadd = new javax.swing.JLabel();
        txtsdt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

        mniXoaSp.setText("Delete");
        mniXoaSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniXoaSpActionPerformed(evt);
            }
        });
        pmnChiTietHoaDon.add(mniXoaSp);

        mniSuaSP.setText("Edit");
        mniSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSuaSPActionPerformed(evt);
            }
        });
        pmnChiTietHoaDon.add(mniSuaSP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informations"));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Key Words");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Select");

        CbbLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbbLoaiSPMouseClicked(evt);
            }
        });
        CbbLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbbLoaiSPActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimKiem)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbbLoaiSP, 0, 312, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 644));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bill Informations"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Bill Number:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Customer:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Phone Number:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Note:");

        tblChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblChiTietHoaDon.setComponentPopupMenu(pmnChiTietHoaDon);
        jScrollPane3.setViewportView(tblChiTietHoaDon);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment"));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Total");

        lblTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblTongTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(255, 51, 51));
        lblTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTongTien.setText("999999999");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnThanhToan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThanhToan.setText("Pay");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnThanhToan))
                .addGap(15, 15, 15))
        );

        lblSoHoaDon.setText("jLabel14");

        lblNgay.setText("jLabel16");

        txtten.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtten.setText("ten");

        txtadd.setText("jLabel6");

        txtsdt.setText("jLabel6");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblSoHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(lblNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(lblSoHoaDon)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNgay)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtsdt))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 13, 620, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\dell\\Downloads\\abcc.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static String SoLuongMua;
    public static String GhiChu;
    public static boolean Huy = false;
    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
//           if
//            jdlThongTinSanPham jdl = new jdlThongTinSanPham(this, true);
//            jdl.setVisible(true);
//            if (Huy) {
//                return;
//            }
//             
//             System.out.println(ro);
//            System.out.println("SL: " + SoLuongMua + " Ghi Chu: " + GhiChu);
//            int idSP = (int) tblSanPham.getValueAt(0, 0);
//            System.out.println(idSP);()
        SoLuongMua = "1";
        GhiChu = " ";
        if (evt.getClickCount() >= 2) {
            jdlThongTinSanPham jdl = new jdlThongTinSanPham(this, true);
            jdl.setVisible(true);
            if (Huy) {
                return;
            }

            System.out.println("SL: " + SoLuongMua + " Ghi Chu: " + GhiChu);
            int idSP = (int) tblSanPham.getValueAt(tblSanPham.getSelectedRow(), 0);
            SanPham sp = BLLSanPham.GetSanPham(idSP);
            BLLHoadon.LoadDataChiTietHoaDon(tblChiTietHoaDon, sp, SoLuongMua, GhiChu);
            lblTongTien.setText(BLLHoadon.TinhTongTien(tblChiTietHoaDon));
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void CbbLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbbLoaiSPActionPerformed

        int LoaiSP;
        String loaiDuocChon = (String) CbbLoaiSP.getSelectedItem();
        String sql = "select * from SanPham where MaLoaiSP = '" + loaiDuocChon + "'";
        try {

            SanPhamDao dao = new SanPhamDao();

            List<SanPham> list = dao.findLoaiSP(sql);
            tblModel.setRowCount(0);

            for (SanPham menu : list) {
                tblModel.addRow(new Object[]{menu.getIDhang(), menu.getTen(), menu.getGia()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
           // e.printStackTrace();
        }

    }//GEN-LAST:event_CbbLoaiSPActionPerformed
    public void cbbLoaiSp() {
        int LoaiSP;
        String loaiDuocChon = (String) CbbLoaiSP.getSelectedItem();
        String sql = "select * from SanPham where MaLoaiSP = " + loaiDuocChon;
        try {

            SanPhamDao dao = new SanPhamDao();

            List<SanPham> list = dao.findLoaiSP(loaiDuocChon);
            tblModel.setRowCount(0);

            for (SanPham menu : list) {
                tblModel.addRow(new Object[]{menu.getIDhang(), menu.getTen(), menu.getGia()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
           // e.printStackTrace();
        }
    }
    private void CbbLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbbLoaiSPMouseClicked

        int LoaiSP;
        String loaiDuocChon = (String) CbbLoaiSP.getSelectedItem();
        String sql = "select * from SanPham where MaLoaiSP = " + loaiDuocChon;
        try {

            SanPhamDao dao = new SanPhamDao();

            List<SanPham> list = dao.findLoaiSP(loaiDuocChon);
            tblModel.setRowCount(0);

            for (SanPham menu : list) {
                tblModel.addRow(new Object[]{menu.getIDhang(), menu.getTen(), menu.getGia()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_CbbLoaiSPMouseClicked

    private void mniXoaSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniXoaSpActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbModel = (DefaultTableModel) tblChiTietHoaDon.getModel();
        int Vitri = tblChiTietHoaDon.getSelectedRow();
        if (Vitri >= 0) {
            tblModel1.removeRow(Vitri);
            for (int i = 0; i < tblChiTietHoaDon.getRowCount(); i++) {
                tblChiTietHoaDon.setValueAt(i + 1, i, 1);

            }
        }
        lblTongTien.setText(BLLHoadon.TinhTongTien(tblChiTietHoaDon));
    }//GEN-LAST:event_mniXoaSpActionPerformed

    private void mniSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSuaSPActionPerformed
        // TODO add your handling code here:
        int Vitri = tblChiTietHoaDon.getSelectedRow();
        SoLuongMua = tblChiTietHoaDon.getValueAt(Vitri, 3).toString();
        GhiChu = tblChiTietHoaDon.getValueAt(Vitri, 6).toString();
        jdlThongTinSanPham jdl = new jdlThongTinSanPham(this, true);
        jdl.setVisible(true);
        if (Huy) {
            return;
        }
        tblChiTietHoaDon.setValueAt(SoLuongMua, Vitri, 3);
        double ThanhTien = Double.parseDouble(SoLuongMua) * ChuyenDoi.SoDouble(tblChiTietHoaDon.getValueAt(Vitri, 4).toString());
        tblChiTietHoaDon.setValueAt(ChuyenDoi.SoString(ThanhTien), Vitri, 5);
        tblChiTietHoaDon.setValueAt(GhiChu, Vitri, 6);
        lblTongTien.setText(BLLHoadon.TinhTongTien(tblChiTietHoaDon));
    }//GEN-LAST:event_mniSuaSPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HoaDonform.Huy = false;
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void processLoginSuccessful() {
        txtten.setText(ShareData.nguoiDangNhap.getName());
        txtadd.setText(ShareData.nguoiDangNhap.getDiaChi());
        txtsdt.setText(ShareData.nguoiDangNhap.getTel());
        user= ShareData.nguoiDangNhap.getUsername();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // BLLSanPham.LoadSanPhamHoaDon(tblSanPham);
        /* ResultSet rsLSP=DALLoaiSp.GetAll();
       BLLCombobox.Load(cbbLoaiSp(),rsLSP, true);
       ResultSet rsKH=DAL.DALKhachHang.GetAll();
          BLLCombobox.Load(cbbKhachHang,rsKH, false);*/
        processLoginSuccessful();
        lblNgay.setText(BLLHoadon.TaoNgay());
        lblSoHoaDon.setText(BLLHoadon.TaoSOHD());

    }//GEN-LAST:event_formWindowOpened

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID", "Name", "Unit price"});
        tblSanPham.setModel(tblModel);

        String tuKhoa = (String) txtTimKiem.getText();
        try {

            SanPhamDao dao = new SanPhamDao();

            List<SanPham> list = dao.findSP(tuKhoa);
            tblModel.setRowCount(0);

            for (SanPham menu : list) {
                tblModel.addRow(new Object[]{menu.getIDhang(), menu.getTen(), menu.getGia()});
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
           // e.printStackTrace();
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        HoaDon hd = new HoaDon();
        hd.setGhiChu(txtGhiChu.getText());
        hd.setUsernameKH(user);
        hd.setNgayTaoHD( new java.util.Date());
//        String soHoaDon = BLLHoadon.TaoSOHD();
//        hd.setSoHoaDon(soHoaDon);
        String soHoaDon = lblSoHoaDon.getText();
        hd.setSoHoaDon(soHoaDon);
        hd.setTongTien(ChuyenDoi.SoDouble(lblTongTien.getText()));
        
        BLLHoadon.ThemHD(hd);
//        String ghiChu = txtGhiChu.getText();
        BLLChiTietHoaDon.Them(tblChiTietHoaDon, soHoaDon);
        JOptionPane.showMessageDialog(this, "Pay successfully!");
        
        if(JOptionPane.showConfirmDialog(this, "Do you want to order more?", "Notice", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
            HoaDonform hd1=new HoaDonform();
            hd1.setVisible(true);
            this.dispose();
        }else{
            thankyou tk=new thankyou();
            tk.setVisible(true);
            this.dispose();
        }
        return;
        
        
    }//GEN-LAST:event_btnThanhToanActionPerformed

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
            java.util.logging.Logger.getLogger(HoaDonform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbLoaiSP;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNgay;
    private javax.swing.JLabel lblSoHoaDon;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JMenuItem mniSuaSP;
    private javax.swing.JMenuItem mniXoaSp;
    private javax.swing.JPopupMenu pmnChiTietHoaDon;
    private javax.swing.JTable tblChiTietHoaDon;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JLabel txtadd;
    private javax.swing.JLabel txtsdt;
    private javax.swing.JLabel txtten;
    // End of variables declaration//GEN-END:variables
}
