/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara5_6;

import java.util.Scanner;

/**
 *
 * @author Neendy's
 */
public class scanner {
    public static void main(String[] args){
//        membuat scannner
        Scanner s1 = new Scanner(System.in);
        
//        ambil nilai dari keyboard
        System.out.print("Masukkan nilai 1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        int nilai2 = s1.nextInt();
        
//        hitung dan print
        int jumlah = nilai1+nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
