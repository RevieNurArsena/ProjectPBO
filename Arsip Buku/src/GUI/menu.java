package GUI;

import Controller.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menu {
    JFrame log = new JFrame();
    JLabel judul07175, arsip, idbuku, idpenulis, idpenerbit, idtahunterbit, idarsip, buku, penulis, penerbit, tahun;
    JTextField textbuku, textarsip, textpenerbit, textpenulis, texttahunterbit;
    JTable tableview, tbuku, tpenulis, tpenerbit, ttahun;
    JScrollPane scroll, sp, spe, st;
    JButton backbutton, btnback, tambah, update, delete;
    JButton tambahP, updateP, deleteP;
    JButton tambahPe, updatePe, deletePe;
    JButton tambahT, updateT, deleteT;
    private arsipController arsipC = new arsipController();
    private BukuController bukuC = new BukuController();
    private PenulisController penulisC = new PenulisController();
    private PenerbitController penerbitC = new PenerbitController();
    private tahunTerbitController tahunC = new tahunTerbitController();
    
    public menu(){
        log.setSize(1350, 700);
        log.setLayout(null);
        log.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("Menu");
        judul07175.setBounds(320, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        log.add(judul07175);
        
        buku = new JLabel("Data Buku : ");
        buku.setBounds(30, 60, 100, 50);
        log.add(buku);
        
        tableview = new JTable();
        scroll = new JScrollPane(tableview);
        scroll.setBounds(30, 100, 300, 100);
        tableview.setModel(bukuC.DaftarBukuGUI());
        log.add(scroll);
        
        penulis = new JLabel("Data Penulis : ");
        penulis.setBounds(350, 60, 100, 50);
        log.add(penulis);
        
        tpenulis = new JTable();
        sp = new JScrollPane(tpenulis);
        sp.setBounds(350, 100, 300, 100);
        tpenulis.setModel(penulisC.DaftarPenulisGUI());
        log.add(sp);
        
        penerbit = new JLabel("Data Penerbit : ");
        penerbit.setBounds(670, 60, 100, 50);
        log.add(penerbit);
        
        tpenerbit = new JTable();
        spe = new JScrollPane(tpenerbit);
        spe.setBounds(670, 100, 300, 100);
        tpenerbit.setModel(penerbitC.DaftarPGUI());
        log.add(spe);
        
        tahun = new JLabel("Data Tahun Tebit : ");
        tahun.setBounds(990, 60, 200, 50);
        log.add(tahun);
        
        ttahun = new JTable();
        st = new JScrollPane(ttahun);
        st.setBounds(990, 100, 300, 100);
        ttahun.setModel(tahunC.DaftartahunGUI());
        log.add(st);
        
        idarsip = new JLabel("Id : ");
        idarsip.setBounds(30, 250, 100, 30);
        log.add(idarsip);
        
        textarsip = new JTextField();
        textarsip.setBounds(30, 280, 150, 30);
        log.add(textarsip);
        
        idbuku = new JLabel("Judul : ");
        idbuku.setBounds(30, 310, 100, 30);
        log.add(idbuku);
        
        textbuku = new JTextField();
        textbuku.setBounds(30, 340, 150, 30);
        log.add(textbuku);
        
        idpenulis = new JLabel("Penulis : ");
        idpenulis.setBounds(30, 370, 100, 30);
        log.add(idpenulis);
        
        textpenulis = new JTextField();
        textpenulis.setBounds(30, 400, 150, 30);
        log.add(textpenulis);
        
        idpenerbit = new JLabel("Penerbit : ");
        idpenerbit.setBounds(30, 430, 100, 30);
        log.add(idpenerbit);
        
        textpenerbit = new JTextField();
        textpenerbit.setBounds(30, 460, 150, 30);
        log.add(textpenerbit);
        
        idtahunterbit = new JLabel("Tahun Terbit : ");
        idtahunterbit.setBounds(30, 490, 150, 30);
        log.add(idtahunterbit);
        
        texttahunterbit = new JTextField();
        texttahunterbit.setBounds(30, 520, 150, 30);
        log.add(texttahunterbit);
        
        tambah = new JButton("Tambah Buku");
        tambah.setBounds(200, 340, 150, 30);
        log.add(tambah);
        
        update = new JButton("Ubah Buku");
        update.setBounds(360, 340, 150, 30);
        log.add(update);
        
        delete = new JButton("Hapus Buku");
        delete.setBounds(520, 340, 150, 30);
        log.add(delete);
        
        tambahP = new JButton("Tambah Penulis");
        tambahP.setBounds(200, 400, 150, 30);
        log.add(tambahP);
        
        updateP = new JButton("Ubah Penulis");
        updateP.setBounds(360, 400, 150, 30);
        log.add(updateP);
        
        deleteP = new JButton("Hapus Penulis");
        deleteP.setBounds(520, 400, 150, 30);
        log.add(deleteP);
        
        tambahPe = new JButton("Tambah Penerbit");
        tambahPe.setBounds(200, 460, 150, 30);
        log.add(tambahPe);
        
        updatePe = new JButton("Ubah Penerbit");
        updatePe.setBounds(360, 460, 150, 30);
        log.add(updatePe);
        
        deletePe = new JButton("Hapus Penerbit");
        deletePe.setBounds(520, 460, 150, 30);
        log.add(deletePe);
        
        tambahT = new JButton("Tambah Tahun Terbit");
        tambahT.setBounds(200, 520, 200, 30);
        log.add(tambahT);
        
        updateT = new JButton("Ubah Tahun Terbit");
        updateT.setBounds(410, 520, 200, 30);
        log.add(updateT);
        
        deleteT = new JButton("Hapus Tahun Terbit");
        deleteT.setBounds(620, 520, 200, 30);
        log.add(deleteT);
        
        btnback = new JButton("Kembali");
        btnback.setBounds(580, 600, 80, 25);
        btnback.setBackground(Color.gray);
        btnback.setForeground(Color.white);
        log.add(btnback); 
        
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log.setVisible(true);
        log.setLocationRelativeTo(null); 
        
        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuAdmin m = new menuAdmin();
                log.dispose();
            }
        });
        
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bukuC.tambahBuku(String.format(textbuku.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bukuC.updateBuku(String.format(textbuku.getText()), Integer.valueOf(textarsip.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bukuC.deleteBuku(Integer.valueOf(textarsip.getText()));
                menu me = new menu();
                log.dispose();
            }
        });
        
        tambahP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                penulisC.tambahPenulis(String.format(textpenulis.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        updateP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                penulisC.updatePenulis(String.format(textpenulis.getText()), Integer.valueOf(textarsip.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        deleteP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                penulisC.deletePenulis(Integer.valueOf(textarsip.getText()));
                menu me = new menu();
                log.dispose();
            }
        });
        
        tambahPe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                penerbitC.tambahPenerbit(String.format(textpenerbit.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        updatePe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                penerbitC.updatePenerbit(String.format(textpenerbit.getText()), Integer.valueOf(textarsip.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        deletePe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                penerbitC.deletePenerbit(Integer.valueOf(textarsip.getText()));
                menu me = new menu();
                log.dispose();
            }
        });
        
        tambahT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tahunC.tambahTahunTerbit(String.format(texttahunterbit.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        updateT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tahunC.updateTahunTerbit(String.format(texttahunterbit.getText()), Integer.valueOf(textarsip.getText()));
                
                menu me = new menu();
                log.dispose();
            }
        });
        
        deleteT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tahunC.deleteTahunTerbit(Integer.valueOf(textarsip.getText()));
                menu me = new menu();
                log.dispose();
            }
        });
    }
    public static void main(String[] args) {
       menu m = new menu();
    }
}
