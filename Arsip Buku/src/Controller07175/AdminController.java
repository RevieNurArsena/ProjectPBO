package Controller07175;

import Model.AdminModel;

public class AdminController {
    private AdminModel admin = new AdminModel();
    
    public boolean login(String username, String password){
        return admin.login(username, password);
    }
    
    public void daftarAdmin(String username, String nama, String pass, String alamat, String notelp){
        admin.daftarAdmin(username, nama, pass, alamat, notelp);
    }
    
    public void viewAdmin(){
        admin.viewAdmin();
    }
}
