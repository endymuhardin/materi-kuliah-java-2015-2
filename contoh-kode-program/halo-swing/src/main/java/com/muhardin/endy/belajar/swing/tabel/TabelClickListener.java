package com.muhardin.endy.belajar.swing.tabel;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class TabelClickListener implements ListSelectionListener {
    private JTable tabelMahasiswa;
    private List<Mahasiswa> data;

    public TabelClickListener(JTable t, List<Mahasiswa> d){
        tabelMahasiswa = t;
        data = d;
    }

    public void valueChanged(ListSelectionEvent e){
        Object eventSource = e.getSource();
        System.out.println("Event source class : "+eventSource.getClass().getName());

        System.out.println("Baris yang diklik : "+tabelMahasiswa.getSelectedRow());
        
        Mahasiswa m = data.get(tabelMahasiswa.getSelectedRow());

        System.out.println("NPM : "+m.getNpm());
        System.out.println("Nama : "+m.getNama());
        System.out.println("Email : "+m.getEmail());
    }
}


