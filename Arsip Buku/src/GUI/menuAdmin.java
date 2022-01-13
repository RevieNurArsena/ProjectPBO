package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menuAdmin {
    JFrame log07175 = new JFrame();
    JButton btnbuku, btnpenerbit, btnpenulis, btntahunterbit, btnarsip, btnviewArsip, logout;
    
    public menuAdmin(){
        log07175.setSize(300, 300);
        log07175.setLayout(null);
        log07175.setLocationRelativeTo(null);
        log07175.getContentPane().setBackground(Color.WHITE);
        
        btnbuku = new JButton("Menu");
        btnbuku.setBounds(5 , 10 , 275 , 50);
        btnbuku.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnbuku);
        
        btnarsip = new JButton("Menu Arsip Buku");
        btnarsip.setBounds(5, 70 , 275 , 50);
        btnarsip.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnarsip);
        
        btnviewArsip = new JButton("Lihat Arsip Buku");
        btnviewArsip.setBounds(5, 130 , 275 , 50);
        btnviewArsip.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnviewArsip);
        
        logout = new JButton("Logout");
        logout.setBounds(5, 190 , 275 , 50);
        logout.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(logout);
        
        log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log07175.setVisible(true);
        log07175.setLocationRelativeTo(null);
        
        btnbuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu me = new menu();
                log07175.dispose();
            }
        });
        
        btnarsip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArsipBuku a = new ArsipBuku();
                log07175.dispose();
            }
        });
        
        
        btnviewArsip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewArsip v =new viewArsip();
                log07175.dispose();
            }
        });
        
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginAdmin lo = new loginAdmin();
                log07175.dispose();
            }
        });
    }
    public static void main(String[] args) {
        menuAdmin m = new menuAdmin();
        
    }
}
