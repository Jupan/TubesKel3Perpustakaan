/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.dao;


import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Nugraha
 */
public interface PegawaiDAO {
    
    ArrayList<Pegawai> getPegawai();
    
    ArrayList<Pegawai> cariPegawai(String keyword);
    
    boolean tambahPegawai(Pegawai pegawai, Calendar tglLahir);
    
    boolean hapusPegawai(int idPegawai);
    
    boolean ubahPegawai(Pegawai pegawai,Calendar tglLahir);
    
}
