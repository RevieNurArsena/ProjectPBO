package Controller;

import Model.arsipBuku;
import javax.swing.table.DefaultTableModel;

public class arsipController {
    arsipBuku arsip = new arsipBuku();
    
    public void tambahArsip(int id_buku, int id_penulis, int id_penerbit, int id_tahunterbit){
        arsip.tambahArsip(id_buku, id_penulis, id_penerbit, id_tahunterbit);
    }
    
    public void updateArsip(int id_buku, int id_penulis, int id_penerbit, int id_tahunterbit, int id_arsip){
        arsip.updateArsip(id_buku, id_penulis, id_penerbit, id_tahunterbit, id_arsip);
    }
    
    public void viewArsip(){
        arsip.viewArsip();
    }
    
    public DefaultTableModel arsipGUI(){
        return arsip.daftarDataArsip();
    }
}
