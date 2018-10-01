/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan17.gajikaryawan;

import java.util.Scanner;

/**
 * Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menghitung Tunjangan 
 * @author ASUS
 */
public class PBO310117097Latihan17GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        double tunjangan;
        double totalAkhir ;
        String status=null;
         
       
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========Program Tunjangan=========");
        System.out.print("Berapa Gaji Pokok Anda perbulan : Rp. ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Satus Anda(Menikah/Single) ? ");
        status = scanner.next();
        
        
        if("Menikah".equals(status)){
          tunjangan = gajiPokok * 0.35;
        }else tunjangan = 0;
            
        totalAkhir= tunjangan + gajiPokok;
        
        System.out.println("========Hasil Perhitungan Gaji anda======");
        System.out.println("Gaji Pokok\t\t: Rp. "+gajiPokok);
        System.out.println("Tunjangan\t\t: Rp. "+tunjangan);
        System.out.println("Total Gaji\t\t: Rp. "+totalAkhir);
    }
    
}
