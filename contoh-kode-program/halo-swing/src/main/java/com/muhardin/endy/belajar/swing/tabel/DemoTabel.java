package com.muhardin.endy.belajar.swing.tabel;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class DemoTabel {
    public static void main(String[] x){
        JFrame fr = new JFrame();
        fr.setTitle("Demo Tabel");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(800,600);
        fr.setLocationRelativeTo(null);

        pasangKomponen(fr);

        fr.setVisible(true);
    }

    private static void pasangKomponen(JFrame fr){
        List<Mahasiswa> data = new ArrayList<>();

        Mahasiswa m1 = new Mahasiswa();
        m1.setNpm("123");
        m1.setNama("Endy");
        m1.setEmail("endy.muhardin@gmail.com");
        data.add(m1);

        Mahasiswa m2 = new Mahasiswa();
        m2.setNpm("456");
        m2.setNama("Adi");
        m2.setEmail("adi@artivisi.com");
        data.add(m2);

        TabelMahasiswaModel tm = new TabelMahasiswaModel(data);
        JTable tbl = new JTable(tm);

        TabelClickListener tcl = new TabelClickListener(tbl,data);
        tbl.getSelectionModel().addListSelectionListener(tcl);

        fr.getContentPane().add(new JScrollPane(tbl));
    }
}
