/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<member> Member = new ArrayList<>();
    
    public Database(){
        connect();
    }
    public void connect(){
        try{
            String url = "jdbc:mysql://localhost/tugasakhir";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement(); 
        } catch (SQLException e){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public void disconnect(){
        try{
            conn.close();
            stmt.close();
        }catch(SQLException e){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public ArrayList<member> getMember(){
        return Member;
    }
    public void addMember(member m){
        connect();
        String sql = "INSERT INTO member VALUES (";
        sql += "'" + m.getLibdId()+"','";
        sql += "'" + m.getNama()+"','";
        sql += "'" + m.getNoHp()+"','";
        sql += "'" + m.getEmail()+"','";
        sql += "'" + m.getTglLahir()+"','";
        
        sql += "'" + m.getPassword()+"','";
        disconnect();
    }
    public ResultSet getData(String SQLString){
        try {
            rs = stmt.executeQuery(SQLString);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error :"
                    +e.getMessage(),"Communication Error pada method getdata",
                    JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    public boolean ValidateDuplicate(String libID){
        boolean duplicate = false;
        connect();
        try{
            String query = "SELECT * FROM member WHERE libraryId='"+libID+"'";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                duplicate = true;
            }
        } catch (SQLException ex){
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
        
        return duplicate;
    }
     
    
}
