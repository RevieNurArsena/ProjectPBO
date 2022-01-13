package Model;

import Koneksi.koneksi07175;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class PenerbitModel {
    private Connection conn = koneksi07175.getconection07175();
    public void tambahPenerbit(String nama_penerbit){
        try {
             Statement stat07175 = conn.createStatement();
             String sql_in07175 = "INSERT INTO penerbit(nama_penerbit) VALUES ('%s')";
             sql_in07175 = String.format(sql_in07175, nama_penerbit);
             stat07175.execute(sql_in07175);

             System.out.println("Data Berhasil Di inputkan");
         }catch(SQLException e) {
             e.printStackTrace();
         }
    }

    public void updatePenerbit(String nama_penerbit, int id_penerbit){
        try{
             Statement stat07175 = conn.createStatement();
             String sql_up07175 = "UPDATE penerbit SET nama_penerbit='%s' WHERE id_penerbit=%d";
             sql_up07175 = String.format(sql_up07175, nama_penerbit, id_penerbit);
             stat07175.execute(sql_up07175);

             System.out.println("Data Berhasil Di Update");
         }catch(SQLException e){
             e.printStackTrace();
         }
    }

    public void deletePenerbit(int id_penerbit) {
        try{
             Statement stat07175 = conn.createStatement();
             String sql_del07175 = "DELETE FROM penerbit WHERE id_penerbit=%d";
             sql_del07175 = String.format(sql_del07175, id_penerbit);
             stat07175.execute(sql_del07175);

             System.out.println("Data Berhasil Di Hapus");
         }catch(SQLException e){
             e.printStackTrace();
         }
    }

    public void viewPenerbit(){
        try{
             String sql = "SELECT * FROM penerbit";
             PreparedStatement stat = conn.prepareStatement(sql);
             ResultSet rs = stat.executeQuery();
             while (rs.next()){
                 System.out.println("Id_Penerbit   : "+rs.getString("id_penerbit"));
                 System.out.println("Nama Penerbit : "+rs.getString("nama_penerbit"));
             }
         }catch (SQLException e){
             e.printStackTrace();

         }
    }
    
    public DefaultTableModel DaftarPGUI(){
       DefaultTableModel datapenerbit = new DefaultTableModel();
        int i = 1;
        try{
        Object [] kolom = {"NO", "ID PENERBIT", "PENERBIT"};
        datapenerbit.setColumnIdentifiers(kolom);
        
        String sql = "SELECT * FROM penerbit";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                Object[] data = new Object[3];
                data[0] = i++;
                data[1] = rs.getInt("id_penerbit");
                data[2] = rs.getString("nama_penerbit");
                datapenerbit.addRow(data);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return datapenerbit;
   }

     public static void main(String[] args) {
         PenerbitModel p = new PenerbitModel();
         p.viewPenerbit();
     }
}
