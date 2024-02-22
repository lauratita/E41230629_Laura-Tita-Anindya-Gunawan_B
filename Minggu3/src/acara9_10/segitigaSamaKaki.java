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
public class segitigaSamaKaki {
    public static void main(String[] args){
        int tinggi;
        Scanner sc = new Scanner(System.in);
        
//        memasukkan nilai tinggi segitiga
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = sc.nextInt();
        
//        membuat baris ke bawah berjumlah sebanyak tinggi
        for(int i = 0; i <= tinggi; i++){
//            mencetak spasi untuk membuat pola segitiga sama kaki
            for(int j = 1; j <= tinggi-i; j++){
                System.out.print(" ");
            }
            
//            mencetak bintang untuk membentuk sisi kiri segitiga
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            
//            pindah ke baris baru setelah satu baris selesai dicetak
            System.out.println();
        }
    }
}
