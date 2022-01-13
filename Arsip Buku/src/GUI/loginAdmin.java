package GUI;

import Controller.AdminController;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginAdmin {
    JFrame log = new JFrame();
    JLabel login07175, judul07175;
    JTextField textusername07175, textnama07175;
    JLabel labelusername07175, labelnama07175, labelpass07175;
    JButton daftarbutton07175, loginbutton07175, loginmurid07175;
    JPasswordField passlogin07175;
    private AdminController adminC = new AdminController();
    
    public loginAdmin(){
            log.setSize(320,480);
            log.setLayout(null);
            log.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("SELAMAT DATANG");
            judul07175.setBounds(60, 10, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 20));
            log.add(judul07175);

            login07175 = new JLabel("Login Admin");
            login07175.setBounds(110, 50, 100, 100);
            login07175.setFont(new Font("poppins", Font.BOLD, 15));
            log.add(login07175);

            labelusername07175 = new JLabel("Username : ");
            labelusername07175.setBounds(55, 150, 70, 30);
            log.add(labelusername07175);

            textusername07175 = new JTextField();
            textusername07175.setBounds(55, 180, 200, 30);
            log.add(textusername07175);

            labelpass07175 = new JLabel("Password : ");
            labelpass07175.setBounds(55, 220, 100, 30);
            log.add(labelpass07175);

            passlogin07175 = new JPasswordField();
            passlogin07175.setBounds(55, 250, 200, 30);
            log.add(passlogin07175);

            loginbutton07175 = new JButton("Login");
            loginbutton07175.setBounds(100, 310, 100, 40);
            loginbutton07175.setBackground(Color.gray);
            loginbutton07175.setForeground(Color.white);
            log.add(loginbutton07175);
            
            daftarbutton07175 = new JButton("Daftar Murid");
            daftarbutton07175.setBounds(75, 360, 150, 40);
            daftarbutton07175.setBackground(Color.gray);
            daftarbutton07175.setForeground(Color.white);
            log.add(daftarbutton07175);

            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log.setVisible(true);
            log.setLocationRelativeTo(null);        
            loginbutton07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                        if (adminC.login(textusername07175.getText(), passlogin07175.getText()) == false){
                            JOptionPane.showMessageDialog(null, "Username Atau Password Salah", 
                                "information", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                           JOptionPane.showMessageDialog(null, "Login Berhasil", 
                                "information", JOptionPane.INFORMATION_MESSAGE);
                           menuAdmin ma = new menuAdmin();
                           log.dispose();
                        }      
                }
            });
            
            daftarbutton07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                       
                        daftarArdmin daftar = new daftarArdmin();
                           log.dispose();
                              
                }
            });
    }
    public static void main(String[] args) {
        loginAdmin l = new loginAdmin();
    }
}
