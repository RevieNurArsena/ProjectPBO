package GUI;

import Controller.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArsipBuku {
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
    
    public ArsipBuku(){
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
        
        idbuku = new JLabel("Id Buku : ");
        idbuku.setBounds(30, 310, 100, 30);
        log.add(idbuku);
        
        textbuku = new JTextField();
        textbuku.setBounds(30, 340, 150, 30);
        log.add(textbuku);
        
        idpenulis = new JLabel("Id Penulis : ");
        idpenulis.setBounds(200, 310, 100, 30);
        log.add(idpenulis);
        
        textpenulis = new JTextField();
        textpenulis.setBounds(200, 340, 150, 30);
        log.add(textpenulis);
        
        idpenerbit = new JLabel("Penerbit : ");
        idpenerbit.setBounds(370, 310, 100, 30);
        log.add(idpenerbit);
        
        textpenerbit = new JTextField();
        textpenerbit.setBounds(370, 340, 150, 30);
        log.add(textpenerbit);
        
        idtahunterbit = new JLabel("Tahun Terbit : ");
        idtahunterbit.setBounds(540, 310, 150, 30);
        log.add(idtahunterbit);
        
        texttahunterbit = new JTextField();
        texttahunterbit.setBounds(540, 340, 150, 30);
        log.add(texttahunterbit);
        
        tambah = new JButton("Tambah Arsip");
        tambah.setBounds(700, 340, 150, 30);
        log.add(tambah);
        
        update = new JButton("Ubah Arsip");
        update.setBounds(860, 340, 150, 30);
        log.add(update);
        
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
                arsipC.tambahArsip(Integer.valueOf(textbuku.getText()), Integer.valueOf(textpenulis.getText()), Integer.valueOf(textpenerbit.getText()), Integer.valueOf(texttahunterbit.getText()));
                viewArsip v =new viewArsip();
                log.dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        ArsipBuku a = new ArsipBuku();
    }
}
