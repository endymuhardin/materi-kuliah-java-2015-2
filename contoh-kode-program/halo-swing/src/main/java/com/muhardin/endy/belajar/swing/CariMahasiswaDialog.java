package com.muhardin.endy.belajar.swing;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class CariMahasiswaDialog extends JDialog {

    private TampilanUtama induk;

    public CariMahasiswaDialog(TampilanUtama t){
        induk = t;

        setLocationRelativeTo(induk);
        setTitle("Cari Mahasiswa");
        setSize(400,200);

        tambahKomponen();
        tambahEventHandler();
    }

    private JButton btnPilih;
    private JRadioButton rbEndy, rbAdi;
    private ButtonGroup bg;


    private void tambahKomponen(){
        btnPilih = new JButton("Pilih");
        rbEndy = new JRadioButton("Endy");
        rbAdi = new JRadioButton("Adi");

        bg = new ButtonGroup();

        bg.add(rbEndy);
        bg.add(rbAdi);

        setLayout(new FlowLayout());
        getContentPane().add(new JLabel("Nama "));
        getContentPane().add(rbEndy);
        getContentPane().add(rbAdi);
        getContentPane().add(btnPilih);
    }

    private void tambahEventHandler(){
        btnPilih.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(rbEndy.isSelected()){
                    induk.setMahasiswa(rbEndy.getText());
                }
                if(rbAdi.isSelected()){
                    induk.setMahasiswa(rbAdi.getText());
                }
                CariMahasiswaDialog.this.dispose();
            }
        });
    }
    
}
