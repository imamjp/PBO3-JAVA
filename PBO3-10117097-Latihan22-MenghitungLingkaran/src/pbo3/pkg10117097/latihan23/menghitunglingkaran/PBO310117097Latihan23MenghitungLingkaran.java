/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan23.menghitunglingkaran;

import java.util.Scanner;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menghitung lingkaran
 * @author ASUS
 */
public class PBO310117097Latihan23MenghitungLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double jari;
        double keliling;
        double luas;
        String n;
        double phi = 3.15;
        boolean ulang = true;
                
        
        Scanner scanner = new Scanner(System.in);
        
        while(ulang==true){
        
        System.out.println("=======Perhitungan Lingkaran========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        n = scanner.next();
        
        if(n.matches("[0-9]*")){
        double akhir =Double.parseDouble(n);
        
            jari = akhir / 2;
            luas = phi*(Math.pow(jari,2));
            keliling = 2 * phi * jari;
        
        
        System.out.println("=======Hasil Perhitungan Lingkaran========");
        System.out.println("Jari - Jari Lingkaran = " +jari+ "cm");
        System.out.println("Luas Lingkaran        =" +luas+"cm");
        System.out.println("Keliling Lingkaran    =" +keliling+ "cm");
        ulang = false;
        
        
        }else
        
            System.out.println("Nilai Diameter Tidak Sesuai");
        }
    }
    
}
