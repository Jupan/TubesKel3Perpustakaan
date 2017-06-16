/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.dao;


import id.ac.unikom.rpl.kelompok3.entity.Anggota;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Robi Tanzil
 */
public interface AnggotaDAO {
    
    ArrayList<Anggota> getAnggota();
    
    ArrayList<Anggota> cariAnggota(String keyword);
    
    boolean tambahAnggota(Anggota anggota, Calendar tglLahir);
    
    boolean hapusAnggota(int idAnggota);
    
    boolean ubahAnggota(Anggota anggota, Calendar tglLahir);
    
}
