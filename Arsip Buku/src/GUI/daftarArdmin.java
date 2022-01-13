package GUI;

import Controller.AdminController;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class daftarArdmin {
    JFrame log07175 = new JFrame();
    JLabel daftar07175, judul07175;
    JTextField textusername07175, textnama07175, textnotelp07175, textalamat;
    JLabel labelusername07175, labelnama07175, labelpass07175, labelnotelp07175, labelalamat;
    JButton daftarbutton07175, kembali07175;
    JPasswordField pass07175;
    private AdminController admin = new AdminController();
    
    public daftarArdmin(){
            log07175.setSize(320,530);
            log07175.setLayout(null);
            log07175.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("SILAHKAN MASUKAN DATA");
            judul07175.setBounds(55, 50, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 15));
            log07175.add(judul07175);

            labelusername07175 = new JLabel("Username : ");
            labelusername07175.setBounds(55, 100, 70, 30);
            log07175.add(labelusername07175);

            textusername07175 = new JTextField();
            textusername07175.setBounds(55, 130, 200, 30);
            log07175.add(textusername07175);
            
            labelnama07175 = new JLabel("Nama : ");
            labelnama07175.setBounds(55, 160, 70, 30);
            log07175.add(labelnama07175);

            textnama07175 = new JTextField();
            textnama07175.setBounds(55, 190, 200, 30);
            log07175.add(textnama07175);

            labelpass07175 = new JLabel("Password : ");
            labelpass07175.setBounds(55, 220, 100, 30);
            log07175.add(labelpass07175);

            pass07175 = new JPasswordField();
            pass07175.setBounds(55, 250, 200, 30);
            log07175.add(pass07175);
            
            labelalamat = new JLabel("Alamat : ");
            labelalamat.setBounds(55, 280, 130, 30);
            log07175.add(labelalamat);
            
            textalamat = new JTextField();
            textalamat.setBounds(55, 310, 200, 30);
            log07175.add(textalamat);
            
            labelnotelp07175 = new JLabel("No Telepon : ");
            labelnotelp07175.setBounds(55, 340, 130, 30);
            log07175.add(labelnotelp07175);
            
            textnotelp07175 = new JTextField();
            textnotelp07175.setBounds(55, 370, 200, 30);
            log07175.add(textnotelp07175);

            daftarbutton07175 = new JButton("Daftar");
            daftarbutton07175.setBounds(100, 410, 100, 40);
            daftarbutton07175.setBackground(Color.gray);
            daftarbutton07175.setForeground(Color.white);
            log07175.add(daftarbutton07175);
            
            kembali07175 = new JButton("Kembali");
            kembali07175.setBounds(10, 460, 80, 25);
            kembali07175.setBackground(Color.gray);
            kembali07175.setForeground(Color.white);
            log07175.add(kembali07175);

            log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log07175.setVisible(true);
            log07175.setLocationRelativeTo(null);        
            daftarbutton07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    admin.daftarAdmin(String.format(textusername07175.getText()), String.format(textnama07175.getText()), String.format(pass07175.getText()), String.format(textalamat.getText()), String.format(textnotelp07175.getText()));
                    kosong(); 
                    JOptionPane.showMessageDialog(null, "Daftar Berhasil", 
                            "information", JOptionPane.INFORMATION_MESSAGE); 
                    loginAdmin lo = new loginAdmin();
                    log07175.dispose();
                }
            });
            
            kembali07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    loginAdmin lo = new loginAdmin();
                    log07175.dispose();
                }
            });
        }
    public void kosong(){
        textusername07175.setText(null);
        textnama07175.setText(null);
        pass07175.setText(null);
        textalamat.setText(null);
        textnotelp07175.setText(null);
    }
}
