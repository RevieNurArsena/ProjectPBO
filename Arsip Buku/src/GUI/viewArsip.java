package GUI;

import Controller.arsipController;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class viewArsip {
    JFrame log = new JFrame();
    JLabel judul07175, arsip, idbuku, idpenulis, idpenerbit, idtahunterbit, idarsip;
    JTextField texbuku, textarsip, textpenerbit, textpenulis, texttahunterbit;
    JTable tableview;
    JScrollPane scroll;
    JButton backbutton, btnback, tambah, update;
    private arsipController arsipC = new arsipController();
    
    public viewArsip(){
        log.setSize(700, 400);
        log.setLayout(null);
        log.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("Arsip Buku");
        judul07175.setBounds(270, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        log.add(judul07175);
        
        arsip = new JLabel("Data Arsip : ");
        arsip.setBounds(30, 60, 100, 50);
        log.add(arsip);
        
        tableview = new JTable();
        scroll = new JScrollPane(tableview);
        scroll.setBounds(30, 100, 620, 200);
        tableview.setModel(arsipC.arsipGUI());
        log.add(scroll);
        
        btnback = new JButton("Kembali");
        btnback.setBounds(570, 320, 80, 25);
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
    }
    
    public static void main(String[] args) {
        viewArsip v =new viewArsip();
    }
}
