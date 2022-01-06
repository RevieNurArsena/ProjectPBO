/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.AdminModel;
import Model.PenerbitModel;
import Model.bukuModel;
import java.util.Scanner;

/**
 *
 * @author Asus-PC
 */
public class ViewPenerbit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AdminModel admin = new AdminModel();
        PenerbitModel Penerbit = new PenerbitModel();
        bukuModel buku = new bukuModel();
        int pilih, pil;
        
        do{
        System.out.println("SELAMAT DATANG");
        System.out.println("1. Login Admin");
        System.out.println("2. Daftar Admin");
        System.out.println("0. EXIT");
        
        System.out.print("Silhakan Masukan Pilihan : ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1:
                System.out.print("Masukan Username  : ");
                String username = input.next();
                System.out.print("Masukan Password  : ");
                String pass = input.next();
                if(admin.login(username, pass) == false){
                    System.out.println("Gagal Login");
                    break;
                }else {
                    System.out.println("Berhasil Login");
                    do{
                    System.out.println("MENU : ");
                    System.out.println("1. Tambah Penerbit");
                    System.out.println("2. Delete Penerbit");
                    System.out.println("3. Update Penerbit");
                    System.out.println("4. View Penerbit");
                    
                    System.out.print("Silhakan Masukan Pilihan : ");
                    pil = input.nextInt();
                    
                    switch(pil){
                        case 1:
                            System.out.print("Masukan Nama Penerbit  : ");
                            String judul = input.next();
                        break;
                        
                        case 2:
                            System.out.print("Masukan ID Penerbit  : ");
                            int id_buku = input.nextInt();

                            buku.deleteBuku(id_buku);
                        break;
                        
                        case 3:
                            System.out.print("Masukan Id Penerbit  : ");
                            int id_bukuUp = input.nextInt();
                            System.out.print("Masukan Nama Penerbit : ");
                            String judulUp = input.next();

                            buku.updateBuku(judulUp, id_bukuUp);
                        break;
                        
                        case 4:
                            System.out.println("Data Penerbit : ");
                            buku.viewBuku();
                            break;
                    }
                    }while(pil != 0);
                }
        }    
    }while(pilih != 0);


        
    }
}