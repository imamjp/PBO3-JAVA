/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan20.targetsaldotabungan;

/**
 ** Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan target saldo tabungan
 * @author ASUS
 */
public class PBO310117097Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double SaldoAwal = 3500000 ;
        double Bunga = 0.08;
        double target = 6000000;
        int i = 1;
        
        do{   
            
        SaldoAwal = (SaldoAwal * Bunga) + SaldoAwal;  
        System.out.println("Saldo di bulan ke-"+i + " Rp."+SaldoAwal);
        i++; 
        } while(SaldoAwal <= target );
       
    }
    
}
