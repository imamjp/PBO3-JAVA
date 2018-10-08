/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM  : 10117097
 * Deskripsi: Menampilkan rata rata nilai mahasiswa
 * @author ASUS
 */
public class PBO310117097Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Mahasiswa mah = new Mahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Imam Jati Permana");

       
    }
    
}
