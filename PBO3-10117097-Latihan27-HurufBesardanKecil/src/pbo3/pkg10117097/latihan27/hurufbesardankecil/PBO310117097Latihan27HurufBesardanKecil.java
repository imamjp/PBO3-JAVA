/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan27.hurufbesardankecil;

import java.util.Scanner;

/**
 * Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan huruf besar dan kecil
 * @author ASUS
 */
public class PBO310117097Latihan27HurufBesardanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        
        
        
        Scanner name = new Scanner(System.in);
        
        System.out.printf("Masukkan Kalimat :");
        kalimat = name.nextLine();
               
        String kalimat1 = kalimat.toUpperCase();
        String kalimat2 = kalimat1.toLowerCase();
                
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf Besar :"+kalimat1 );
        System.out.println("Huruf Kecil :"+kalimat2 );
      
    }
    
}
