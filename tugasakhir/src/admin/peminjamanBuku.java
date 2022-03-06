/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import mulaiRunDriverDisini.driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danda
 */
public class peminjamanBuku extends javax.swing.JFrame {
    DefaultTableModel model;
    DefaultTableModel modell;
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public String url = "jdbc:mysql://localhost/tugasakhir";
    public String user = "root";
    public String pass = "";
    Database_admin db;
    LocalDate tanggal;
    
    /**
     * Creates new form peminjamanBuku
     */
    public peminjamanBuku() {
        initComponents();
        
        db = new Database_admin();
        
        setTitle("Perpus.id");
        String []judul = {"Library ID", "Nama Peminjam", "Id Buku", "Nama Buku", "Tanggal Pinjam"};
        String []buku = {"ID Buku", "Judul Buku", "Penerbit", "Stok"};
        model = new DefaultTableModel(judul, 0);
        modell = new DefaultTableModel(buku, 0);
        jTable1.setModel(model);
        jTable2.setModel(modell);
        tampil();
        tampilBuku();
        btnBackPinjam.setEnabled(false);
        btnResetCariBuku.setEnabled(false);
        inputTglPinjam.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        labelLibID = new javax.swing.JLabel();
        labelTglPinjam = new javax.swing.JLabel();
        inputLibID = new javax.swing.JTextField();
        inputTglPinjam = new javax.swing.JTextField();
        labelsubJudul = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnKembalikan = new javax.swing.JButton();
        inputCariTbPinjam = new javax.swing.JTextField();
        btnCariTbPinjam = new javax.swing.JButton();
        labelCariPinjam = new javax.swing.JLabel();
        labelTablePinjam = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        labelTableBuku = new javax.swing.JLabel();
        btnCariTbBuku = new javax.swing.JButton();
        inputCariTbBuku = new javax.swing.JTextField();
        labelCariBuku = new javax.swing.JLabel();
        btnCekBuku = new javax.swing.JButton();
        btnBackPinjam = new javax.swing.JButton();
        labelIdBuku = new javax.swing.JLabel();
        inputIdBuku = new javax.swing.JTextField();
        btnResetCariBuku = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 137, 0));

        labelJudul.setBackground(new java.awt.Color(253, 137, 0));
        labelJudul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelJudul.setText("PERPUS.ID");

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(479, 479, 479)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelLibID.setText("Library ID");

        labelTglPinjam.setText("Tanggal Pinjam");

        labelsubJudul.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelsubJudul.setText("PEMINJAMAN BUKU");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnSubmit.setBackground(new java.awt.Color(253, 137, 0));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnKembalikan.setBackground(new java.awt.Color(253, 137, 0));
        btnKembalikan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnKembalikan.setText("Kembalikan Buku");
        btnKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembalikanActionPerformed(evt);
            }
        });

        btnCariTbPinjam.setBackground(new java.awt.Color(0, 0, 0));
        btnCariTbPinjam.setForeground(new java.awt.Color(255, 255, 255));
        btnCariTbPinjam.setText("Cari");
        btnCariTbPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariTbPinjamActionPerformed(evt);
            }
        });

        labelCariPinjam.setText("Cari berdasarkan nama peminjam");

        labelTablePinjam.setText("Data Peminjam");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        labelTableBuku.setText("Data Buku");

        btnCariTbBuku.setBackground(new java.awt.Color(0, 0, 0));
        btnCariTbBuku.setForeground(new java.awt.Color(255, 255, 255));
        btnCariTbBuku.setText("Cari");
        btnCariTbBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariTbBukuActionPerformed(evt);
            }
        });

        labelCariBuku.setText("Cari berdasarkan nama buku");

        btnCekBuku.setBackground(new java.awt.Color(253, 137, 0));
        btnCekBuku.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCekBuku.setText("Kelola Buku");
        btnCekBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekBukuActionPerformed(evt);
            }
        });

        btnBackPinjam.setBackground(new java.awt.Color(253, 137, 0));
        btnBackPinjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBackPinjam.setText("Back");
        btnBackPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackPinjamActionPerformed(evt);
            }
        });

        labelIdBuku.setText("Id buku");

        btnResetCariBuku.setBackground(new java.awt.Color(253, 137, 0));
        btnResetCariBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnResetCariBuku.setText("Reset");
        btnResetCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCariBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelsubJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTableBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCariBuku)
                        .addGap(41, 41, 41)
                        .addComponent(inputCariTbBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariTbBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelCariPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(inputCariTbPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariTbPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelLibID)
                                        .addGap(45, 45, 45)
                                        .addComponent(inputLibID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTglPinjam)
                                        .addGap(18, 18, 18)
                                        .addComponent(inputTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addComponent(labelIdBuku)
                                .addGap(32, 32, 32)
                                .addComponent(inputIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTablePinjam)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBackPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)
                                .addComponent(btnKembalikan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCekBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnResetCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 136, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(labelsubJudul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLibID)
                    .addComponent(inputLibID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdBuku)
                    .addComponent(inputIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTglPinjam))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembalikan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTablePinjam)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputCariTbPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCariTbPinjam)
                        .addComponent(labelCariPinjam)
                        .addComponent(btnBackPinjam)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCekBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetCariBuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTableBuku)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCariTbBuku)
                        .addComponent(inputCariTbBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCariBuku)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Statement stm;
        ResultSet buku;
        Connection konek;
        
        String idbuku = inputIdBuku.getText();
        try {
            // TODO add your handling code here:
          conn = DriverManager.getConnection(url,user,pass);
          stmt = conn.createStatement();
          String peminjam = ("SELECT * FROM member");
          rs = stmt.executeQuery(peminjam);
          rs.next();
          
          konek = DriverManager.getConnection(url,user,pass);
          stm = konek.createStatement();
          String p = "SELECT * FROM buku WHERE id_buku ='"+idbuku+"'";
          buku = stm.executeQuery(p);
          buku.next();
          stmt.executeUpdate("INSERT INTO peminjaman VALUES('"+rs.getString(1)+"','"+rs.getString(2)+"','"+buku.getString(1)+"','"+buku.getString(2)+"','"+tanggal.now()+"')");
          JOptionPane.showMessageDialog(null,"Berhasil Meminjam","Success",1);
          
   
            tampil();
            tampilBuku();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(peminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Gagal Meminjam","error",0);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembalikanActionPerformed
        try {
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasakhir","root","");
            konek.createStatement().executeUpdate("delete from peminjaman where id_buku='"+inputIdBuku.getText()+"' && libraryId='"+inputLibID.getText()+"'");
            JOptionPane.showMessageDialog(null, "Berhasil mengembalikan buku");
            tampil();
            tampilBuku();
            new peminjamanBuku().setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(peminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKembalikanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        if(i>-1) {
            inputLibID.setText(model.getValueAt(i, 0).toString());
            inputLibID.setEnabled(false);
            
       
            
            inputIdBuku.setText(model.getValueAt(i, 2).toString());
            inputIdBuku.setEnabled(false);
            
            
            
            inputTglPinjam.setText(model.getValueAt(i, 4).toString());
            inputTglPinjam.setEnabled(false);
            
            btnSubmit.setEnabled(false);
            btnBackPinjam.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnCekBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekBukuActionPerformed
        new dataBuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCekBukuActionPerformed

    private void btnBackPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackPinjamActionPerformed
        new peminjamanBuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackPinjamActionPerformed

    private void btnCariTbPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariTbPinjamActionPerformed
        int row = jTable1.getRowCount();
        for(int a=0; a<row; a++) {
            model.removeRow(0);
        }
        try {
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasakhir","root","");
            ResultSet rs = konek.createStatement().executeQuery("SELECT * FROM peminjaman where namaPeminjam='"+inputCariTbPinjam.getText()+"'");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(peminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnBackPinjam.setEnabled(true);
    }//GEN-LAST:event_btnCariTbPinjamActionPerformed

    private void btnCariTbBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariTbBukuActionPerformed
        int row = jTable2.getRowCount();
        for(int a=0; a<row; a++) {
            modell.removeRow(0);
        }
        try {
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasakhir","root","");
            ResultSet rs = konek.createStatement().executeQuery("SELECT * FROM buku where judul_buku='"+inputCariTbBuku.getText()+"'");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                modell.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(peminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnResetCariBuku.setEnabled(true);
    }//GEN-LAST:event_btnCariTbBukuActionPerformed

    private void btnResetCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCariBukuActionPerformed
        new peminjamanBuku().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnResetCariBukuActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new Dashboard_admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(peminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peminjamanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peminjamanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackPinjam;
    private javax.swing.JButton btnCariTbBuku;
    private javax.swing.JButton btnCariTbPinjam;
    private javax.swing.JButton btnCekBuku;
    private javax.swing.JButton btnKembalikan;
    private javax.swing.JButton btnResetCariBuku;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField inputCariTbBuku;
    private javax.swing.JTextField inputCariTbPinjam;
    private javax.swing.JTextField inputIdBuku;
    private javax.swing.JTextField inputLibID;
    private javax.swing.JTextField inputTglPinjam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCariBuku;
    private javax.swing.JLabel labelCariPinjam;
    private javax.swing.JLabel labelIdBuku;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelLibID;
    private javax.swing.JLabel labelTableBuku;
    private javax.swing.JLabel labelTablePinjam;
    private javax.swing.JLabel labelTglPinjam;
    private javax.swing.JLabel labelsubJudul;
    // End of variables declaration//GEN-END:variables

    private void tampil(){
        int row = jTable1.getRowCount();
        for(int a=0; a<row; a++) {
            model.removeRow(0);
        }
        try {
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasakhir","root","");
            ResultSet rs = konek.createStatement().executeQuery("SELECT * FROM peminjaman");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(peminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tampilBuku(){
        int row = jTable2.getRowCount();
        for(int a=0; a<row; a++) {
            modell.removeRow(0);
        }
        try {
            Connection konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasakhir","root","");
            ResultSet rs = konek.createStatement().executeQuery("SELECT * FROM buku");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                modell.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(peminjamanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void reset() {
        inputLibID.setText("");

        inputIdBuku.setText("");
   
        inputTglPinjam.setText("");
    }
}
