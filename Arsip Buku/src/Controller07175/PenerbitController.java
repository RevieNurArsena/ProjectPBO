package Controller07175;

import Model.PenerbitModel;

public class PenerbitController {
    private PenerbitModel penerbit = new PenerbitModel();
    
    public void tambahPenerbit(String nama_penerbit){
        penerbit.tambahPenerbit(nama_penerbit);
    }
    
    public void updatePenerbit(String nama_penerbit, int id_penerbit){
        penerbit.updatePenerbit(nama_penerbit, id_penerbit);
    }
    
    public void deletePenerbit(int id_penerbit) {
        penerbit.deletePenerbit(id_penerbit);
    }
    
    public void viewPenerbit(){
        penerbit.viewPenerbit();
    }
}
