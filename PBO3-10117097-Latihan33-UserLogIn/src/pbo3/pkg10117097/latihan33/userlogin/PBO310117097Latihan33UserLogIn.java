/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan33.userlogin;

import java.util.Scanner;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM  : 10117097
 * Deskripsi: Membuat user login
 * @author ASUS
 */
public class PBO310117097Latihan33UserLogIn {

    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);

    }
}
