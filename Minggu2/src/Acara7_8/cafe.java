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
public class cafe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nama;
        int menu;
        
        System.out.println("           CAFE CERIA           ");
        System.out.println("         ANEKA MINUMAN          ");
        System.out.println("--------------------------------");
        System.out.println("         SPESIAL MENU :         ");
        System.out.println("        1. Soft Drinks          ");
        System.out.println("        2. Mix Juice            ");
        System.out.println("        3. Nescafe              ");
        System.out.println("        4. Soda Milk            ");
        System.out.println("        5. Tea                  ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = sc.nextLine();
        System.out.println("");
        System.out.print("Silakan masukkan pilihan anda : ");
        menu = sc.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft Drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Menu tidak ada");
        }
        
//        System.out.print("Minuman yang anda pesan adalah " + menu);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
    }
}
