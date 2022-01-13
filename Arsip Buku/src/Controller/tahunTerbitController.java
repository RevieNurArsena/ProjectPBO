package Controller;

import Model.tahunTerbitModel;
import javax.swing.table.DefaultTableModel;

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
    
    public DefaultTableModel DaftartahunGUI(){
        return tahun.DaftarTahunGUI();
    }
}
