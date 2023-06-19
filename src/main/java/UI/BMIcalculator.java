/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author yuravs
 */
public class BMIcalculator {
    public static void main(String[] args) {
        String heightInput = JOptionPane.showInputDialog("Enter the height in metres");
        String weightInput = JOptionPane.showInputDialog("Enter the weight in KG`s");
        
        
        double height = Double.parseDouble(heightInput);
        double weight =  Double.parseDouble(weightInput);
        
        double bmi;
        bmi = weight/Math.pow(height,2);
        
        System.out.println(bmi);
     
     
                
        
    }
}
