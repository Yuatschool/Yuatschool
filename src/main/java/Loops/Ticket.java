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
public class Ticket 
{
    public static void main(String[] args) 
    {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        
        int price;
        
        if (age<12)
        {
            price = 100;
        }
        else
        {
            price = 150;
            
        }
            JOptionPane.showMessageDialog (null,"Your ticket costs R" + price);
    } // end main method
        
    
}
