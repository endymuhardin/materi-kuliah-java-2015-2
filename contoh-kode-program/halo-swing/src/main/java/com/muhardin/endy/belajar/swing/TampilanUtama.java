package com.muhardin.endy.belajar.swing;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
        pasangEventHandler();
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }

    private void tampilkanLoginDialog(){
    
        LoginDialog ld = new LoginDialog(this);
        ld.setVisible(true);

    }

    public void setUserAktif(String u){
        System.out.println("User aktif : "+u);
        userYangSedangLogin = u;
    }

    private void pasangKomponen(){
        btnCari = new JButton("Cari");
        txtMahasiswa = new JTextField(15);
        txtMahasiswa.setEditable(false);

        getContentPane().add(new JLabel("Mahasiswa"));
        getContentPane().add(txtMahasiswa);
        getContentPane().add(btnCari);
    }
    
    private void pasangEventHandler(){
        btnCari.addActionListener(new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
                CariMahasiswaDialog cd = new
                CariMahasiswaDialog(TampilanUtama.this);
                cd.setVisible(true);
            }
        
        });
    }

    public void setMahasiswa(String m){
        txtMahasiswa.setText(m);
    }

    private JButton btnCari;
    private JTextField txtMahasiswa;
    private String userYangSedangLogin;
}
