/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan62.livingthing;

/**
 *NIM       : 10117097
 *Nama      : Imam Jati Permana
 *Kelas     : IF - 3 
 * @author ASUS
 */
public class PBO310117097Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human a = new Human();
        a.setNama("Imam Jati Permana");
        a.walk(a.getNama());
        a.breath(a.getNama());
        a.eat(a.getNama());
    }
    
}
