/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara9_10;
import java.util.Scanner;

/**
 *
 * @author Neendy's
 */
public class Tugas1 {
    public static void main(String[] args){
        int awal;
        int akhir;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Mengurutkan nilai genap dari yang terkecil");
        System.out.print("Masukkan nilai awal : ");
        awal = sc.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        akhir = sc.nextInt();
        System.out.println("Nilai genap antara " + awal + " dan " + akhir);
        
        for(int i = awal; i <= akhir; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
