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
public class bulan {
    public static void main(String[] args){
        int bulan;
        int hari;
        int tahun;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bulan : ");
        bulan = sc.nextInt();
        System.out.print("Masukkan tahun : ");
        tahun = sc.nextInt();
        
//        if(bulan == Januari || Maret || Mei || Juli || Agustus || Oktober || Desember){
//            hari = 31;
//        }
        
        switch(bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 hari");
                break;
            case 2:
                if(tahun%4 == 0){
                    System.out.println("29 hari");
                }else{
                    System.out.println("28 hari");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 hari");
                break;
            default:
                System.out.println("Nama bulan salah!");
                
        }
    }
}
