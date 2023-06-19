/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class userName {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter the name");
        
        
        for ( int i =0; i <name.length(); i++) {
            System.out.print(name.charAt(i));
        
         
                    
        }
    }
}
