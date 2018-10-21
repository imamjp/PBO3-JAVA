/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *Nama      : Imam Jati Permana
 *Nim       : 10117097
 *Kelas     : IF -3
 *Deklarasi : Menampilkan perhitungan nilai mahasiswa
 * @author ASUS
 */
public class PBO310117097Latihan47NilaiMahasiswa {
    private static double quiz,uts,uas,NA;
    private static String index;
    private static String keterangan;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
      
       Scanner baca = new Scanner(System.in);
       Mahasiswa objMahasiswa = new Mahasiswa();
       
       System.out.print("QUIZ : ");
       quiz = baca.nextDouble();
       System.out.print("UTS  : ");
       uts = baca.nextDouble();
       System.out.print("UAS  : ");
       uas = baca.nextDouble();
       System.out.println("");
       System.out.print("Nilai Akhir : " + objMahasiswa.NA(quiz, uts, uas));
       System.out.println("");
       System.out.println("");
       System.out.println("Index : " + objMahasiswa.aturanIndex(index));
       objMahasiswa.aturanKeterangan(keterangan);
       
      
    
    }
    
}
