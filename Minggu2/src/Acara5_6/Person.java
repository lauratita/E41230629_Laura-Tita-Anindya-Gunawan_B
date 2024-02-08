/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara5_6;

/**
 *
 * @author Neendy's
 */
public class Person {
    String nama;
    int usia;
    
    public Person(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    
    public String getName(){
        return this.nama;
    }
    
    public int getAge(){
        return this.usia;
    }
    
    public void setAge(int usia){
        this.usia = usia;
    }
}
