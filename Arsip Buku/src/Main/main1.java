package Main;

import Model.*;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AdminModel admin = new AdminModel();
        PenerbitModel penerbit = new PenerbitModel();
        penulisModel penulis = new penulisModel();
        tahunTerbitModel tahun = new tahunTerbitModel();
        bukuModel buku = new bukuModel();
        arsipBuku arsip = new arsipBuku();
        int pilih, pil, pilihMenu, pilihmenuPenulis, pilihMenuPenerbit, pilihMenuTahunTerbit, pilihArsip;
        
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
                    System.out.println("MENU: ");
                    System.out.println("1. MENU Buku");
                    System.out.println("2. MENU Penerbit");
                    System.out.println("3. MENU Penulis");
                    System.out.println("4. MENU Tahun Tetbit");
                    System.out.println("5. MENU Arsip Buku");
                    System.out.println("0. KELUAR");
                    
                        System.out.print("Masukan Pilihan : ");
                        pilihMenu = input.nextInt();
                        
                        switch(pilihMenu){
                            case 1 :
                                do{
                                System.out.println("MENU BUKU: ");
                                System.out.println("1. Tambah Buku");
                                System.out.println("2. Delete Buku");
                                System.out.println("3. Update Buku");
                                System.out.println("4. View Buku");
                                System.out.println("0. KELUAR");
                                
                                System.out.print("Silhakan Masukan Pilihan : ");
                                pil = input.nextInt();

                                switch(pil){
                                    case 1:
                                        System.out.print("Masukan Judul Buku  : ");
                                        String judul = input.next();

                                        buku.tambahBuku(judul);
                                    break;

                                    case 2:
                                        System.out.print("Masukan Id Buku  : ");
                                        int id_buku = input.nextInt();

                                        buku.deleteBuku(id_buku);
                                    break;

                                    case 3:
                                        System.out.print("Masukan Id Buku  : ");
                                        int id_bukuUp = input.nextInt();
                                        System.out.print("Masukan Judul Buku : ");
                                        String judulUp = input.next();

                                        buku.updateBuku(judulUp, id_bukuUp);
                                    break;

                                    case 4:
                                        System.out.println("Data Buku : ");
                                        buku.viewBuku();
                                    break;
                                    
                                    default:
                                        System.out.println("\nKELUAR\n");
                                        break;
                                }
                            }while(pil != 0);
                                break;
                                
                            case 2:
                                do{
                                System.out.println("MENU PENERBIT: ");
                                System.out.println("1. Tambah Penerbit");
                                System.out.println("2. Delete Penerbit");
                                System.out.println("3. Update Penerbit");
                                System.out.println("4. View Penerbit");
                                System.out.println("0. KELUAR");
                                
                                System.out.print("Silhakan Masukan Pilihan : ");
                                pilihMenuPenerbit = input.nextInt();
                                
                                switch(pilihMenuPenerbit){
                                    case 1:
                                        System.out.print("Masukan Nama Penerbit : ");
                                        String p = input.next();

                                        penerbit.tambahPenerbit(p);
                                    break;

                                    case 2:
                                        System.out.print("Masukan Id Penerbit   : ");
                                        int id_penerbit = input.nextInt();

                                        penerbit.deletePenerbit(id_penerbit);
                                    break;

                                    case 3:
                                        System.out.print("Masukan Id Penerbit   : ");
                                        int id_pUpt = input.nextInt();
                                        System.out.print("Masukan Nama Penerbit : ");
                                        String pUpt = input.next();

                                        penerbit.updatePenerbit(pUpt, id_pUpt);
                                    break;

                                    case 4:
                                        System.out.println("Data Penerbit : ");
                                        penerbit.viewPenerbit();
                                    break;
                                    
                                    default:
                                        System.out.println("\nKELUAR\n");
                                        break;
                                }
                                
                                }while(pilihMenuPenerbit != 0);
                                break;
                                
                            case 3:
                                do{
                                System.out.println("MENU PENULIS: ");
                                System.out.println("1. Tambah Penulis");
                                System.out.println("2. Delete Penulis");
                                System.out.println("3. Update Penulis");
                                System.out.println("4. View Penulis");
                                System.out.println("0. KELUAR");
                                
                                System.out.print("Silhakan Masukan Pilihan : ");
                                pilihmenuPenulis = input.nextInt();
                                
                                switch(pilihmenuPenulis){
                                    case 1:
                                        System.out.print("Masukan Nama Penulis : ");
                                        String pe = input.next();

                                        penulis.tambahPenulis(pe);
                                    break;

                                    case 2:
                                        System.out.print("Masukan Id Penulis   : ");
                                        int id_pe = input.nextInt();

                                        penulis.deletePenulis(id_pe);
                                    break;

                                    case 3:
                                        System.out.print("Masukan Id Penulis   : ");
                                        int id_peUp = input.nextInt();
                                        System.out.print("Masukan Nama Penulis : ");
                                        String peUp = input.next();

                                        penulis.updatePenulis(peUp, id_peUp);
                                    break;

                                    case 4:
                                        System.out.println("Data Penulis : ");
                                        penulis.viewPenulis();
                                    break;
                                    
                                    default:
                                        System.out.println("\nKELUAR\n");
                                        break;
                                }
                                
                            }while(pilihmenuPenulis != 0);
                            break;
                            
                            case 4 :
                                do{
                                System.out.println("MENU TAHUN TERBIT: ");
                                System.out.println("1. Tambah Tahun Terbit ");
                                System.out.println("2. Delete Tahun Terbit");
                                System.out.println("3. Update Tahun Terbit");
                                System.out.println("4. View Tahun Terbit");
                                System.out.println("0. KELUAR");
                                
                                System.out.print("Silhakan Masukan Pilihan : ");
                                pilihMenuTahunTerbit = input.nextInt();
                                
                                switch(pilihMenuTahunTerbit){
                                    case 1:
                                        System.out.print("Masukan Nama Tahun Terbit : ");
                                        String t = input.next();

                                        tahun.tambahTahunTerbit(t);
                                    break;

                                    case 2:
                                        System.out.print("Masukan Id Tahun Terbit   : ");
                                        int id_t = input.nextInt();

                                        tahun.deleteTahunTerbit(id_t);
                                    break;

                                    case 3:
                                        System.out.print("Masukan Id Tahun Terbit   : ");
                                        int id_tUp = input.nextInt();
                                        System.out.print("Masukan Nama Tahun Terbit : ");
                                        String tUp = input.next();

                                        tahun.updateTahunTerbit(tUp, id_tUp);
                                    break;

                                    case 4:
                                        System.out.println("Data Tahun Terbit : ");
                                        tahun.viewTahunTerbit();
                                    break;
                                    
                                    default:
                                        System.out.println("\nKELUAR\n");
                                        break;
                                }
                                
                            }while(pilihMenuTahunTerbit != 0);
                                
                            case 5: 
                                do{
                                System.out.println("MENU TAHUN TERBIT: ");
                                System.out.println("1. Tambah Arsip Buku");
                                System.out.println("2. Update Arsip Buku");
                                System.out.println("3. View Arsip Buku");
                                System.out.println("0. KELUAR");
                                
                                System.out.print("Silhakan Masukan Pilihan : ");
                                pilihArsip = input.nextInt();
                                
                                switch(pilihArsip){
                                    case 1:
                                        System.out.println("Data Buku : ");
                                        buku.viewBuku();
                                        System.out.println("\nData Penulis : ");
                                        penulis.viewPenulis();
                                        System.out.println("\nData Penerbit : ");
                                        penerbit.viewPenerbit();
                                        System.out.println("\nData Tahun Terbit : ");
                                        tahun.viewTahunTerbit();
                                        
                                        System.out.print("\nMasukan Id Buku :");
                                        int idb= input.nextInt();
                                        System.out.print("Masukan Id Penulis :");
                                        int idp= input.nextInt();
                                        System.out.print("Masukan Id Penerbit :");
                                        int idpe= input.nextInt();
                                        System.out.print("Masukan Id Tahun Terbit :");
                                        int idt= input.nextInt();
                                        
                                        arsip.tambahArsip(idb, idpe, idpe, idt);
                                        
                                    break;

                                    case 2:
                                        System.out.println("\nData Arsip : ");
                                        arsip.viewArsip();
                                        System.out.print("\nMasukan Id Arsip       : ");
                                        int ida = input.nextInt();
                                        System.out.print("Masukan Id Buku         :");
                                        int idbUp= input.nextInt();
                                        System.out.print("Masukan Id Penulis      :");
                                        int idpUp= input.nextInt();
                                        System.out.print("Masukan Id Penerbit     :");
                                        int idpeUp= input.nextInt();
                                        System.out.print("Masukan Id Tahun Terbit :");
                                        int idtUp= input.nextInt();

                                        arsip.updateArsip(idbUp, idpUp, idpeUp, idtUp, ida);
                                    break;

                                    case 3:
                                        System.out.println("\nData Arsip :");
                                        arsip.viewArsip();
                                    break;
                                    
                                    default:
                                        System.out.println("\nKELUAR\n");
                                        break;
                                }
                                
                                }while(pilihArsip != 0);
                                break;
                    }
                    
                    
                        
                    }while(pilihMenu != 0);
                    break;
                }
            case 2: 
                System.out.print("Masukan Username  : ");
                String usernameDaftar = input.next();
                System.out.print("Masukan Nama      : ");
                String nama = input.next();
                System.out.print("Masukan Password  : ");
                String password = input.next();
                System.out.print("Masukan Alamat    : ");
                String alamat = input.next();
                System.out.print("Masukan No Telp   : ");
                String notelp = input.next();
                
                //admin.daftarAdmin(usernameDaftar, nama, password, alamat, notelp);
                break;
        }
    }while(pilih != 0);
  }
}
