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
public class CheckDivision {
    public static void main(String[] args) {
        double result;
        
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for b"));
        
        if (b !=0)
        {
            result = a / b;
            JOptionPane.showInputDialog (null, "The result is" + result);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This calculation cannot be performed!");
        }
    }
}
