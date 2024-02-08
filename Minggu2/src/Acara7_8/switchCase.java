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
public class switchCase {
    public static void main(String[] args){
//        membuat variable dan scanner
        String lampu;
        Scanner sc = new Scanner(System.in);
        
//        mengambil input
        System.out.print("Inputkan nama warna : ");
        lampu = sc.nextLine();
        
        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan jalan");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}
