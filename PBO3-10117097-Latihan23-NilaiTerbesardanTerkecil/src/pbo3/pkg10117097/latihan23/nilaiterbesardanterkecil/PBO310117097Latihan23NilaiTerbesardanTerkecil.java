/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 **Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan nilai terbesar dan terkecil
 * @author ASUS
 */
public class PBO310117097Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int no;
        int min;
        int max;
        int banyakKmhs;
        int[] nilai = new int[1000];
        
        //scenner
        Scanner name = new Scanner(System.in);
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa"
                + "=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = name.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakKmhs = name.nextInt();
        
        for (no=1; no<= banyakKmhs; no++){
            System.out.print("Masukkan Nilai Mahasiswa ke- "+no+" : ");
            nilai[no] = name.nextInt();
        }
        max = 0;
        min = 1000;
        System.out.println("\n"+"============Hasil Nilai Mahasiswa===========");
        for (no=1; no <= nilai[no];no++){
            if(nilai[no]>max){
                max = nilai[no];
            }else if (nilai[no] < min){
                min= nilai[no];
                
            }
        System.out.println("Nilai Mahasiswa ke- "+no+" :"+nilai[no]+"\n");
        }
        System.out.println("\n"+"Nilai Terbesar Adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min+"\n");
        System.out.println("Petugas : "+namaPetugas+"\n");
    
    }
    
}
