/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.java.exercise.java.service;

/**
 *
 * @author Zahran Rafif Pc
 */
public class projectSerVice {
    
    private String id;
    private String no_ktp;
    private String nama;
    private String alamat;
    
    public projectSerVice(){
        
    }
    public projectSerVice(String id, String no_ktp, String nama, String alamat){
        super();
        this.id = id;      
        this.no_ktp = no_ktp;
        this.nama = nama;
        this.alamat = alamat;             
    }
    
    //id
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    //ktp
    public String getno_ktp(){
        return no_ktp;
    }
    public void setktp(String no_ktp){
        this.no_ktp = no_ktp;
    }
    //nama
    public String getNama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    //alamat
    public String getAlamat(){
        return alamat;
    }
    public void getAlamat(String alamat){
        this.alamat = alamat;
    }
}
