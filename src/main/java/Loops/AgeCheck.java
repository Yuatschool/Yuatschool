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
public class AgeCheck {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        
        if(age > 16)
        {
            System.out.println("You are" + age + "which is over the age limit of 16");
            System.out.println("You may see the movie.");
            //(*)
        }
        else
        {
            System.out.println("You are 16 or under.");
            System.out.println("You may not see the movie");
            
        }
    }    //main method
}       //AgeCheck class     
        
        
        
        
    }
 
}
