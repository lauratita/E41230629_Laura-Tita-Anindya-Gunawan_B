/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara11_12;

/**
 *
 * @author Neendy's
 */
public class arrayDuaDimensi {
    public static void main(String[] args){
        int[][] angka = {{5, 4, 2, 1, 5}, {9, 6, 5, 7, 8}, {5, 2, 1, 5, 10}};
        for(int baris = 0; baris < 3; baris++){
            for(int kolom = 0; kolom < 5; kolom++){
                System.out.print(angka[baris][kolom]+"  ");
            }
            System.out.println("");
        }
    }
    
}
