/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan26.waktusaatini;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 ***Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Menampilkan waktu
 * @author ASUS
 */
public class DateDemo {
    public static void main(String[] args) {
        
    
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd  hh:mm:ss a zzz");

      System.out.println("Hari ini Adalah Hari: " + ft.format(dNow));
}
}