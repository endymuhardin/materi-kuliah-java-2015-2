package com.muhardin.endy.belajar.swing.tabel;

import java.util.*;
import javax.swing.table.*;

public class TabelMahasiswaModel extends AbstractTableModel {
    
    private List<Mahasiswa> dataMahasiswa;

    public TabelMahasiswaModel(List<Mahasiswa> m){
        dataMahasiswa = m;
    }

    public int getRowCount(){
        return dataMahasiswa.size();
    }

    public int getColumnCount(){
        return 3;
    }

    public Object getValueAt(int row, int column){
        Mahasiswa m = dataMahasiswa.get(row);

        switch(column){
            case 0: return m.getNpm();
            case 1: return m.getNama();
            case 2: return m.getEmail();
            default: return null;
        }
    }

    public String getColumnName(int column){
        
        switch(column){
            case 0: return "NPM";
            case 1: return "Nama";
            case 2: return "Email";
            default: return null;
        }
    }
}
