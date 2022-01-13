package Controller;

import Model.bukuModel;
import javax.swing.table.DefaultTableModel;

public class BukuController {
    private bukuModel buku = new bukuModel();
    
    public void tambahBuku(String judul){
        buku.tambahBuku(judul);
    }
    
    public void updateBuku(String judul, int id_buku){
        buku.updateBuku(judul, id_buku);
    }
    
    public void deleteBuku(int id_buku) {
        buku.deleteBuku(id_buku);
    }
    
    public void viewBuku(){
        buku.viewBuku();
    }
    
    public DefaultTableModel DaftarBukuGUI(){
        return buku.DaftarBukuGUI();
    }
}
