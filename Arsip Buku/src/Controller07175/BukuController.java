package Controller07175;

import Model.bukuModel;

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
}
