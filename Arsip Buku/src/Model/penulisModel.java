package Model;

import Koneksi.koneksi07175;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class penulisModel {
    private Connection conn = koneksi07175.getconection07175();
    public void tambahPenulis(String nama){
        try {
             Statement stat07175 = conn.createStatement();
             String sql_in07175 = "INSERT INTO penulis(nama) VALUES ('%s')";
             sql_in07175 = String.format(sql_in07175, nama);
             stat07175.execute(sql_in07175);

             System.out.println("Data Berhasil Di inputkan");
         }catch(SQLException e) {
             e.printStackTrace();
         }
    }

    public void updatePenulis(String penulis, int id_penulis){
        try{
             Statement stat07175 = conn.createStatement();
             String sql_up07175 = "UPDATE penulis SET penulis='%s' WHERE id_penerbit=%d";
             sql_up07175 = String.format(sql_up07175, penulis, id_penulis);
             stat07175.execute(sql_up07175);

             System.out.println("Data Berhasil Di Update");
         }catch(SQLException e){
             e.printStackTrace();
         }
    }

    public void deletePenulis(int id_penulis) {
        try{
             Statement stat07175 = conn.createStatement();
             String sql_del07175 = "DELETE FROM penulis WHERE id_penulis=%d";
             sql_del07175 = String.format(sql_del07175, id_penulis);
             stat07175.execute(sql_del07175);

             System.out.println("Data Berhasil Di Hapus");
         }catch(SQLException e){
             e.printStackTrace();
         }
    }

    public void viewPenulis(){
        try{
             String sql = "SELECT * FROM penulis";
             PreparedStatement stat = conn.prepareStatement(sql);
             ResultSet rs = stat.executeQuery();
             while (rs.next()){
                 System.out.println("Id_Penulis    : "+rs.getString("id_penulis"));
                 System.out.println("Penulis       : "+rs.getString("nama"));
             }
         }catch (SQLException e){
             e.printStackTrace();

         }
    }

     public static void main(String[] args) {
         penulisModel p = new penulisModel();
         p.viewPenulis();
     }
}
