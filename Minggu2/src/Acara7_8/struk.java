/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara7_8;

import java.util.Scanner;

/**
 *
 * @author Neendy's
 */
public class struk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama;
    
        System.out.println("------------------------------------------------");
        System.out.println("           Kharisma Agung Plaze (KAP)           ");
        System.out.println("            Promo Belanja Berhadiah             ");
        System.out.println("       Khusus Pembelian 5 Barang Pertama        ");
        System.out.println("        Dengan harga minimum Rp 100000,00       ");
        System.out.println("------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        nama = sc.nextLine();
        System.out.println("");
        System.out.print("Masukkan harga barang ke-1 : ");
        int barang1 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-2 : ");
        int barang2 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-3 : ");
        int barang3 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-4 : ");
        int barang4 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-5 : ");
        int barang5 = sc.nextInt();
        int total = barang1+barang2+barang3+barang4+barang5;
        System.out.println("Total harga pembelian atas nama "+ nama + " adalah Rp " + total);
        
        System.out.println("");
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        
        System.out.println("------------------------------------------------");
        System.out.println("                 Terima Kasih                   ");
        System.out.println("   Anda sudah belanja di Kharisma Agung Plaza   ");
        
        
    }
}
