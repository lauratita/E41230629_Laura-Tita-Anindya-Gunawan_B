/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara13_14;
import java.util.Scanner;


/**
 *
 * @author Neendy's
 */
public class SelectionSortDesc {
    public static void main(String[] args){
//        SELECTION SORT DESCENDING (DESC)
        Scanner sc = new Scanner(System.in);
        
//        nama variabel
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
        
//        blueprint sebelum selection sort desc
        System.out.println("Array sebelum selection sort DESC : ");
        for(int i = 0; i < jumlahElemen; i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println(" ");
            
//            sorting elemen
        for(int i = 0; i < jumlahElemen; i++){
            for(int j = i+1; j < jumlahElemen; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
//        blueprint setelah selection sort desc
        System.out.println("Array setelah selection sort DESC : ");
        for(int i = 0; i < jumlahElemen; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
