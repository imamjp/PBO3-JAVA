/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM  : 10117097
 * Deskripsi: Menampilkan nilai terbesar dan terkecil
 * @author ASUS
 */
public class PBO310117097Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa mhs1 = new Mahasiswa();
        Scanner keyboard = new Scanner(System.in);
        
        int bykMah;
        String nama;
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = keyboard.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);
        
        System.out.println("\n"+"Petugas : " + nama);

        
    }
    
    
}
