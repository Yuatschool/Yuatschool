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
public class averageCalculator {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <=6;i=i + 1) {
            String input = JOptionPane.showInputDialog("Enter a number");
            double num =Double.parseDouble(input);
            double average = (int)(num*100)/100.0;
            total += average;
        }
        
        System.out.println(total/7);
    }      
}
