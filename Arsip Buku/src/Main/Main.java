//package Main;
//
//import Controller07175.adminController07175;
//import Controller07175.muridController07175;
//import Entity07175.muridEntity07175;
//import Model07175.muridModel07175;
//import java.util.Scanner;
//
//public class Main {
//        
//    public static void main(String[] args) {
//        muridController07175 murid07175 = new muridController07175();
//        adminController07175 admin07175 = new adminController07175();
//        Scanner input07175 = new Scanner(System.in);
//        int pilih07175, pil07175, p07175;
//        
//        do{
//        System.out.println("\nSELAMAT DATANG");
//        System.out.println("1. Login Admin");
//        System.out.println("2. Login Murid");
//        System.out.println("3. Daftar Murid");
//        System.out.println("0. EXIT");
//        
//        System.out.print("Silhakan Masukan Pilihan : ");
//        pilih07175 = input07175.nextInt();
//        
//        switch(pilih07175){
//            case 1:
//                System.out.print("Masukan Username  : ");
//                String usernameAdmin07175 = input07175.next();
//                System.out.print("Masukan Password  : ");
//                String passAdmin07175 = input07175.next();
//                if(admin07175.logAdmin07175(usernameAdmin07175, passAdmin07175) == false){
//                    System.out.println("Username Atau Password Anda Salah");
//                    break;
//                }else {
//                    do{
//                        System.out.println("\n1. Hapus Murid");
//                        System.out.println("2. View Murid Terdaftar");
//                        System.out.println("0. EXIT");
//
//                        System.out.print("Masukan Pilihan : ");
//                        pil07175 = input07175.nextInt();
//
//                        if(pil07175 == 1){
//                                System.out.println("\nHapus Murid");
//                                System.out.print("Masukan ID_kursus Yang Akan Dihapus: ");
//                                int idKursus07175 = input07175.nextInt();
//                                admin07175.deleteDataMurid07175(idKursus07175);
//                                
//                        }else if(pil07175 == 2){    
//                                System.out.println("\nVIEW MURID TERDAFTAR");
//                                admin07175.viewDataMurid07175();  
//                                
//                        }
//                    }while(pil07175 != 0);  
//                    //break;
//                }
//                break;
//            case 2:
//                System.out.print("Masukan Username  : ");
//                String usernameMurid07175 = input07175.next();
//                System.out.print("Masukan Password  : ");
//                String passMurid07175 = input07175.next();
//                int cek07175 = murid07175.loginMurid07175(usernameMurid07175, passMurid07175); 
//                if(cek07175 == 0){
//                    System.out.println("Username Atau Password Anda Salah");
//                    break;
//                }else {
//                    System.out.println("Berhasil Login");
//                    System.out.println("\nData Murid : ");
//                    murid07175.viewDataMurid07175(cek07175);
//                    do{
//                        
//                    System.out.println("\n1. Edit Profile Murid");
//                    System.out.println("0. EXIT");
//                    
//                    System.out.print("Masukan Pilihan : ");
//                    p07175 = input07175.nextInt();
//                    
//                    switch(p07175){
//                        case 1:
//                            System.out.println("\nEDIT PROFILE");
//                            System.out.print("Masukan ID Murid  : ");
//                            int idUp07175 = input07175.nextInt();
//                            System.out.print("Masukan Username  : ");
//                            String usernameUp07175 = input07175.next();
//                            System.out.print("Masukan Nama      : ");
//                            String namaUp07175 = input07175.next();
//                            System.out.print("Masukan Pass      : ");
//                            String passUp07175 = input07175.next();
//                            System.out.print("Masukan No Telp   : ");
//                            String notelpUp07175 = input07175.next();
//                            System.out.println();
//                            murid07175.updateDataMurid07175(idUp07175, usernameUp07175, namaUp07175, 
//                                    passUp07175, notelpUp07175);
//                            System.out.println("\nData Murid Setelah Di Update : ");
//                            murid07175.viewDataMurid07175(idUp07175);
//                            System.out.println();
//                            break;
//                    }
//                    }while(p07175 != 0); 
//                }
//                break;
//            case 3 :
//                System.out.println("DAFTAR MURID");
//                System.out.print("Masukan Username  : ");
//                String username07175 = input07175.next();
//                System.out.print("Masukan Nama      : ");
//                String nama07175 = input07175.next();
//                System.out.print("Masukan Pass      : ");
//                String pass07175 = input07175.next();
//                System.out.print("Masukan No Telp   : ");
//                String notelp07175 = input07175.next();
//                murid07175.DaftarDataMurid07175(username07175, nama07175, pass07175, notelp07175);
//                System.out.println();
//                break;
//        }
//       }while(pilih07175 != 0);
//    }    
//}
//
