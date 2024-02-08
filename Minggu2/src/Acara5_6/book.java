/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara5_6;

/**
 *
 * @author Neendy's
 */
public class book {
    int price;
    int pages;
    
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    
    public void show(){
        System.out.println("books information");
        System.out.println("books prices : " +price);
        System.out.println("number of pages : " +pages);
        
    }
}
