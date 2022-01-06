package Model;

import Koneksi.koneksi07175;
import java.sql.*;

public class bukuModel {
   private Connection conn = koneksi07175.getconection07175();
   public void tambahBuku(String judul){
       try {
            Statement stat07175 = conn.createStatement();
            String sql_in07175 = "INSERT INTO buku(judul) VALUES ('%s')";
            sql_in07175 = String.format(sql_in07175, judul);
            stat07175.execute(sql_in07175);
            
            System.out.println("Data Berhasil Di inputkan");
        }catch(SQLException e) {
            e.printStackTrace();
        }
   }
   
   public void updateBuku(String judul, int id_buku){
       try{
            Statement stat07175 = conn.createStatement();
            String sql_up07175 = "UPDATE buku SET judul='%s' WHERE id_buku=%d";
            sql_up07175 = String.format(sql_up07175, judul, id_buku);
            stat07175.execute(sql_up07175);
            
            System.out.println("Data Berhasil Di Update");
        }catch(SQLException e){
            e.printStackTrace();
        }
   }
   
   public void deleteBuku(int id_buku) {
       try{
            Statement stat07175 = conn.createStatement();
            String sql_del07175 = "DELETE FROM buku WHERE id_buku=%d";
            sql_del07175 = String.format(sql_del07175, id_buku);
            stat07175.execute(sql_del07175);
            
            System.out.println("Data Berhasil Di Hapus");
        }catch(SQLException e){
            e.printStackTrace();
        }
   }
   
   public void viewBuku(){
       try{
            String sql = "SELECT * FROM buku";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                System.out.println("Id_Buku    : "+rs.getString("id_buku"));
                System.out.println("Judul      : "+rs.getString("judul"));
            }
        }catch (SQLException e){
            e.printStackTrace();

        }
   }
   
    public static void main(String[] args) {
        bukuModel buku = new bukuModel();
        buku.tambahBuku("sang Pemimpi");
        buku.viewBuku();
    }
}
