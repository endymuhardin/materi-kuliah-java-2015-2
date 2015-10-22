package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TampilanUtama extends JFrame {

    public static void main(String[] xx){
    
        TampilanUtama t = new TampilanUtama();
        t.setLocationRelativeTo(null);
        t.setVisible(true);

    }

    public TampilanUtama(){
    
        tampilkanLoginDialog();
        setTitle("Aplikasi Saya");
        setLayout(new FlowLayout());
        pasangKomponen();
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }

    private void tampilkanLoginDialog(){
    
        LoginDialog ld = new LoginDialog(this);
        ld.setVisible(true);

    }

    private void pasangKomponen(){
        btnCari = new JButton("Cari");
        txtMahasiswa = new JTextField(15);

        getContentPane().add(new JLabel("Mahasiswa"));
        getContentPane().add(txtMahasiswa);
        getContentPane().add(btnCari);
    }

    private JButton btnCari;
    private JTextField txtMahasiswa;
}
