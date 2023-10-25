/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package latihan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author fatiq
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    static final String url = "jdbc:postgresql://localhost:5432/PBO";
    static final String user = "postgres";
    static final String pass = "5127";
    private Connection conn = null;
    
    public UI() throws SQLException {
        initComponents();
        conn = DriverManager.getConnection(url,user,pass);
        lebar();
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lb_nim = new javax.swing.JLabel();
        tf_nim = new javax.swing.JTextField();
        tf_nama = new javax.swing.JTextField();
        lb_nama = new javax.swing.JLabel();
        tf_alamat = new javax.swing.JTextField();
        lb_alamat = new javax.swing.JLabel();
        tf_tlp = new javax.swing.JTextField();
        lb_tlp = new javax.swing.JLabel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabel Mahasiswa");

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pn1, java.awt.BorderLayout.PAGE_START);

        pn2.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NO", "NIM", "NAMA", "ALAMAT", "NO. TLP"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        lb_nim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_nim.setForeground(new java.awt.Color(0, 0, 0));
        lb_nim.setText("NIM :");

        tf_nim.setBackground(new java.awt.Color(255, 255, 255));
        tf_nim.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tf_nama.setBackground(new java.awt.Color(255, 255, 255));
        tf_nama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lb_nama.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_nama.setForeground(new java.awt.Color(0, 0, 0));
        lb_nama.setText("NAMA :");

        tf_alamat.setBackground(new java.awt.Color(255, 255, 255));
        tf_alamat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lb_alamat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_alamat.setForeground(new java.awt.Color(0, 0, 0));
        lb_alamat.setText("ALAMAT :");

        tf_tlp.setBackground(new java.awt.Color(255, 255, 255));
        tf_tlp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lb_tlp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_tlp.setForeground(new java.awt.Color(0, 0, 0));
        lb_tlp.setText("NO. TLP :");

        btn_insert.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_nim)
                    .addComponent(tf_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(tf_alamat, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(tf_tlp, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nim)
                            .addComponent(lb_nama)
                            .addComponent(lb_alamat)
                            .addComponent(lb_tlp))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(lb_nim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_alamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_tlp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_insert)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pn2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        Mahasiswa mh = new Mahasiswa();
        mh.setNim(tf_nim.getText());
        mh.setNama(tf_nama.getText());
        mh.setAlamat(tf_alamat.getText());
        mh.setNo_tlp(tf_tlp.getText());
        
        tambah(mh);
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        Mahasiswa mh = new Mahasiswa();
        mh.setNim(tf_nim.getText());
        mh.setNama(tf_nama.getText());
        mh.setAlamat(tf_alamat.getText());
        mh.setNo_tlp(tf_tlp.getText());
        
        perbarui(mh);
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        hapus(tf_nim.getText());
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         int index = table.getSelectedRow();
        tf_nim.setText((String) table.getValueAt(index, 1));
        tf_nama.setText((String) table.getValueAt(index, 2));
        tf_alamat.setText((String) table.getValueAt(index, 3));
        tf_tlp.setText((String) table.getValueAt(index, 4));
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_alamat;
    private javax.swing.JLabel lb_nama;
    private javax.swing.JLabel lb_nim;
    private javax.swing.JLabel lb_tlp;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tf_alamat;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nim;
    private javax.swing.JTextField tf_tlp;
    // End of variables declaration//GEN-END:variables

    private void tambah(Mahasiswa mh){
        String query = "INSERT INTO mahasiswa (nim,nama,alamat,tlp) values (?,?,?,?)";
        try{
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(query);
            
            stmt.setString(1, mh.getNim());
            stmt.setString(2, mh.getNama());
            stmt.setString(3, mh.getAlamat());
            stmt.setString(4, mh.getNo_tlp());
              
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        tampilkan();
        bersih();
    }
    
    private void perbarui(Mahasiswa mh){
        String query = "UPDATE mahasiswa SET nama = ?, alamat = ?, tlp = ? WHERE nim = ?";
        try{
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(query);
            
            stmt.setString(4, mh.getNim());
            stmt.setString(1, mh.getNama());
            stmt.setString(2, mh.getAlamat());
            stmt.setString(3, mh.getNo_tlp());
              
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        tampilkan();
        bersih();
    }
    
    private void hapus(String nim){
        String query = "DELETE FROM mahasiswa WHERE nim = ?";
        try{
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(query);
            
            stmt.setString(1, nim);
              
            stmt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        tampilkan();
        bersih();
    }
    
    private void tampilkan(){
        PreparedStatement st = null;
        ArrayList<Mahasiswa> list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM mahasiswa ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                Mahasiswa mh = new Mahasiswa();
                
                mh.setNim(rs.getString("nim"));
                mh.setNama(rs.getString("nama"));
                mh.setAlamat(rs.getString("alamat"));
                mh.setNo_tlp(rs.getString("tlp"));
                
                list.add(mh);
            }
            
            DefaultTableModel tbl = (DefaultTableModel) table.getModel();
            tbl.setRowCount(0);
            int i = 1;
            for(Mahasiswa data : list){
                Object[] baris = new Object[5];
                
                baris[0] = i++;
                baris[1] = data.getNim();
                baris[2] = data.getNama();
                baris[3] = data.getAlamat();
                baris[4] = data.getNo_tlp();
                tbl.addRow(baris);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    private void lebar() {
        int[] noCol = {0};
        int[] noColW = {50};
        
        TableColumnModel tblModel = table.getColumnModel();
        for(int i = 0; i < noCol.length; i++){
        tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
        tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
        tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }
    
    private void bersih(){
        tf_nim.setText("");
        tf_nama.setText("");
        tf_alamat.setText("");
        tf_tlp.setText("");
    }

}
