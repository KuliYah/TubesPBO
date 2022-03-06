/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;
/**
 *
 * @author danda
 */
public class Database_admin {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    
    public Database_admin(){
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
            Logger.getLogger(Database_admin.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    public void disconnect(){
        try{
            conn.close();
            stmt.close();
        }catch(SQLException e){
            Logger.getLogger(Database_admin.class.getName()).log(Level.SEVERE,null,e);
        }
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
            Logger.getLogger(Database_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
        
        return duplicate;
    }
}