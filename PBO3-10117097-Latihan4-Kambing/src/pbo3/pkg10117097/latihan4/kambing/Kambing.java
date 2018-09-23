/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan4.kambing;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan jumlah kambing
 * @author ASUS
 */
public class Kambing {
    public void tambahKambing() {
        //deklarasi variabel lokal
        int jumlahKambing = 0;
    
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
        
 
    }
    
    public static void main(String[] args){
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}
