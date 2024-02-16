/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara11_12;
import java.util.Scanner;

/**
 *
 * @author Neendy's
 */
public class InputMahasiswa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int jumlah = sc.nextInt();
        
        String mahasiswa[][] = new String[jumlah][3];
        for(int i = 0; i < jumlah; i++) {
            System.out.println("");
            System.out.println("Data mahasiswa ke-" + (i+1));
            
            for(int j = 0; j < 3; j++){
                if (j == 0) System.out.print("NIM : ");
                else if (j == 1) System.out.print("Nama : ");
                else System.out.print("Jurusan : ");
                System.out.print("");
                mahasiswa[i][j] = sc.next();
            }
        }
        System.out.println("");
        System.out.println("Data mahasiswa yang dimasukkan");
        System.out.println("------------------------------");
        System.out.println("NIM \t\t\t NAMA \t\t JURUSAN \t");
        for(int i=0; i<jumlah; i++){
            for(int j=0; j<3; j++){
                System.out.print(mahasiswa[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
    
}
