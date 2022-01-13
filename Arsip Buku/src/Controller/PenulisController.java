package Controller;

import Model.penulisModel;
import javax.swing.table.DefaultTableModel;

public class PenulisController {
    private penulisModel penulis = new penulisModel();
    
    public void tambahPenulis(String nama){
        penulis.tambahPenulis(nama);
    }
    
    public void updatePenulis(String nama_penulis, int id_penulis){
        penulis.updatePenulis(nama_penulis, id_penulis);
    }
    
    public void deletePenulis(int id_penulis) {
        penulis.deletePenulis(id_penulis);
    }
    
    public void viewPenulis(){
        penulis.viewPenulis();
    }
    
    public DefaultTableModel DaftarPenulisGUI(){
        return penulis.DaftarPenulisGUI();
    }
}
