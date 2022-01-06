package Model;

import Koneksi.koneksi07175;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tahunTerbitModel {
    private Connection conn = koneksi07175.getconection07175();
    public void tambahTahunTerbit(String tahunterbit){
        try {
             Statement stat07175 = conn.createStatement();
             String sql_in07175 = "INSERT INTO tahunterbit(tahunterbit) VALUES ('%s')";
             sql_in07175 = String.format(sql_in07175, tahunterbit);
             stat07175.execute(sql_in07175);

             System.out.println("Data Berhasil Di inputkan");
         }catch(SQLException e) {
             e.printStackTrace();
         }
    }

    public void updateTahunTerbit(String tahunterbit, int id_tahunterbit){
        try{
             Statement stat07175 = conn.createStatement();
             String sql_up07175 = "UPDATE tahunterbit SET tahunterbit='%s' WHERE id_tahunterbit=%d";
             sql_up07175 = String.format(sql_up07175, tahunterbit, id_tahunterbit);
             stat07175.execute(sql_up07175);

             System.out.println("Data Berhasil Di Update");
         }catch(SQLException e){
             e.printStackTrace();
         }
    }

    public void deleteTahunTerbit(int id_tahunterbit) {
        try{
             Statement stat07175 = conn.createStatement();
             String sql_del07175 = "DELETE FROM tahunterbit WHERE id_tahunterbit=%d";
             sql_del07175 = String.format(sql_del07175, id_tahunterbit);
             stat07175.execute(sql_del07175);

             System.out.println("Data Berhasil Di Hapus");
         }catch(SQLException e){
             e.printStackTrace();
         }
    }

    public void viewTahunTerbit(){
        try{
             String sql = "SELECT * FROM tahunterbit";
             PreparedStatement stat = conn.prepareStatement(sql);
             ResultSet rs = stat.executeQuery();
             while (rs.next()){
                 System.out.println("Id Tahun Terbit   : "+rs.getString("id_tahunterbit"));
                 System.out.println("Tahun Terbit      : "+rs.getString("tahunterbit"));
             }
         }catch (SQLException e){
             e.printStackTrace();

         }
    }

     public static void main(String[] args) {
         tahunTerbitModel p = new tahunTerbitModel();
         p.viewTahunTerbit();
     }
}
