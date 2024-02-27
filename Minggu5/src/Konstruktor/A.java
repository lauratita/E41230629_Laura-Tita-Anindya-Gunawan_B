/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktor;

/**
 *
 * @author Laura Tita A.G
 */
public class A {
//    super(); Tambahan kode secara otomatis oleh Java untuk memanggil Kostruktor dari SuperClassnya
    A(String param1){ //kostruktor untuk class A sudah didefinisikan sehingga Java tidak membuat kostruktor default untuk class ini
        
//        Kostruktor default dari class object dipanggil
//        super();
        System.out.println("Konstruktor class A dengan Parameter " + 
                param1 + "diekseskusi ...");
    }
}
