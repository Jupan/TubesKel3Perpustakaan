/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.tablemodel;

import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nugraha
 */
public class AdminTM extends AbstractTableModel{
    
    private ArrayList<Pegawai> arrayPegawai;
    
    public void setArrayPegawai(ArrayList<Pegawai> arrayPegawai) {
        this.arrayPegawai = arrayPegawai;
    }

    @Override
    public int getRowCount() {
        return arrayPegawai.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        switch (columnIndex) {
            case 0:
                return arrayPegawai.get(rowIndex).getIdPegawai();
                
            case 1:
                return arrayPegawai.get(rowIndex).getNama();
                
            case 2:
                return arrayPegawai.get(rowIndex).getUsername();
                
            case 3:
                return arrayPegawai.get(rowIndex).getPassword();

        }
        
        return null;
        
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Pegawai";
                
            case 1:
                return "Nama";
                
            case 2:
                return "Username";
                
            case 3:
                return "Password";

        }
        return null;
    
    }
    
}
