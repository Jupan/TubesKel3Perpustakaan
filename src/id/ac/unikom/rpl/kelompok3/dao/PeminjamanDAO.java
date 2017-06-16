/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.dao;


import id.ac.unikom.rpl.kelompok3.entity.Peminjaman;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Robi Tanzil
 */
public interface PeminjamanDAO {
    
    ArrayList<Peminjaman> getPeminjaman();
    
    ArrayList<Peminjaman> getCariPengembalian();
    
    ArrayList<Peminjaman> cariPeminjaman(String keyword);
    
    boolean pinjam(int idAnggota, int idBuku, Calendar tglPinjam);
    
    boolean kembali(Peminjaman peminjaman, Calendar tglKembali, int idPegawai);

    
}
