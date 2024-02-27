/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author Laura Tita A.G
 */

//mendeklarasikan class B yang diturunkan dari class A
public class B extends A {
    int z;
    
    void TampilakanJumlah(){
//        subclass dapat mengakses member dari  superclass
        System.out.println("Jumlah : " + (x+y+z));
    }
}
