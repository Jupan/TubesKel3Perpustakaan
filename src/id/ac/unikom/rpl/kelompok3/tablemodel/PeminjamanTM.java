/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.rpl.kelompok3.tablemodel;


import id.ac.unikom.rpl.kelompok3.entity.Peminjaman;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Robi Tanzil
 */
public class PeminjamanTM extends AbstractTableModel {

    private ArrayList<Peminjaman> arrayPeminjaman;

    public void setArrayPeminjaman(ArrayList<Peminjaman> arrayPeminjaman) {
        this.arrayPeminjaman = arrayPeminjaman;
    }

    @Override
    public int getRowCount() {
        return arrayPeminjaman.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        switch (columnIndex) {
            case 0:
                return arrayPeminjaman.get(rowIndex).getIdPinjam();
                
            case 1:
                String tglPinjam = formatter.format(arrayPeminjaman.get(rowIndex).getTglPinjam());
                return tglPinjam;
                
            case 2:
                return arrayPeminjaman.get(rowIndex).getJudul();
                
            case 3:
                return arrayPeminjaman.get(rowIndex).getNama();
                
            case 4:
                Date dateKembali = arrayPeminjaman.get(rowIndex).getTglKembali();
                String tglKembali = "Belum Kembali";
                if (dateKembali != null) {
                    tglKembali = formatter.format(arrayPeminjaman.get(rowIndex).getTglKembali());
                }
                return tglKembali;
                
            case 5:
                String lp = arrayPeminjaman.get(rowIndex).getLamaPinjam();
                String lamaPinjam = "" ;
                if (lp != null) {
                    lamaPinjam = arrayPeminjaman.get(rowIndex).getLamaPinjam();
                }
                return lamaPinjam;

                
            case 6:
                String d = arrayPeminjaman.get(rowIndex).getDenda();
                String denda = "Rp. - " ;
                if (d != null) {
                    denda = "Rp. " + arrayPeminjaman.get(rowIndex).getDenda() + " ,-";
                }
                return denda;
                    
            case 7:
                String tb = arrayPeminjaman.get(rowIndex).getDenda();
                String totalBayar = "Rp. - " ;
                if (tb != null) {
                    totalBayar = "Rp. " + arrayPeminjaman.get(rowIndex).getTotalBayar()+ " ,-";
                }
                return totalBayar;
            case 8:
                String p = arrayPeminjaman.get(rowIndex).getPetugas();
                String petugas = "" ;
                if (p != null) {
                    petugas = arrayPeminjaman.get(rowIndex).getPetugas();
                }
                return petugas;
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id Pinjam";
            case 1:
                return "Tanggal Pinjam";
            case 2:
                return "Judul Buku";
            case 3:
                return "Nama Anggota";
            case 4:
                return "Tanggal Kembali";
            case 5:
                return "Lama Pinjam";
            case 6:
                return "Denda";
            case 7:
                return "Total Bayar";
            case 8:
                return "Petugas";
            
        }
        return null;
    }

}
