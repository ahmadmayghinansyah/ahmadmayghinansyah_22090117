/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peminjamanbuku;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class konekdatabase {
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url ="jdbc:mysql://localhost/pinjamanbuku.db";
                String user="root";
                String pass="";
                koneksi = DriverManager.getConnection(url, user, pass);             
                System.out.println("Koneksi berhasil;");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
