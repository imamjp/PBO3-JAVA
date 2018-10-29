/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan61.bangunruang;

/**
 *NIM       : 10117097
 *Nama      : Imam Jati Permana
 *Kelas     : IF - 3 
 * @author ASUS
 */
public class Bola extends BangunRuang {
    private double r;
    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double hitungVolume() {
        this.volume = (4/3) * 3.14 * (r * r * r);
        return this.volume;
    }
}
