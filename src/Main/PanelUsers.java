/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wiguna R
 */
public class PanelUsers extends javax.swing.JPanel {
    FormContainer container;
    
    Connection conn       = null;
    ResultSet rs          = null;
    PreparedStatement pst = null;
    
    DefaultTableModel defaultTablePengguna;
    
    private int id;
    /**
     * Creates new form PanelUsers
     * @param container
     */
    public PanelUsers(FormContainer container) {
        initComponents();
        this.container = container;
        this.conn      = MySQLConnection.ConnectDb();
        
        defaultTablePengguna = new DefaultTableModel(new String[]{"No.", "ID", "Username", "Role"}, 0);
        getAllUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPengaturan = new javax.swing.JPanel();
        panelHeaderSewa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelPenulis = new javax.swing.JLabel();
        comRole = new javax.swing.JComboBox<>();
        panelFooterSewa = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        inPassword = new javax.swing.JPasswordField();
        panelTableContainer = new javax.swing.JPanel();
        panelTableHeader = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePengguna = new javax.swing.JTable();

        panelPengaturan.setMaximumSize(new java.awt.Dimension(393, 236));
        panelPengaturan.setMinimumSize(new java.awt.Dimension(393, 236));

        panelHeaderSewa.setMinimumSize(new java.awt.Dimension(450, 55));
        panelHeaderSewa.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Pengaturan Pengguna");
        panelHeaderSewa.add(jLabel1, new java.awt.GridBagConstraints());

        inUsername.setBorder(null);
        inUsername.setCaretColor(new java.awt.Color(255, 255, 255));

        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(57, 113, 177));
        labelUsername.setText("Username");

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(57, 113, 177));
        labelPassword.setText("Password");

        labelPenulis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPenulis.setForeground(new java.awt.Color(57, 113, 177));
        labelPenulis.setText("Role");

        comRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir" }));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFooterSewaLayout = new javax.swing.GroupLayout(panelFooterSewa);
        panelFooterSewa.setLayout(panelFooterSewaLayout);
        panelFooterSewaLayout.setHorizontalGroup(
            panelFooterSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFooterSewaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFooterSewaLayout.setVerticalGroup(
            panelFooterSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFooterSewaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFooterSewaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addContainerGap())
        );

        inPassword.setForeground(new java.awt.Color(0, 0, 0));
        inPassword.setBorder(null);
        inPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPengaturanLayout = new javax.swing.GroupLayout(panelPengaturan);
        panelPengaturan.setLayout(panelPengaturanLayout);
        panelPengaturanLayout.setHorizontalGroup(
            panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPengaturanLayout.createSequentialGroup()
                .addComponent(panelHeaderSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPengaturanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFooterSewa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPengaturanLayout.createSequentialGroup()
                        .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inUsername)
                                .addComponent(inPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comRole, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPengaturanLayout.createSequentialGroup()
                        .addComponent(labelPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelPengaturanLayout.setVerticalGroup(
            panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPengaturanLayout.createSequentialGroup()
                .addComponent(panelHeaderSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inUsername)
                    .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inPassword)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPengaturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comRole, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(labelPenulis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(panelFooterSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Daftar Pengguna");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        panelTableHeader.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelTableHeader.setLayer(btnRefresh, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelTableHeaderLayout = new javax.swing.GroupLayout(panelTableHeader);
        panelTableHeader.setLayout(panelTableHeaderLayout);
        panelTableHeaderLayout.setHorizontalGroup(
            panelTableHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addContainerGap())
        );
        panelTableHeaderLayout.setVerticalGroup(
            panelTableHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnRefresh))
                .addGap(17, 17, 17))
        );

        tablePengguna.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePengguna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePenggunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePengguna);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelTableContainerLayout = new javax.swing.GroupLayout(panelTableContainer);
        panelTableContainer.setLayout(panelTableContainerLayout);
        panelTableContainerLayout.setHorizontalGroup(
            panelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTableHeader)
            .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTableContainerLayout.setVerticalGroup(
            panelTableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableContainerLayout.createSequentialGroup()
                .addComponent(panelTableHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelTableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPengaturan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        getAllUsers();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tablePenggunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePenggunaMouseClicked
        int baris = tablePengguna.getSelectedRow();
        id               = Integer.parseInt(tablePengguna.getModel().getValueAt(baris, 1) + "");
        String username  = tablePengguna.getModel().getValueAt(baris, 2).toString();
        String role      = tablePengguna.getModel().getValueAt(baris, 3).toString();
        
        inUsername.setText(username);
        comRole.setSelectedItem(role);
    }//GEN-LAST:event_tablePenggunaMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        inUsername.setText("");
        inPassword.setText("");
        comRole.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String username, password, role;
        username = inUsername.getText();
        password = inPassword.getPassword().toString();
        role     = comRole.getSelectedItem().toString();
        if(isUserExists(username)){
            JOptionPane.showMessageDialog(null, "Username sudah ada");
            return;
        }
        tambahPengguna(username, password, role);
        getAllUsers();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String username, password, role;
        username = inUsername.getText();
        password = inPassword.getPassword().toString();
        role     = comRole.getSelectedItem().toString();
        
        ubahPengguna(id, username, password, role);
        getAllUsers();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String username = inUsername.getText();
        int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Hapus data pengguna", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            hapusPengguna(username);
        }
        getAllUsers();
    }//GEN-LAST:event_btnHapusActionPerformed
    
    
    public void getAllUsers(){
        defaultTablePengguna.setRowCount(0);
        int no = 1, id;
        String username, role;
        String sql = "SELECT usr_id, usr_username, usr_role FROM tbl_users";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                id       = rs.getInt("usr_id");
                username = rs.getString("usr_username");
                role     = rs.getString("usr_role");
                defaultTablePengguna.addRow(new Object[]{no, id, username, role});
                no++;
            }
            tablePengguna.setModel(defaultTablePengguna);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan saat mangambil data pengguna");
        }
    }
    
    public void tambahPengguna(String username, String password, String role){
        String sql = "INSERT INTO tbl_users(usr_username, usr_password, usr_role) VALUES(?,?,?)";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, bytesToHex(hash));
            pst.setString(3, role);
            
            if(pst.executeUpdate() != 0){
                System.out.println("Berhasil menambah pengguna");
            }else{
                System.out.println("Gagal menambah pengguna");
            }
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan saat menambah pengguna");
        }
    }
    
    public void hapusPengguna(String username){
        String sql = "DELETE FROM tbl_users WHERE usr_username = ?";
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            
            if(pst.executeUpdate() != 0){
                System.out.println("Berhasil menghapus data pengguna");
            }else{
                System.out.println("Gagal menghapus data pengguna");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan saat menghapus pengguna");
        }
    }
    
    public void ubahPengguna(int id, String username, String password, String role){
        String sql;
        
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            if(password.isEmpty()){
                sql = "UPDATE tbl_users SET usr_username = ?, usr_role = ? WHERE usr_id = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, role);
                pst.setInt(3, id);
            }else{
                sql = "UPDATE tbl_users SET usr_username = ?, usr_password = ?, usr_role = ? WHERE usr_id = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, bytesToHex(hash));
                pst.setString(3, role);
                pst.setInt(4, id);
            }
            
            
            if(pst.executeUpdate() != 0){
                System.out.println("Update pengguna berhasil");
            }else{
                System.out.println("Update pengguna gagal");
            }
        } catch (SQLException | NoSuchAlgorithmException e) {
            Logger.getLogger(PanelUsers.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("ERROR : terjadi kesalahaan saat mengubah pengguna");
        }
    }
    
    public Boolean isUserExists(String username){
        Boolean status = true;
        String sql = "SELECT usr_username FROM tbl_users WHERE usr_username = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            if(rs.next()){
                status = true;
            }else{
                status = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
    
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
        String hex = Integer.toHexString(0xff & hash[i]);
        if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> comRole;
    private javax.swing.JPasswordField inPassword;
    private javax.swing.JTextField inUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPenulis;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelFooterSewa;
    private javax.swing.JPanel panelHeaderSewa;
    private javax.swing.JPanel panelPengaturan;
    private javax.swing.JPanel panelTable;
    private javax.swing.JPanel panelTableContainer;
    private javax.swing.JLayeredPane panelTableHeader;
    private javax.swing.JTable tablePengguna;
    // End of variables declaration//GEN-END:variables
}
