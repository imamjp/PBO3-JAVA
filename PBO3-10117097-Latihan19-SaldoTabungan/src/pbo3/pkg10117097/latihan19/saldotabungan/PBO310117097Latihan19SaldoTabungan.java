/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan19.saldotabungan;

/**
 * Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan saldo tabungan
 * @author ASUS
 */
public class PBO310117097Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 0;
        
                       
       while (lama <= 5){
           lama = lama + 1;
           saldoAwal = saldoAwal *bunga + saldoAwal ;
           System.out.println("Saldo Bulan Ke- "+lama + " Rp. " + saldoAwal);
       
       }
    }
    
}
