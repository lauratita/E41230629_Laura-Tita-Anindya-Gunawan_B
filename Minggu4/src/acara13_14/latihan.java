/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara13_14;

/**
 *
 * @author Neendy's
 */
public class latihan {
    public static void main(String[] args){
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
        
        System.out.println("Array before bubble sort");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
//            sorting array elements using bubble sort
            bubbleSort(arr);
            
            System.out.println("Array after bubble sort");
            
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");            
        }
    }
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 1; j < (n-i); j++)
            {
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
}
