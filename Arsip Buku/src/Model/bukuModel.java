package Model;

import Koneksi.koneksi07175;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class bukuModel {
   private Connection conn = koneksi07175.getconection07175();
   public void tambahBuku(String judul){
       try {
            Statement stat07175 = conn.createStatement();
            String sql_in = "INSERT INTO buku(judul) VALUES ('%s')";
            sql_in = String.format(sql_in, judul);
            stat07175.execute(sql_in);
            
            System.out.println("Data Berhasil Di inputkan");
        }catch(SQLException e) {
            e.printStackTrace();
        }
   }
   
   public void updateBuku(String judul, int id_buku){
       try{
            Statement stat07175 = conn.createStatement();
            String sql_up = "UPDATE buku SET judul='%s' WHERE id_buku=%d";
            sql_up = String.format(sql_up, judul, id_buku);
            stat07175.execute(sql_up);
            
            System.out.println("Data Berhasil Di Update");
        }catch(SQLException e){
            e.printStackTrace();
        }
   }
   
   public void deleteBuku(int id_buku) {
       try{
            Statement stat07175 = conn.createStatement();
            String sql_del = "DELETE FROM buku WHERE id_buku=%d";
            sql_del = String.format(sql_del, id_buku);
            stat07175.execute(sql_del);
            
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
   
   public DefaultTableModel DaftarBukuGUI(){
       DefaultTableModel dataBuku = new DefaultTableModel();
        int i = 1;
        try{
        Object [] kolom = {"NO", "ID_BUKU", "JUDUL"};
        dataBuku.setColumnIdentifiers(kolom);
        
        String sql = "SELECT * FROM buku";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                Object[] data = new Object[3];
                data[0] = i++;
                data[1] = rs.getInt("id_buku");
                data[2] = rs.getString("judul");
                dataBuku.addRow(data);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dataBuku;
   }
   
    public static void main(String[] args) {
        bukuModel buku = new bukuModel();
        buku.tambahBuku("sang Pemimpi");
        buku.viewBuku();
    }
}
