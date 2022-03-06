/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.*;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class historyPinjam extends javax.swing.JFrame {
    Database db;
    Connection conn;
    ResultSet rs;
    Statement stmt;
    public String url = "jdbc:mysql://localhost/tugasakhir";
    public String user = "root";
    public String pass = "";
    DefaultListModel<String> listPeminjaman = new DefaultListModel<>();
    
    /**
     * Creates new form historyPinjam
     */
    public historyPinjam() {
        initComponents();
        db = new Database();
        tampilData();
        
    }
    public void tampilData(){
        ResultSet b = null;
        
        try{
            String query = "SELECT * FROM log_in";
            b = db.getData(query);
            b.next();
            String id = b.getString(1);
            String sql = "SELECT * FROM peminjaman where libraryId ='"+id+"'";
            rs = db.getData(sql);
            while(rs.next()){
                String libID = rs.getString(1);
                String nama = rs.getString(2);
                String id_buku = rs.getString(3);
                String namaBuku = rs.getString(4);
                Date tgl  = rs.getDate(5);

                listPeminjaman.addElement(namaBuku);
            }
            
            jList1.setModel(listPeminjaman);
        } catch (SQLException ex) {
            Logger.getLogger(daftarAkun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tglPinjam = new javax.swing.JLabel();
        jdlBuku = new javax.swing.JLabel();
        nmPinjam = new javax.swing.JLabel();
        idbuku = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("History Peminjaman Buku");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 410, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Perpus.id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 120, 80));

        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/backBtn.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBack1MouseClicked(evt);
            }
        });
        getContentPane().add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 50, 40));

        jPanel1.setBackground(new java.awt.Color(253, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Detail Peminjaman");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 13, -1, -1));

        tglPinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tglPinjam.setText("Tanggal Peminjaman");
        jPanel1.add(tglPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jdlBuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdlBuku.setText("Judul Buku");
        jPanel1.add(jdlBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        nmPinjam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nmPinjam.setText("Nama Peminjam");
        jPanel1.add(nmPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        idbuku.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idbuku.setText("Id Buku");
        jPanel1.add(idbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 480, 370));

        jList1.setBackground(new java.awt.Color(153, 153, 153));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "--" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, 370));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/bgHistory.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 1){
            new Dashboard().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnBack1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        ResultSet b = null;
        if(evt.getClickCount() == 1){
            try{
            String query = "SELECT * FROM log_in";
            b = db.getData(query);
            b.next();
            String id = b.getString(1);
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            String login = ("SELECT * FROM peminjaman where namaBuku ='"+jList1.getSelectedValue()+"' AND libraryId='"+id+"'");
            rs = stmt.executeQuery(login);
            rs.next();
            idbuku.setText("Id Buku : "+rs.getString(3));
            jdlBuku.setText("Judul Buku : "+ rs.getString(4));
            nmPinjam.setText("Nama Peminjam : "+rs.getString(2));
            tglPinjam.setText("Tanggal Peminjaman : " + rs.getString(5));
            } catch (SQLException e ){
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,e);
           }
        }
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(historyPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historyPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historyPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historyPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historyPinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnBack1;
    private javax.swing.JLabel idbuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jdlBuku;
    private javax.swing.JLabel nmPinjam;
    private javax.swing.JLabel tglPinjam;
    // End of variables declaration//GEN-END:variables

}
