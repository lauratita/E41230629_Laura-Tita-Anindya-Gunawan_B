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
public class ifElse {
    public static void main (String[] args){
//        membuat variable dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner (System.in);
//        mengambil input
        System.out.print("Inputkan nilai : ");
        nilai = scan.nextInt();
        
//        hitung grade
        if (nilai >= 90){
            grade = "A";
        }else if (nilai >= 80){
            grade = "B+";
        }else if (nilai >= 70){
            grade = "B";
        }else if (nilai >= 60){
            grade = "C+";
        }else if (nilai >= 50){
            grade = "C";
        }else if (nilai >= 40){
            grade = "D";
        }else{
            grade = "E";
        }
        
//        cetak hasil
        System.out.println("Grade = " + grade);
    }
}
