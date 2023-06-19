/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class GetMiddle {
    public static void main(String[] args) {
    String name  = JOptionPane.showInputDialog("Give me a random word");
    
    int middleofWordint = name.length() /2;
    char middleofWord = name.charAt(middleofWordint);
    
    System.out.println(middleofWord);
    
    
        
    }
}