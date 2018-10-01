/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117097.latihan30.cakep;

import java.util.Scanner;

/**
 *Nama : Imam Jati Permana
 * Kelas : IF - 3
 * NIM : 10117097
 * Deklarasi : Program menampilkan cakep yoi
 * @author ASUS
 */
public class PBO310117097Latihan30Cakep {
    
    
  //    kode text color
    public static final String IJP_RESET = "\u001B[0m";
    public static final String IJP_BLACK = "\u001B[30m";
    public static final String IJP_RED = "\u001B[31m";
    public static final String IJP_GREEN = "\u001B[32m";
    public static final String IJP_YELLOW = "\u001B[33m";
    public static final String IJP_BLUE = "\u001B[34m";
    public static final String IJP_PURPLE = "\u001B[35m";
    public static final String IJP_CYAN = "\u001B[36m";
    public static final String IJP_WHITE = "\u001B[37m";
//    kode background color
    public static final String IJP_BLACK_BACKGROUND = "\u001B[40m";
    public static final String IJP_RED_BACKGROUND = "\u001B[41m";
    public static final String IJP_GREEN_BACKGROUND = "\u001B[42m";
    public static final String IJP_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String IJP_BLUE_BACKGROUND = "\u001B[44m";
    public static final String IJP_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String IJP_CYAN_BACKGROUND = "\u001B[46m";
    public static final String IJP_WHITE_BACKGROUND = "\u001B[47m";
    
//    Method Utama
    public static void main(String[] args) {
        String jawab;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(IJP_RED+"Kamu "+IJP_RESET);
        System.out.print(IJP_GREEN+"ngerjain sendiri "+IJP_RESET);
        System.out.print(IJP_YELLOW+"latihan 17 sampe "+IJP_RESET);
        System.out.print(IJP_BLUE+"latihan 30 ini? \n"+IJP_RESET);
        System.out.print(IJP_BLUE+"Jawab "+IJP_RESET);
        System.out.print(IJP_RED+"(Yoi/Enggak) : "+IJP_RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(IJP_RED+"\nCakep Bener. "+IJP_RESET);
            System.out.print(IJP_PURPLE+"Good Job \n"+IJP_RESET);
        }else{
            System.out.print(IJP_RED+"\nTetep cakep sih. "+IJP_RESET);
            System.out.print(IJP_CYAN+"\nSing penting paham konsep nya yee. "
                    +IJP_RESET);
            System.out.print(IJP_BLACK+"\nKeep the code works dude."+IJP_RESET);  
        }
    }
    
}
