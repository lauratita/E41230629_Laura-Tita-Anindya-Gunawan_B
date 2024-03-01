/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.awt.*;
import java.applet.*;
import javax.swing.JFrame;

/**
 *
 * @author Neendy's
 */
public class DrawShapes extends Applet      {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init(){
        font = new Font("Arial", Font.ITALIC, 18);
        
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        blueColor = new Color(0, 0, 112);
        
        setBackground(backgroundColor);
    }
    
    public void stop(){
        
    }
    
    public void paint(Graphics graph){
//        set font
        graph.setFont(font);
        
//        create a title
        graph.drawString("Draw Shapes", 90, 20);
        
//        set the color for the first shape
        graph.setColor(blueColor);
        
//        draw a rectangle using drawRect
        graph.drawRect(120, 120, 120, 120);
        
//        this will fill a rectangle
        graph.fillRect(115, 115, 90, 90);
        
//        set the color for the next shape
        graph.setColor(redColor);
        
//        draw a circle using drawArc
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
//        set color for next shape
        graph.setColor(Color.CYAN);
        
//        draw another rectangle
        graph.drawRect(50, 50, 50, 50);
        
//        this will fill rectangle
        graph.fillRect(50, 50, 60, 60);
    }
    
    public static  void main(String[] args){
        JFrame frame = new JFrame();
        DrawShapes shape = new DrawShapes();
        shape.init();
        frame.add(shape);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
