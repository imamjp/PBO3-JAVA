/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan44.hukumohm;

/**
 *Nama      : Imam Jati Permana
 *Nim       : 10117097
 *Kelas     : IF -3
 *Deklarasi : Menampilkan hukum ohm
 * @author ASUS
 */
public class PBO310117097Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai objB = new Baterai();
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial pada ujung ujung"
                + "kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");
        
        objB.getKuatArus();
        objB.getHambatan();
        System.out.println("Hasil Tegangan : "+objB.hitungTegangan()+" volt ");

    
    }
    
}
