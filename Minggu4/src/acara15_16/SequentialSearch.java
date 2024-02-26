/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara15_16;
import java.util.Scanner;

/**
 *
 * @author Neendy's
 */
public class SequentialSearch {
    public static void main(String[] args){
//        array satu dimensi
//        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
//        int target = 6;

//        inputan dari keyboard
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = sc.nextInt();
        
        int exampleVariableOne[] = new int[jumlahElemen];
        
        for(int i = 0; i < jumlahElemen; i++){
            System.out.print("Masukkan nilai elemen ke-" + (i+1) + " : ");
            exampleVariableOne[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang dicari : ");
        int target = sc.nextInt();
        
//        memanggil method sequentialSearch
        sequentialSearch(exampleVariableOne, target);
    }
    
//    METHOD
    public static void sequentialSearch(int[] parameterOne, int parameterTwo){
        int index = -1;
        
//        mencari setiap indeks array hingga mencapai indeks terakhir
        for(int i = 0; i < parameterOne.length; i++){
            if(parameterOne[i] == parameterTwo){
//                jika target ditemukan, indeks int ditetapkan sebagai nilai i dan perulangan for dihentikan
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Your target integer does not exist in the array");
        } else {
            System.out.println("Your target integer is in index " + index + " of the array");
        }
    }
}
