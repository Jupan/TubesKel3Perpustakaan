/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.tablemodel;

import id.ac.unikom.rpl.kelompok3.entity.Anggota;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nugraha
 */
public class AnggotaTM extends AbstractTableModel {

    private ArrayList<Anggota> arrayAnggota;

    public void setArrayAnggota(ArrayList<Anggota> arrayBuku) {
        this.arrayAnggota = arrayBuku;
    }
    
    @Override
    public int getRowCount() {
        return arrayAnggota.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return arrayAnggota.get(rowIndex).getIdAnggota();
            
            case 1:
                return arrayAnggota.get(rowIndex).getNama();
                
            case 2:
                return arrayAnggota.get(rowIndex).getAlamat();
                
            case 3:
                return arrayAnggota.get(rowIndex).getNoTlp();
                
            case 4:
                return arrayAnggota.get(rowIndex).getTanggalLahir();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Anggota";
            
            case 1:
                return "Nama";
               
            case 2:
                return "Alamat";
                
            case 3:
                return "No Telepon";
                
            case 4:
                return "Tanggal Lahir";
        }
        return null;
    }
}
