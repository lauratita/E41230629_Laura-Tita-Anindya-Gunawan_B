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
public class For {
    public static void main(String[] args){
        int bintang;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input tinggi segitiga : ");
        bintang = sc.nextInt();
        
        for(int i = bintang-1; i >=0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
