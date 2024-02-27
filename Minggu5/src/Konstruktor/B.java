/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktor;

/**
 *
 * @author Laura Tita A.G
 */
public class B extends A{
//    super(); Tambahan kode secara otomatis oleh Java untuk memanggil kontruktor dari superClassnya
    B(){
//        konstruktor default dari class A onject dipanggil
        super("test");
        System.out.println("Konstruktor class B dieksekusi ...");
    }
}
