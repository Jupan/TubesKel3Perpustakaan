/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unikom.rpl.kelompok3.Main;


import id.ac.unikom.rpl.kelompok3.dao.PeminjamanDAO;
import id.ac.unikom.rpl.kelompok3.daoimpl.PeminjamanDAOImpl;
import id.ac.unikom.rpl.kelompok3.entity.Pegawai;
import id.ac.unikom.rpl.kelompok3.entity.Peminjaman;
import id.ac.unikom.rpl.kelompok3.tablemodel.PeminjamanTM;
import id.ac.unikom.rpl.kelompok3.utility.DatabaseConnectivity;
import java.text.*;
import java.awt.print.*;
import java.io.File;
import java.sql.Connection;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperPrint;
/**
 *
 * @author Nugraha
 */
public class FormUtama extends javax.swing.JFrame {
    private Connection conn;

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        setLocationRelativeTo(null);
        getData();
    
    }
    
    
    private Pegawai pegawai;
    private PeminjamanDAO dao;
    private ArrayList<Peminjaman> arrayPeminjaman;

    private void getData() {

        dao = new PeminjamanDAOImpl();
        arrayPeminjaman = dao.getPeminjaman();

        PeminjamanTM tm = new PeminjamanTM();
        tm.setArrayPeminjaman(arrayPeminjaman);

        tablePeminjaman.setModel(tm);
    }
    
    private void getDataPengembalian() {

        dao = new PeminjamanDAOImpl();
        arrayPeminjaman = dao.getCariPengembalian();

        PeminjamanTM tm = new PeminjamanTM();
        tm.setArrayPeminjaman(arrayPeminjaman);

        tablePeminjaman.setModel(tm);
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePeminjaman = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        fieldCari = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        buttonCekPengembalian = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        buttonPeminjaman = new javax.swing.JButton();
        buttonDataBuku = new javax.swing.JButton();
        buttonDataPegawai = new javax.swing.JButton();
        buttonDataAnggota = new javax.swing.JButton();
        buttonPengembalian = new javax.swing.JButton();
        buttonAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonKeluar = new javax.swing.JButton();
        buttonCetak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 472));
        jPanel1.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tablePeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablePeminjaman);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cari Peminjaman");

        fieldCari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCariActionPerformed(evt);
            }
        });

        buttonCari.setBackground(new java.awt.Color(255, 255, 255));
        buttonCari.setText("Cari ID");
        buttonCari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCari.setBorderPainted(false);
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        buttonRefresh.setBackground(new java.awt.Color(255, 255, 255));
        buttonRefresh.setText("Refresh");
        buttonRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonRefresh.setBorderPainted(false);
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        buttonCekPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        buttonCekPengembalian.setText("Laporan pengembalian");
        buttonCekPengembalian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCekPengembalian.setBorderPainted(false);
        buttonCekPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekPengembalianActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("      LIST LAPORAN");

        buttonPrint.setBackground(new java.awt.Color(255, 255, 255));
        buttonPrint.setText("Print Laporan");
        buttonPrint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPrint.setBorderPainted(false);
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("MENU UTAMA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(65, 65, 65)
                                .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCekPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCekPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(380, 120, 920, 310);

        buttonPeminjaman.setBackground(new java.awt.Color(255, 255, 255));
        buttonPeminjaman.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonPeminjaman.setText("Peminjaman");
        buttonPeminjaman.setBorder(null);
        buttonPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPeminjamanActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPeminjaman);
        buttonPeminjaman.setBounds(110, 270, 210, 50);

        buttonDataBuku.setBackground(new java.awt.Color(255, 255, 255));
        buttonDataBuku.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDataBuku.setText("Data Buku");
        buttonDataBuku.setBorder(null);
        buttonDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataBukuActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDataBuku);
        buttonDataBuku.setBounds(110, 90, 210, 50);

        buttonDataPegawai.setBackground(new java.awt.Color(255, 255, 255));
        buttonDataPegawai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDataPegawai.setText("Data Pegawai");
        buttonDataPegawai.setBorder(null);
        buttonDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDataPegawai);
        buttonDataPegawai.setBounds(110, 150, 210, 50);

        buttonDataAnggota.setBackground(new java.awt.Color(255, 255, 255));
        buttonDataAnggota.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDataAnggota.setText("Data Anggota");
        buttonDataAnggota.setBorder(null);
        buttonDataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataAnggotaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonDataAnggota);
        buttonDataAnggota.setBounds(110, 210, 210, 50);

        buttonPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        buttonPengembalian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonPengembalian.setText("Pengembalian");
        buttonPengembalian.setBorder(null);
        buttonPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPengembalianActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPengembalian);
        buttonPengembalian.setBounds(110, 330, 210, 50);

        buttonAdmin.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonAdmin.setText("User");
        buttonAdmin.setBorder(null);
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdmin);
        buttonAdmin.setBounds(110, 390, 210, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 0, 1340, 490);

        buttonKeluar.setBackground(new java.awt.Color(255, 255, 255));
        buttonKeluar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonKeluar.setText("Log out");
        buttonKeluar.setBorder(null);
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonKeluar);
        buttonKeluar.setBounds(1200, 440, 77, 38);

        buttonCetak.setBackground(new java.awt.Color(255, 255, 255));
        buttonCetak.setText("Cetak");
        buttonCetak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCetak.setBorderPainted(false);
        buttonCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCetakActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCetak);
        buttonCetak.setBounds(1280, 460, 0, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataPegawaiActionPerformed
       FormPegawai fp = new FormPegawai(null, true);
       fp.setLocationRelativeTo(null);
       fp.setVisible(true);
    }//GEN-LAST:event_buttonDataPegawaiActionPerformed

    private void buttonDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataBukuActionPerformed
        FormBuku fb = new FormBuku(null, true);
        fb.setLocationRelativeTo(null);
        fb.setVisible(true);
    }//GEN-LAST:event_buttonDataBukuActionPerformed

    private void buttonPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPeminjamanActionPerformed
        FormPeminjaman fpm = new FormPeminjaman(null, true);
        fpm.setLocationRelativeTo(null);
        fpm.setVisible(true);
        getData();
    }//GEN-LAST:event_buttonPeminjamanActionPerformed

    private void buttonDataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataAnggotaActionPerformed
       FormAnggota fa = new FormAnggota(null, true);
        fa.setLocationRelativeTo(null);
        fa.setVisible(true);
    }//GEN-LAST:event_buttonDataAnggotaActionPerformed

    private void buttonPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPengembalianActionPerformed
        
        int baris = tablePeminjaman.getSelectedRow();
        if (baris >= 0) {

            Peminjaman peminjamanPilih = arrayPeminjaman.get(baris);

            FormPengembalian fpn = new FormPengembalian(this, true, peminjamanPilih);
            setLocationRelativeTo(null);
            fpn.setVisible(true);
            getData();
                    
        } else {
            JOptionPane.showMessageDialog(this, "Pilih peminjaman yang akan dikembalikan");
        }
    }//GEN-LAST:event_buttonPengembalianActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
       
        String keyword = fieldCari.getText();

        // lakukan proses pencarian
        dao = new PeminjamanDAOImpl();
        arrayPeminjaman = dao.cariPeminjaman(keyword);

        PeminjamanTM tm = new PeminjamanTM();
        tm.setArrayPeminjaman(arrayPeminjaman);

        tablePeminjaman.setModel(tm);
    }//GEN-LAST:event_buttonCariActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
       getData();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
       FormAdmin fa = new FormAdmin(null, true);
       fa.setLocationRelativeTo(null);
       fa.setVisible(true);
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
       JOptionPane.showMessageDialog(this, "Anda Keluar!");
       dispose();
       FormLogin fl = new FormLogin(null, true);
       fl.setLocationRelativeTo(null);
       fl.setVisible(true);
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void fieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCariActionPerformed

    private void buttonCekPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCekPengembalianActionPerformed
        getDataPengembalian();
    }//GEN-LAST:event_buttonCekPengembalianActionPerformed

    private void buttonCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCetakActionPerformed
        // TODO add your handling code here:
        try {
            String path1 = "E:\\KULIAH\\Semester - 4\\Prolan-7\\TubesRplKel3\\src\\laporan1.jrxml";            
            File report = new File (path1);
            JasperDesign JasDes = JRXmlLoader.load(report);
            JasperReport JasRep = JasperCompileManager.compileReport(JasDes);
            JasperPrint JasPrint = JasperFillManager.fillReport(JasRep, null, conn);
            JasperViewer.viewReport(JasPrint);
            JasperViewer jasperViewer = new JasperViewer(JasPrint,false);
            jasperViewer.setTitle("Database Report");
            jasperViewer.setVisible(true);
        }
        catch (JRException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_buttonCetakActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
       MessageFormat header = new MessageFormat("Laporan Pengembalian");
       
       MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
        try {
            
            tablePeminjaman.print(JTable.PrintMode.NORMAL, header, footer);
            
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s %n",e.getMessage());
        }
    }//GEN-LAST:event_buttonPrintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonCekPengembalian;
    private javax.swing.JButton buttonCetak;
    private javax.swing.JButton buttonDataAnggota;
    private javax.swing.JButton buttonDataBuku;
    private javax.swing.JButton buttonDataPegawai;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonPeminjaman;
    private javax.swing.JButton buttonPengembalian;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePeminjaman;
    // End of variables declaration//GEN-END:variables
}
