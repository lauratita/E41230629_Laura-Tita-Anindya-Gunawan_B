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
public class BinarySearch {
    public static void main(String[] args){
//        mengurutkan nilai menggunakan selection sort
        Scanner sc = new Scanner(System.in);
        
//        deklarasi variabel menyimpan 
        int temp;
        
//        memasukkan jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = sc.nextInt();
        
        int arr[] = new int[jumlahElemen];
        
//        perulangan untuk memasukkan nilai elemen
        for(int j = 0; j < jumlahElemen; j++){
            System.out.print("Nilai elemen ke-" + (j+1) + " : ");
            arr[j] = sc.nextInt();
        }
        
        //        sorting elemen selection
        for(int i = 0; i < jumlahElemen; i++){
            for(int j = i+1; j < jumlahElemen; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];  
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
//        blueprint setelah selection sort
        System.out.println("Array setelah diurutkan : ");
        for(int i = 0; i < jumlahElemen; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.print("\nMasukkan nilai yang dicari : ");
        int target = sc.nextInt();
        
//        memanggil method sequential sort
        sequentialSearch(arr, target);
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
