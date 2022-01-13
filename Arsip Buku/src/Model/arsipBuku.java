package Model;

import Koneksi.koneksi07175;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class arsipBuku {
    private Connection conn = koneksi07175.getconection07175();
    int id;
        
    public void tambahArsip(int id_buku, int id_penulis, int id_penerbit, int id_tahunterbit){
        try {
            Statement stat07175 = conn.createStatement();
            String sql_in = "INSERT INTO arsip(id_buku, id_penulis, id_penerbit, id_tahunterbit) VALUES (%d, %d, %d, %d)";
            sql_in = String.format(sql_in, id_buku, id_penulis, id_penerbit, id_tahunterbit);
            stat07175.execute(sql_in);
            
            System.out.println("Data Berhasil Di inputkan");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateArsip(int id_buku, int id_penulis, int id_penerbit, int id_tahunterbit, int id_arsip){
       try{
            Statement stat07175 = conn.createStatement();
            String sql_up = "UPDATE arsip SET id_buku=%d, id_penulis=%d, id_penerbit=%d, id_tahunterbit WHERE id_arsip=%d";
            sql_up = String.format(sql_up, id_buku, id_penulis, id_penerbit, id_tahunterbit, id_arsip);
            stat07175.execute(sql_up);
            
            System.out.println("Data Berhasil Di Update");
        }catch(SQLException e){
            e.printStackTrace();
        }
   }
    
    public void viewArsip(){
       int i = 1;
        try{
            String sql = "SELECT arsip.id_arsip, buku.judul, penulis.nama, penerbit.nama_penerbit, tahunterbit.tahunterbit FROM arsip JOIN buku ON buku.Id_buku = arsip.id_buku JOIN penulis ON penulis.id_penulis = arsip.id_penulis JOIN penerbit ON penerbit.id_penerbit = arsip.id_penerbit JOIN tahunterbit ON tahunterbit.id_tahunterbit = arsip.id_tahunterbit";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                System.out.println("No            : " + i++);
                System.out.println("Id_Arsip      : "+rs.getInt("id_arsip"));
                System.out.println("Judul         : "+rs.getString("judul"));
                System.out.println("Penulis       : "+rs.getString("nama"));
                System.out.println("Penerbit      : "+rs.getString("nama_penerbit"));
                System.out.println("Tahun Terbit  : "+rs.getString("tahunterbit"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public DefaultTableModel daftarDataArsip(){
        DefaultTableModel dataArsip = new DefaultTableModel();
        int i = 1;
        try{
        Object [] kolom = {"NO", "ID_ARSIP", "JUDUL", "PENULIS" ,"PENGARANG", "TAHUN TERBIT"};
        dataArsip.setColumnIdentifiers(kolom);
        
        String sql = "SELECT arsip.id_arsip, buku.judul, penulis.nama, penerbit.nama_penerbit, tahunterbit.tahunterbit FROM arsip JOIN buku ON buku.Id_buku = arsip.id_buku JOIN penulis ON penulis.id_penulis = arsip.id_penulis JOIN penerbit ON penerbit.id_penerbit = arsip.id_penerbit JOIN tahunterbit ON tahunterbit.id_tahunterbit = arsip.id_tahunterbit";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                Object[] data = new Object[6];
                data[0] = i++;
                data[1] = rs.getInt("id_arsip");
                data[2] = rs.getString("judul");
                data[3] = rs.getString("nama");
                data[4] = rs.getString("nama_penerbit");
                data[5] = rs.getString("tahunterbit");
                dataArsip.addRow(data);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dataArsip;
    }
}
