/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class member {
    private String libID;
    private String nama;
    private String email;
    private String noHp;
    private Date tglLahir;
    private String Password;
    
    public member( String libID,String nama,String email, String noHp,
                   Date tglLahir,String Password){
        this.libID = libID;
        this.nama = nama;
        this.email = email;
        this.noHp = noHp;
        this.tglLahir = tglLahir;
        this.Password = Password;
    }
   public void setLibId(String libID){
       this.libID = libID;
   }
   public String getLibdId(){
       return this.libID;
   }
   public void setNama(String nama){
       this.nama = nama;
   }
   public String getNama(){
       return this.nama;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public String getEmail(){
       return this.email;
   }
   public void setNohp(String noHp){
       this.noHp = noHp;
   }
   public String getNoHp(){
       return this.noHp;
   }
   public void setTglLahir(Date tglLahir){
       this.tglLahir = tglLahir;
   }
   public Date getTglLahir(){
       return this.tglLahir;
   }
   public void setPassword(String Password){
       this.Password = Password;
   }
   public String getPassword(){
       return this.Password;
   }
}
