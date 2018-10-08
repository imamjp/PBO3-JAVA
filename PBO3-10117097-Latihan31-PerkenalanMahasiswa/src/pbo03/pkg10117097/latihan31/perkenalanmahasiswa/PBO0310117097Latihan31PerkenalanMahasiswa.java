/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo03.pkg10117097.latihan31.perkenalanmahasiswa;

/**
 * Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM  : 10117097
 * Deskripsi: Menampilkan Text perkenalan mahasiswa
 * @author ASUS
 */
public class PBO0310117097Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10110272");
        mhs4.setNama("Muhammad Nur Awaluddin");
        mhs4.perkenalkanDiri();
    }
    
}
