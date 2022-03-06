/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;


import admin.Dashboard_admin;
import admin.Login_admin;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.*;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {
   Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public String url = "jdbc:mysql://localhost/tugasakhir";
    public String user = "root";
    public String pass = "";
    Database db;
    ArrayList<member> Member = new ArrayList();
    DefaultListModel<String> listMember = new DefaultListModel<>();
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        db = new Database();
        tampilData();
    }
    public void tampilData(){
        try{
            String sql = "SELECT * FROM member";
            rs = db.getData(sql);
            while(rs.next()){
                String libID = rs.getString(1);
                String nama = rs.getString(2);
                String noHp = rs.getString(3);
                String email = rs.getString(4);
                Date tglLahir = rs.getDate(5);
                String Password = rs.getString(6);
                Member.add(new member(libID,nama,noHp,email,tglLahir,Password));
                listMember.addElement(libID);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        btnSignUp1 = new javax.swing.JLabel();
        libId = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        inputLibId = new javax.swing.JTextField();
        inputPass = new javax.swing.JPasswordField();
        btnConfirm1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignUp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSignUp1.setText("Didn't have an account? Sign Up Here!");
        btnSignUp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUp1MouseClicked(evt);
            }
        });
        jPanel1.add(btnSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        libId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        libId.setText("Library Id");
        jPanel1.add(libId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, 40));

        pass1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pass1.setText("Password");
        jPanel1.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        inputLibId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLibIdActionPerformed(evt);
            }
        });
        jPanel1.add(inputLibId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 220, 40));

        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });
        jPanel1.add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 220, 40));

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
        jPanel1.add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 80, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("WELCOME TO PERPUS.ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        admin.setBackground(new java.awt.Color(0, 0, 0));
        admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/iconProfile.png"))); // NOI18N
        admin.setText("Login As Admin");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 170, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/Desktop - 1 (1).png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUp1MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 1){
            new daftarAkun().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSignUp1MouseClicked

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
          String login = ("SELECT * FROM member WHERE libraryId = '"+inputLibId.getText()+"' AND password = '"+String.valueOf(inputPass.getPassword())+"'");
          rs = stmt.executeQuery(login);
          
          if(rs.next()){
            String nama = rs.getString(2);
            String noHp = rs.getString(3);
            String email = rs.getString(4);
            Date tglLahir = rs.getDate(5);
            String Password = rs.getString(6);            
            String l = "INSERT INTO log_in VALUES  ('"+ inputLibId.getText()+"','"+nama+"','"+ noHp+"','"
                                                + email+"','"+ tglLahir+"','" +Password+"')";
            stmt.executeUpdate(l);
            JOptionPane.showMessageDialog(null, "Login Berhasil","Success",1);
            new Dashboard().setVisible(true);
            dispose();
         dispose();
          }else{
               JOptionPane.showMessageDialog(rootPane, "Username dan Password Salah\nAtau Akun Belum Terdaftar", "Pesan", 0);
          }
        } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Login Gagal", "Error", 0);
            }
        
    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==1){
            new Login_admin().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_adminMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JLabel btnSignUp1;
    private javax.swing.JTextField inputLibId;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
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