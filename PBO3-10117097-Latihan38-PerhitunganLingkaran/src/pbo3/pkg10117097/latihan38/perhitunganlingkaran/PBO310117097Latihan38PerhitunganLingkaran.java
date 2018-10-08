/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan38.perhitunganlingkaran;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM  : 10117097
 * Deskripsi: Menampilkan perhitungan lingkaran
 * @author ASUS
 */
public class PBO310117097Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    
    }
    
}
