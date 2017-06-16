/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.ac.unikom.rpl.kelompok3.dao;


import id.ac.unikom.rpl.kelompok3.entity.Buku;
import java.util.ArrayList;

/**
 *
 * @author Nugraha
 */
public interface BukuDAO {
    
    ArrayList<Buku> getBuku();
    
    ArrayList<Buku> cariBuku(String keyword);
    
    boolean tambahBuku(Buku buku);
    
    boolean hapusBuku(int idBuku);
    
    boolean ubahBuku(Buku buku);
    
}
