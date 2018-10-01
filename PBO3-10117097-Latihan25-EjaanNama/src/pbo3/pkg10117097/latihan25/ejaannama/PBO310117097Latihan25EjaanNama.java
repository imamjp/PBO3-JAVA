/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan25.ejaannama;

import java.util.Scanner;

/**
 **Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan pengejaan nama
 * @author ASUS
 */
public class PBO310117097Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Depan Kamu Untuk Di Ejaa : ");
        nama = keyboard.next();
        
        int len = nama.length();
        char[] arrChar = new char[len];

        for (int no=0; no< len-1; no++){
        arrChar[no] = nama.charAt(no);
        System.out.println("Huruf ke- "+(no+1)+" : "+ arrChar[no]);
        }
 
    }
    
}
