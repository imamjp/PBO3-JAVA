/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan54.koordinat;

/**
 *NIM       : 10117097
 *Nama      : Imam Jati Permana
 *Kelas     : IF - 3 
 * @author ASUS
 */
public class PBO310117097Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat : "+warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warnaKoordinat.getX()+", y : "+warnaKoordinat.getY());
    }
    
}
