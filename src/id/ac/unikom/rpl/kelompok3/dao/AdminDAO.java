/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.dao;

import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import java.util.ArrayList;

/**
 *
 * @author Nugraha
 */
public interface AdminDAO {
    
    Pegawai login(String username, String password);
    
    ArrayList<Pegawai> getPegawaiUser();
    
    ArrayList<Pegawai> cariPegawaiUser(String keyword);
    
    boolean ubahPegawai(Pegawai pegawai);
    
    
}
