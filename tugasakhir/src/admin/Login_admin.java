/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import java.util.Date;
/**
 *
 * @author danda
 */
public class Login_admin extends javax.swing.JFrame {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public String url = "jdbc:mysql://localhost/tugasakhir";
    public String user = "root";
    public String pass = "";
    Database_admin db;
    /**
     * Creates new form Login
     */
    public Login_admin() {
        initComponents();
        db = new Database_admin();
    }
    
    public void tampilData(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackDriver = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        libId = new javax.swing.JLabel();
        inputLibId = new javax.swing.JTextField();
        pass1 = new javax.swing.JLabel();
        inputPass = new javax.swing.JPasswordField();
        btnConfirm1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBackDriver.setBackground(new java.awt.Color(253, 137, 0));
        btnBackDriver.setPreferredSize(new java.awt.Dimension(516, 392));
        btnBackDriver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("WELCOME TO PERPUS.ID");
        btnBackDriver.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        libId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        libId.setText("Library Id");
        btnBackDriver.add(libId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 40));

        inputLibId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLibIdActionPerformed(evt);
            }
        });
        btnBackDriver.add(inputLibId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 220, 40));

        pass1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pass1.setText("Password");
        btnBackDriver.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });
        btnBackDriver.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 220, 40));

        btnConfirm1.setBackground(new java.awt.Color(253, 137, 0));
        btnConfirm1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirm1.setText("Confirm");
        btnConfirm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirm1MouseClicked(evt);
            }
        });
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });
        btnBackDriver.add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 370, 40));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        btnBackDriver.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 370, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/bg perpusid.jpeg"))); // NOI18N
        btnBackDriver.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBackDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBackDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputLibIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLibIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLibIdActionPerformed

    private void inputPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPassActionPerformed

    private void btnConfirm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirm1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnConfirm1MouseClicked

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        // TODO add your handling code here:
        db.connect();
        try{
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            String login = ("SELECT * FROM admin WHERE libraryId = '"+inputLibId.getText()+"' AND password = '"+String.valueOf(inputPass.getPassword())+"'");
            rs = stmt.executeQuery(login);

            if(rs.next()){
                String l = "INSERT INTO login_admin VALUES  ('"+ inputLibId.getText()+"', '"+String.valueOf(inputPass.getPassword())+"')";
                stmt.executeUpdate(l);
                JOptionPane.showMessageDialog(null, "Login Berhasil","Success",1);
                new Dashboard_admin().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Username dan Password Salah\nAtau Akun Belum Terdaftar", "Pesan", 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Login Gagal", "Error", 0);
        }

    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dashboard_admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBackDriver;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JTextField inputLibId;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel libId;
    private javax.swing.JLabel pass1;
    // End of variables declaration//GEN-END:variables
    public JTextField getLibID(){
        return inputLibId;
    }
    public String getlibb(){
        String x = inputLibId.getText();
        return x;
    }

}