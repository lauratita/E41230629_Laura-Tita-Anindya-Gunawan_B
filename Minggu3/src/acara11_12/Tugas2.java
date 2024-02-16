/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara11_12;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Neendy's
 */
public class Tugas2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
//        memasukkan jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = sc.nextInt();
        
//        membuat array dengan jumlah yanng dimasukkan oleh user
        int[] array = new int[jumlahElemen];
        
//        mengisi nilai array secara acak
        Random rand = new Random();
        for(int i = 0; i < jumlahElemen; i++){
            array[i] = rand.nextInt(225); // 225 batas nilai random
        }
        
        System.out.println("Deret array acak : ");
        for(int i = 0; i < jumlahElemen; i++){
            System.out.println(array[i]+ " ");
        }
    }
    
}
