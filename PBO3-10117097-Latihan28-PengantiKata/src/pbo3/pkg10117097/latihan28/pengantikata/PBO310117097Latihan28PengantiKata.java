/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan28.pengantikata;

import java.util.Scanner;

/**
 * ***Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Mengganti kata
 * @author ASUS
 */
public class PBO310117097Latihan28PengantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scn.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scn.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scn.next();
        
        
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
       
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
        
    }
    
}
