/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import  java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){
    setTitle("My First GUi");
    setSize(200,300);
    setDefaultLookAndFeelDecorated(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(true);
    setForeground(Color.BLUE);
    setVisible(true);
    }
}
