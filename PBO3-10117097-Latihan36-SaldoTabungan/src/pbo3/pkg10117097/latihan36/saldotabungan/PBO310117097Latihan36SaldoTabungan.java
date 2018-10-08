/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan36.saldotabungan;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM  : 10117097
 * Deskripsi: Menampilkan saldo tabungan
 * @author ASUS
 */
public class PBO310117097Latihan36SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
    }
    
    
}
