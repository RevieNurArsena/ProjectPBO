package Controller07175;

import Model.tahunTerbitModel;

public class tahunTerbitController {
    private tahunTerbitModel tahun = new tahunTerbitModel();
    
    public void tambahTahunTerbit(String tahunterbit){
        tahun.tambahTahunTerbit(tahunterbit);
    }
    
    public void updateTahunTerbit(String tahunterbit, int id_tahunterbit){
        tahun.updateTahunTerbit(tahunterbit, id_tahunterbit);
    }
    
    public void deleteTahunTerbit(int id_tahunterbit) {
        tahun.deleteTahunTerbit(id_tahunterbit);
    }
    
    public void viewTahunTerbit(){
        tahun.viewTahunTerbit();
    }
}
