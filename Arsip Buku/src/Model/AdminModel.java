package Model;

import Koneksi.koneksi07175;
import java.sql.*;

public class AdminModel {
    private Connection conn = koneksi07175.getconection07175();
    private String sql_log;
    
    public boolean login(String username, String password){
        boolean login = false;
        try {
            Statement stat = conn.createStatement();
            sql_log = "SELECT * FROM admin WHERE username='%s' AND password='%s'";
            sql_log = String.format(sql_log, username, password);
            ResultSet rs = stat.executeQuery(sql_log);            
            if(rs.next()){
                login = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return login; 
    }
    
    public void daftarAdmin(String username, String nama, String pass, String alamat, String notelp){
        try {
            Statement stat07175 = conn.createStatement();
            String sql_in07175 = "INSERT INTO admin(username, nama, password, alamat, no_telp) VALUES ('%s','%s','%s','%s','%s')";
            sql_in07175 = String.format(sql_in07175, username, nama, pass, alamat, notelp);
            stat07175.execute(sql_in07175);
            
            System.out.println("Data Berhasil Di inputkan");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
//    
//    public void viewAdmin()
//    {
//        try{
//            String sql = "SELECT * FROM admin";
//            PreparedStatement stat = conn.prepareStatement(sql);
//            ResultSet rs = stat.executeQuery();
//            while (rs.next()){
//                System.out.println("USERNAME    : "+rs.getString("username"));
//                System.out.println("NAMA   : "+rs.getString("nama"));
//                System.out.println("ALAMAT : "+rs.getString("alamat"));
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//
//        }
//    }
}
