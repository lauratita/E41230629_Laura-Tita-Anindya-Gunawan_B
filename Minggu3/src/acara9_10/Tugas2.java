/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara9_10;

/**
 *
 * @author Neendy's
 */
public class Tugas2 {
    public static void main(String[] args){
        int angka = 1;
        System.out.println("         Do While          ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("=============================");
        
        do{
            System.out.print(angka + "  ");
            angka *= 2;
        }while (angka <= 100);
    }
}
