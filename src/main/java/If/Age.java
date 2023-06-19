/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package If;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class Age 
{
    public static void main(String[] args) 
    {
        int age = 0, qty_bought;
        char gender;
        double price;
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        
        if (age >= 6 && age <= 19)
        {
            System.out.println("What school do you go to");
        }    
        else
        {
            System.out.println("You wont like the music");
        }
        
        
    }
    
}    
    
   
    
        
    
