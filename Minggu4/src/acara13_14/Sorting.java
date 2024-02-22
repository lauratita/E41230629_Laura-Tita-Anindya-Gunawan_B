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
public class Sorting {
    
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0; //tempat penyimpanan sementara(pertukaran)
        
//        membuat berapa banyak perulangan di olah sepanjang length
        for(int i = 0; i < n; i++)
        {
//            
            for(int j = 1; j < (n-i); j++)
            {
//                proses perbandingan. jika nilai di array lebih besar dari j(belakangnya) maka nilai yang di depannya disimpan di temp
//                menyetarakan n-1 dengan sebelumnya, maka si j akan sama dengan di temp
                if(arr[j-1] > arr[j])
                {
//                    swal elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
//    diimplementasikan
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
//        memasukkan jumlah elemen
        System.out.print("Masukkan jumlah elemen : ");
        int jumlahElemen = sc.nextInt();
        
        int arr[] = new int[jumlahElemen];
        
//        perulangan untuk memasukkan nilai elemen
        for(int j = 0; j < jumlahElemen; j++){
            System.out.print("Nilai elemen ke-" + (j+1) + " : ");
            arr[j] = sc.nextInt();
        }
        
//        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        
        System.out.println("Array before bubble sort");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
            
//            sorting array elements using bubble sort/memanggil method bubbleSort
            bubbleSort(arr);
            
            System.out.println("Array after bubble sort");
            
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
    }
    
}
